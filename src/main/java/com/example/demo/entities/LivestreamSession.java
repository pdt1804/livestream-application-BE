package com.example.demo.entities;

import java.util.Date;

import com.example.demo.enums.LivestreamStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Livestream_Session")
public class LivestreamSession {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String title;
	private String description;
	private String backgroundImage;
	private Date startTime;
	private Date endTime;
	private LivestreamStatus status;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userName", nullable = false)
	private User user;
	
	public LivestreamSession() {
		
	}

	public LivestreamSession(String id, String title, String description, String backgroundImage, Date startTime,
			Date endTime, LivestreamStatus status, User user) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.backgroundImage = backgroundImage;
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LivestreamStatus getStatus() {
		return status;
	}

	public void setStatus(LivestreamStatus status) {
		this.status = status;
	}
	
}
