package com.allstate.training.vm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Buses {
	@Id
	private String busId;
	private int modelNo;
	private String busType;
	private String policyNumber;
	private String regNo;
	private String dateOfPurchase;
	private int seatingCapacity;
	

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public String toString() {
		return "Buses [busId=" + busId + ", modelNo=" + modelNo + ", busType=" + busType + ", policyNumber="
				+ policyNumber + ", regNo=" + regNo + ", dateOfPurchase=" + dateOfPurchase + ", seatingCapacity="
				+ seatingCapacity + "]";
	}
	

}
