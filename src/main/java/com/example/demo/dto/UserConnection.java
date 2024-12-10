package com.example.demo.dto;

public class UserConnection {
	private String viewerName;
	private String livestreamUserName;
	
	public UserConnection() {
		
	}
	
	public UserConnection(String viewerName, String livestreamUserName) {
		this.viewerName = viewerName;
		this.livestreamUserName = livestreamUserName;
	}

	public String getViewerName() {
		return viewerName;
	}

	public String getLivestreamUserName() {
		return livestreamUserName;
	}
}
