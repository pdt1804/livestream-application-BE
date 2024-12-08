package com.example.demo.dto;

public class OfferAndCandidate {
	private String viewerName;
	private String offer;
	private String candidate;
;
	
	public OfferAndCandidate() {

	}

	public OfferAndCandidate(String viewerName, String offer, String candidate) {
		this.viewerName = viewerName;
		this.offer = offer;
		this.candidate = candidate;
	}

	public String getViewerName() {
		return viewerName;
	}

	public String getOffer() {
		return offer;
	}

	public String getCandidate() {
		return candidate;
	}
	
}
