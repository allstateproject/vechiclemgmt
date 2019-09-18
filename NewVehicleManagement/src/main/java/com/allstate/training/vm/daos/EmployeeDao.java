package com.allstate.training.vm.daos;

import java.util.List;
import com.allstate.training.vm.entities.Employee;

public interface EmployeeDao {
	
	
	public void addEmployee(Employee e );
	public void updateEmployee(Employee e);
	public void deleteemployee(String id);
	public Employee getEmployeeById(String employeeId);
	public Employee getEmployeeByPhone(long employeePhoneNum);
	public Employee getEmployeeByAadar(long employeeAadharNo);
	public Employee getDriverByDLnum(String DriverDLNum);
	public List<Employee> getEmployeeByType(String Type);
	public List<Employee> getAll();
	
}
