package com.example.demo.dto;

public class AnswerAndCandidate {
	private String livestreamUserName;
	private String answer;
	private String candidate;
;
	
	public AnswerAndCandidate() {

	}

	public AnswerAndCandidate(String livestreamUserName, String answer, String candidate) {
		this.livestreamUserName = livestreamUserName;
		this.answer = answer;
		this.candidate = candidate;
	}

	public String getLivestreamUserName() {
		return livestreamUserName;
	}

	public String getAnswer() {
		return answer;
	}

	public String getCandidate() {
		return candidate;
	}
	
}
