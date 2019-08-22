package com.session.java8;

public class userDetails {

	
	
	String userName;
	String userRating;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRating() {
		return userRating;
	}
	public void setUserRating(String userRating) {
		this.userRating = userRating;
	}

	userDetails(String name,String rating)
	{
		this.userName = name;
		this.userRating = rating;
	}

}
