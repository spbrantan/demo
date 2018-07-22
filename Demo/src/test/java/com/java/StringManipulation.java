package com.java;

public class StringManipulation {

	public static void main(String[] args) {
		//stringComparator();
		stringReversal2 ();
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
	
	public static void stringReversal2 ()
	{
		String str= "bidw shi hso shh";
		String rev= "";
		int i ;
		for ( i =str.length() ; 0<i; i--){
			rev = rev + str.charAt(i-1);
		}
		System.out.println("Rest : "+rev);
	}
	/****
	 * STRING MEMORY ALLOCATION
	 */
	public static void stringComparator()
	{
		//Memory created in string pool where variable pointed to string content
		String s1 = "hello";
		String s2 = "hello";
		
		//Memory created in heap where each string content created separately
		String str1 = new String ("hello");
		String str2= new String ("hello");
		if(str1.equals(str2))
		{
			System.out.println("matching");
		}
	}
}
