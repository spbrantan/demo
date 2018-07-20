package com.java;

public class StringManipulation {

	public static void main(String[] args) {
		
	}
	
	/**
	 * STRING REVERSAL
	 */
	public void stringReversal()
	{
		String str= "brantan sp";
		String rev = "";
		for (int i =0;i < str.length(); i++)
		{
			rev = rev + str.charAt(str.length()- i-1);
		}
		System.out.println(rev);
	}
}
