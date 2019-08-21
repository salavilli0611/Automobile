package com.session.java7;

public class TestStatic {
	
	String firstName;
	String lastName;
	static String company = "TCS";
	
	static void changeCompany()
	{
		company = "Google";
	}
	
	TestStatic(String fn, String ln){  
		firstName = fn;  
		 lastName = ln;  
		 } 
	 
	void publishDetails ()
		{
			System.out.println(firstName+" "+lastName+" "+company);
		}  
	 
	public static void main(String sunil[])
	{
		System.out.println("Welcome to Java 7 Session");
		
		TestStatic test1 = new TestStatic("Sunil", "Alavilli");
		test1.publishDetails();
		
		TestStatic test2 = new TestStatic("Anil", "Alavilli");
		TestStatic test3 = new TestStatic("Ayush", "Alavilli");
		
		TestStatic.changeCompany();
		
		test2.publishDetails();
		test3.publishDetails();
		test1.publishDetails();
		
		
	}
}
