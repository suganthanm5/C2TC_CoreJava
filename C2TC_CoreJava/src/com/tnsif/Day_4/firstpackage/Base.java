package com.tnsif.Day_4.firstpackage;

public class Base {
	public int varDefault=10;
	public int varPublic=20;
	public int varProtected=40;
	
	

	public void methodDefault()
	{
		System.out.println("Default access Base class");
		System.out.println("Default Variable : "+varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public access Base class");
		System.out.println("Public Variable : "+varPublic);
	}
	
	public void methodProtected()
	{
		System.out.println("Protected access Base class");
		System.out.println("Protected Variable : "+varProtected);
	}
}




