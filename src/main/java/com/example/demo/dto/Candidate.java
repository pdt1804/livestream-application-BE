package com.example.demo.dto;

public class Candidate {
	private String viewerName;
	private String candidate;
	
	public Candidate() {

	}

	public Candidate(String viewerName, String candidate) {
		this.viewerName = viewerName;
		this.candidate = candidate;
	}

	public String getViewerName() {
		return viewerName;
	}

	public String getCandidate() {
		return candidate;
	}
	
}
