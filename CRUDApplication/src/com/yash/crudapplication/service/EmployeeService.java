package com.yash.crudapplication.service;

import java.util.List;

import com.yash.crudapplication.domain.Employee;

public interface EmployeeService {

	public boolean addEmployee(Employee employee);

	public List<Employee> getAllDetails();

	public void deleteEmployee(int []employeeId);

	public Employee getEmployeeDetails(int employeeId);

	public void updateEmployeeDetails(Employee employee);
}
