

package com.csi.exceptionconcept;

class NegativeNumber  extends Exception
{
	NegativeNumber(String msg)
	{
		super(msg);
	}
}

public class ThrowThrowsEg {
	static void validate(int j) throws  NullPointerException ,ArithmeticException
	{
		
		if(j>=0)
		{
			//i=j/0;
			try {
				throw new NegativeNumber("NUMBER IS POSITIVE.....");
			} catch (NegativeNumber e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		System.out.println("NUMBER IS NEGATIVE");
	}
	
	
	public static void main(String[] args)
	{
		try
		{
			validate(-8);
		}
		catch(Exception e)
		{
		System.out.println("EXCEPTION OCCURED \n " +e);
		}
	}

	}


