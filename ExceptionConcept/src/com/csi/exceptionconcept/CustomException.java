package com.csi.exceptionconcept;

class ValidAGEforVote extends Exception
{
	ValidAGEforVote()
	{
		
	}
	
}
class InValidAgeException  extends Exception
{
	 InValidAgeException(String msg)
	{
		super(msg);
	}
}

public class CustomException {
	static void validate(int age) throws InValidAgeException/* NullPointerException ,ArithmeticException*/
	{
		try
		{
		if(age<18)
		{
			throw new InValidAgeException("NOT VALID");
		}
		else
		System.out.println("WELCOME TO VOTE");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args)
	{
		try
		{
			validate(12);
		}
		catch(Exception e)
		{
		System.out.println("EXCEPTION OCCURED \n " +e);
		}
	}

	}

