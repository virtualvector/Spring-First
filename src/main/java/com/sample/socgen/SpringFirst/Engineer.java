package com.sample.socgen.SpringFirst;

public class Engineer {

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

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
