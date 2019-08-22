package com.session.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class LoadUserDetails {
	
	public static LoadUserDetails instance = null;

	HashMap<String, String> userRatingDetails = new HashMap<String, String>();
	
	// private constructor
	private LoadUserDetails()
	{
		
	}
	
	
	// one time loading 
	public static LoadUserDetails getInstance() 
	{
		// check if the instance is null 
		// if null then create the class
		if(instance == null)
		{
			instance = new LoadUserDetails();
			
		}
		return instance;
	}
	
	
	// added details to hash map
	// get the user details and load the details
	public void loadUserDetails()
	{
		List<userDetails> detailsList = loadUser(); // sql call
		
		for(userDetails row:detailsList)
		{
			userRatingDetails.put(row.getUserName(), row.getUserRating());
		}
	}
	
	private List<userDetails> loadUser() {
		 userDetails userNew = new userDetails("sunil", "1");
		 userDetails userNew1 = new userDetails("shivani", "4");
		 userDetails userNew2 = new userDetails("krupa", "5");
		 
		 List<userDetails> userDetails = new ArrayList<userDetails>();
		 userDetails.add(userNew);
		 userDetails.add(userNew1);
		 userDetails.add(userNew2);
		 
		 return userDetails;
	}


	// get the user rating
	public String getUserRating(String userName)
	{
		return userRatingDetails.get(userName);
	}
	
}
