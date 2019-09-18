package com.allstate.training.vm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="employeeId")
public class Employee extends Users {
	
	private long employeePhoneNum;
	private long employeeAadharNo;
	private String employeeType;
	@Column(nullable=false)
	private String DriverDLNum;
	
	
	public long getEmployeePhoneNum() {
		return employeePhoneNum;
	}
	public void setEmployeePhoneNum(long employeePhoneNum) {
		this.employeePhoneNum = employeePhoneNum;
	}
	public long getEmployeeAadharNo() {
		return employeeAadharNo;
	}
	public void setEmployeeAadharNo(long employeeAadharNo) {
		this.employeeAadharNo = employeeAadharNo;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getDriverDLNum() {
		return DriverDLNum;
	}
	public void setDriverDLNum(String driverDLNum) {
		DriverDLNum = driverDLNum;
	}


}