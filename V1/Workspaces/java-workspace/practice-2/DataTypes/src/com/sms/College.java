package com.sms;

public class College {

	private String name;
	private String type;

	private Address collegeAddress;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setCollegeAddress(Address collegeAddress) {
		this.collegeAddress = collegeAddress;
	}

	public Address getCollegeAddress() {
		return collegeAddress;
	}

}