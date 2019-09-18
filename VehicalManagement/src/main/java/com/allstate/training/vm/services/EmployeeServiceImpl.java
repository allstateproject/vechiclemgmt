package com.allstate.training.vm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allstate.training.vm.daos.EmployeeDao;
import com.allstate.training.vm.entities.Employee;
import com.allstate.training.vm.exceptions.BuisnessException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	
	public void addEmployee(Employee e)throws BuisnessException {
		// TODO Auto-generated method stub
		
		if((e.getEmployeeType().equalsIgnoreCase("c")) || (e.getEmployeeType().equalsIgnoreCase("d")))
		{
			employeeDao.addEmployee(e);
		}
		throw new BuisnessException("Invalid Type");	
	
	}
	

	public void updateEmployee(Employee e)throws BuisnessException {
		// TODO Auto-generated method stub
		
	}

	public void deleteemployee(String id) throws BuisnessException{
		// TODO Auto-generated method stub

	}

	public Employee getEmployeeById(String employeeId) throws BuisnessException{
		// TODO Auto-generated method stub
		if(!employeeId.isEmpty()) {
		return employeeDao.getEmployeeById(employeeId);
		}else {
			throw new BuisnessException("Employee Id is mandatory");
		}
	}

	public Employee getEmployeeByPhone(long employeePhoneNum)throws BuisnessException {
		// TODO Auto-generated method stub
		
		return employeeDao.getEmployeeByPhone(employeePhoneNum);
	}

	public Employee getEmployeeByAadar(long employeeAadharNo)throws BuisnessException {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByAadar(employeeAadharNo);
	}

	public Employee getDriverByDLnum(String DriverDLNum)throws BuisnessException {
		// TODO Auto-generated method stub
		//Employee e= employeeDao.getDriverByDLnum(DriverDLNum);
		return employeeDao.getDriverByDLnum(DriverDLNum);
	}

	public List<Employee> getEmployeeByType(String Type)throws BuisnessException {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByType(Type);

	}

	public List<Employee> getAll() throws BuisnessException{
		// TODO Auto-generated method stub
	
		if(employeeDao.getAll().isEmpty())
			throw new BuisnessException("list is empty");
		else
			return employeeDao.getAll();
	}
}
