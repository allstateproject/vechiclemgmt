package com.allstate.training.vm.services;

import java.util.List;

import com.allstate.training.vm.entities.Employee;
import com.allstate.training.vm.exceptions.BuisnessException;

public interface EmployeeService {
	
	public void addEmployee(Employee e )throws BuisnessException;
	public void updateEmployee(Employee e)throws BuisnessException;
	public void deleteemployee(String id)throws BuisnessException;
	public Employee getEmployeeById(String employeeId)throws BuisnessException;
	public Employee getEmployeeByPhone(long employeePhoneNum)throws BuisnessException;
	public Employee getEmployeeByAadar(long employeeAadharNo)throws BuisnessException;
	public Employee getDriverByDLnum(String DriverDLNum)throws BuisnessException;
	public List<Employee> getEmployeeByType(String Type)throws BuisnessException;
	public List<Employee> getAll()throws BuisnessException;
	
}