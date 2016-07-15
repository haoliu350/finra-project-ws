package com.fitch.rest.bdObject;

public class Combination {
	private String phoneNumber;
	
	public Combination(){
		
	}

	public Combination(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
