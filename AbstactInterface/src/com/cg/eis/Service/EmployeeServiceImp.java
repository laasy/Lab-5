package com.cg.eis.Service;

public class EmployeeServiceImp implements EmployeeService {

	@Override
	public String validateFields(double salary,String designation) {
		String result;
		if(salary>5000 && salary<20000 && designation.equals("System Associate"))
		{
			result="Scheme C";
		}
		
		else if(salary>=20000 && salary<40000 && designation.equals("Programmer"))
		{
		    result="Scheme B";
		}
		else if(salary>=40000 && designation.equals("Manager"))
		{
			result="Scheme A";
		}
		else
		{
			if(salary<5000 && designation.equals("Clerk"))
			{
			result="No Scheme";
		    }
			else
			{
				result="Error";
			}
		}
		return result;
	}
		

}
