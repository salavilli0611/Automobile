package com.session.java8;

public class CheckUserStatus {
	
	public static void main(String sunil[])
	{
		LoadUserDetails userDetails = LoadUserDetails.getInstance();
		userDetails.loadUserDetails();
	
		String userName = "sunil";
		String userRating = userDetails.getUserRating(userName);
		System.out.println(userRating);
		
		userName = "krupa";
		userRating = userDetails.getUserRating(userName);
		System.out.println(userRating);
		
		
		userName = "shivani";
		userRating = userDetails.getUserRating(userName);
		System.out.println(userRating);
	}
	

}
