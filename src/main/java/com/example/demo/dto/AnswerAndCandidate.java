package com.example.demo.dto;

public class AnswerAndCandidate {
	private String livestreamUserName;
	private String answer;
	private String candidate;
	private String viewerName;
	
	public AnswerAndCandidate() {

	}

	public AnswerAndCandidate(String livestreamUserName, String answer, String candidate, String viewerName) {
		this.livestreamUserName = livestreamUserName;
		this.answer = answer;
		this.candidate = candidate;
		this.viewerName = viewerName;
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
	
	public String getViewerName() {
		return viewerName;
	}
}
