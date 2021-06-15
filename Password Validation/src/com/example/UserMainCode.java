package com.example;

public class UserMainCode {
	
	public static boolean checkPaswword(String password) {
		if(password.length()<8)
		{
			return false;
		}
		else
		{
			if(!(password.contains("@") || password.contains("#")
		              || password.contains("!") || password.contains("~")
		              || password.contains("$") || password.contains("%")
		              || password.contains("^") || password.contains("&")
		              || password.contains("*") || password.contains("(")
		              || password.contains(")") || password.contains("-")
		              || password.contains("+") || password.contains("/")
		              || password.contains(":") || password.contains(".")
		              || password.contains(", ") || password.contains("<")
		              || password.contains(">") || password.contains("?")
		              || password.contains("|")||password.contains("[a-z]")
					||password.contains("[A-Z]")||password.contains("[0-9]")))
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	}
}
