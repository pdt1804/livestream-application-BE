package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	private String userName;
	private String passWord;
	private String nickName;
	private int yearOfBirth;
	
	public User () {
		
	}
	
	public User(String userName, String passWord, String nickName, int yearOfBirth) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.nickName = nickName;
		this.yearOfBirth = yearOfBirth;
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
	
	
}
