package VariableDemos;

public class Methodsdemo7b 
{

	public static void main(String[] args)
	{
		System.out.println("main methods of methodsdemo7b");
		Methodsdemo7b m1 = new Methodsdemo7b();
		m1.funB();
		Methodsdemo7b m2 = new Methodsdemo7b();
		m2.funB();
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
