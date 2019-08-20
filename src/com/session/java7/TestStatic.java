package com.session.java7;

public class TestStatic {
	
	String firstName;
	String lastName;
	static String company = "TCS";
	
	void changeCompany()
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
		TestStatic test1 = new TestStatic("Sunil", "Alavilli");
		test1.publishDetails();
		
		TestStatic test2 = new TestStatic("Anil", "Alavilli");
		TestStatic test3 = new TestStatic("Ayush", "Alavilli");
		
		test2.changeCompany();
		
		test2.publishDetails();
		test3.publishDetails();
		
		
		
	}
}
