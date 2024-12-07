package com.example.demo.dto;

public class PayloadData {
	private String userName;
	private String answer;
	private String candidate;
	
	public PayloadData() {
		
	}

	public PayloadData(String userName, String answer, String candidate) {
		this.userName = userName;
		this.answer = answer;
		this.candidate = candidate;
	}

	public String getUserName() {
		return userName;
	}

	public String getAnswer() {
		return answer;
	}

	public String getCandidate() {
		return candidate;
	}
	
}
