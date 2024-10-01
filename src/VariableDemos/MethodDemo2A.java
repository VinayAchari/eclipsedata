package VariableDemos;

public class MethodDemo2A 
{

	public static void main(String[] args)
	{
		System.out.println("Main Method of MethodDemo2A ");
		MethodDemo2A m1 =new MethodDemo2A ();
		m1.funA();
		//m1.funB();
		func();
		
	}
	
	void funA()
	{
		System.out.println("funA of MethodDemo2A");
	}
   void funB()
   { 
	   System.out.println("funB of MethodDemo2A");
   }
   static void func()
   {
	   System.out.println("funC of MethodDemo2A ");
   }
}
