package com.example.demo.dto;

public class RequestData {
	private String userName;
	private String offer;
	
	public RequestData() {
		
	}
	
	public RequestData(String userName, String offer) {
		this.userName = userName;
		this.offer = offer;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}
}
