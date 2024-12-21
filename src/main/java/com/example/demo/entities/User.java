package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	private String userName;
	private String passWord;
	private String nickName;
	private int yearOfBirth;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
	private List<LivestreamSession> sessions;
	
	public User () {
		
	}
	
	public User(String userName, String passWord, String nickName, int yearOfBirth, List<LivestreamSession> sessions) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.nickName = nickName;
		this.yearOfBirth = yearOfBirth;
		this.sessions = sessions;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public List<LivestreamSession> getSessions() {
		return sessions;
	}
	public void setSessions(List<LivestreamSession> sessions) {
		this.sessions = sessions;
	}
}
