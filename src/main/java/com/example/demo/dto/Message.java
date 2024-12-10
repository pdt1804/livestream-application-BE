package com.example.demo.dto;

public class Message {
	private String viewerName;
	private String content;
	private String livestreamUserName;
	
	public Message() {
		
	}

	public Message(String viewerName, String content, String livestreamUserName) {
		this.viewerName = viewerName;
		this.content = content;
		this.livestreamUserName = livestreamUserName;
	}

	public String getViewerName() {
		return viewerName;
	}

	public String getContent() {
		return content;
	}

	public String getLivestreamUserName() {
		return livestreamUserName;
	}
}
