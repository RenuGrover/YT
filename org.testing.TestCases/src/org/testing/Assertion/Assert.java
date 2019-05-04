package org.testing.Assertion;

public class Assert 
{
	public static boolean Stringcompare(String actual, String expected)
	{
		if (actual.equals(expected))
		{
			System.out.println("Assertion Pass " +actual + "is equal" +expected);
			return true;
		}
		else
		{
			System.out.println("Assertion failed");
			return false;
		}
	}

}
