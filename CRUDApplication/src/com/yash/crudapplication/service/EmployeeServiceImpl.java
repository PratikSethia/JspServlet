package com.yash.crudapplication.service;

import java.util.List;

import com.yash.crudapplication.dao.EmployeeDao;
import com.yash.crudapplication.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao dao = new EmployeeDao(); 

	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		dao.saveEmployee(employee);
		return true;
	}

	@Override
	public List<Employee> getAllDetails() {
		List<Employee> employees = dao.getAllDetails();
		return employees;
	}

	@Override
	public void deleteEmployee(int []employeeId) {
		dao.deleteEmployee(employeeId);
		
	}

	@Override
	public Employee getEmployeeDetails(int employeeId) {
		Employee employee = dao.getEmployeeDetails(employeeId);
		return employee;
	}

	@Override
	public void updateEmployeeDetails(Employee employee) {
		dao.updateEmployeeDetails(employee);
		
	}

	

}
