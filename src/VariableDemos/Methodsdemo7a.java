package VariableDemos;

public class Methodsdemo7a 
{

	public static void main(String[] args)
	{System.out.println("main methods of methodsdemo7");
	Methodsdemo7a m1 = new Methodsdemo7a();
	m1.funB();
	System.out.println("done");
	}
	void funA()
	{
		System.out.println("funA of methodsdemo7");
	}
	void funB()
	{
		System.out.println("funB of methodsdemo7");
		funA();// calling from funb current object//
	}





}
