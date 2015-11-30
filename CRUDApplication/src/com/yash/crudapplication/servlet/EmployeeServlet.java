package com.yash.crudapplication.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.crudapplication.domain.Employee;
import com.yash.crudapplication.service.EmployeeService;
import com.yash.crudapplication.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;
	Employee employee = new Employee();
	EmployeeService employeeService = new EmployeeServiceImpl();
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String buttonValue = request.getParameter("button");
		 if(buttonValue.equalsIgnoreCase("Save")){
			String employeeContact = request.getParameter("employeeContact");
			String employeeAddress = request.getParameter("employeeAddress");
			String employeeName = request.getParameter("employeeName");
			employee.setEmployeeName(employeeName);
			employee.setEmployeeContact(employeeContact);
			employee.setEmployeeAddress(employeeAddress); 
			boolean result = employeeService.addEmployee(employee);
			if(result==true){
				message= "Data Saved Successfully";
				List<Employee> employees = employeeService.getAllDetails();
				request.setAttribute("employees", employees);
				request.setAttribute("message", message);
				request.getRequestDispatcher("/show.jsp").forward(request, response);
				
			}	
		}else if(buttonValue.equalsIgnoreCase("Show Details")){
			List<Employee> employees = employeeService.getAllDetails();
			request.setAttribute("employees", employees);
			request.getRequestDispatcher("/show.jsp").forward(request, response);
			
		}else if(buttonValue.equalsIgnoreCase("Update")){
			String employeeContact = request.getParameter("employeeContact");
			String employeeAddress = request.getParameter("employeeAddress");
			String employeeName = request.getParameter("employeeName");
			HttpSession session = request.getSession();
			int employeeId = Integer.parseInt((String) session.getAttribute("employeeId"));
			
			employee.setEmployeeName(employeeName);
			employee.setEmployeeContact(employeeContact);
			employee.setEmployeeAddress(employeeAddress); 
			employee.setEmployeeId(employeeId);
			employeeService.updateEmployeeDetails(employee);
			List<Employee> employees = employeeService.getAllDetails();
			request.setAttribute("employees", employees);
			request.getRequestDispatcher("/show.jsp").forward(request, response);
		}
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String value = request.getParameter("button");
		System.out.println(value);
		if(value.equalsIgnoreCase("Add")){
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}else if(value.equalsIgnoreCase("Update")){
			String employeeId = request.getParameter("delete");
			HttpSession session = request.getSession();
			session.setAttribute("employeeId", employeeId);
			Employee employee = employeeService.getEmployeeDetails(Integer.parseInt(employeeId));
			request.setAttribute("employee", employee);
			request.getRequestDispatcher("/update.jsp").forward(request, response);
			
		}else if(value.equalsIgnoreCase("Delete")){
			String[] employeeIds = request.getParameterValues("delete");
			int[] ids = new int[employeeIds.length];
			
			for (int i = 0; i < employeeIds.length; i++) {
				ids[i]=Integer.parseInt(employeeIds[i]);				
			}
			
			if(employeeIds.length==0){
				
				message = "Please Click on The CheckBox for delete ";
			}else{
					employeeService.deleteEmployee(ids);
					
				
				
			}
			List<Employee> employees = employeeService.getAllDetails();
			request.setAttribute("employees", employees);
			request.getRequestDispatcher("/show.jsp").forward(request, response);
			
		}else if(value.equalsIgnoreCase("Update and Save")){
		
			
			
		}
		

	}

}
