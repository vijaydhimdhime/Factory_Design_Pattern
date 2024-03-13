package com.vijay.Factory_Design_Pattern;

public class Employee_Factory {
	public static Employee geteEmployee(String empType)
	{
		if(empType == "AndroidDeveloper")
		{
			return new AndroidDeveloper();
		}
		else if (empType == "WebDeveloper") {
			return new WebDeveloper();
		}
		else {
			return null;
		}
		
	}

}
