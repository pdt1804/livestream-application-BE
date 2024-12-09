package com.example.demo.dto;

public class Offer {
	private String viewerName;
	private String offer;
	private String livestreamUserName;
	
	public Offer() {

	}

	public Offer(String viewerName, String offer, String livestreamUserName) {
		this.viewerName = viewerName;
		this.offer = offer;
		this.livestreamUserName = livestreamUserName;
	}

	public String getViewerName() {
		return viewerName;
	}

	public String getOffer() {
		return offer;
	}
	
	public String getLivestreamUserName() {
		return livestreamUserName;
	}
}
