package com.sample.socgen.SpringFirst;

import org.springframework.beans.factory.annotation.Autowired;

public class Engineer {
	
	Engineer(String un, int uid){
		this.userName = un;
		this.userId = uid;
	
	}

		//@Autowired
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//@Autowired
	private int userId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void doWork() {
		System.out.println("I am a software Engineer");
	}

}
