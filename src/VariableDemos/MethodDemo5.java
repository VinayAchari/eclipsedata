package VariableDemos;

public class MethodDemo5 
{

	public static void main(String[] args) 
	{
		System.out.println(" main methods of  MethodDemo5 ");
		MethodDemo5 m1= new  MethodDemo5();
		m1.funB();
		System.out.println("done");
	}
	static void funA()
	{
		System.out.println("funA of  MethodDemo5");
	}
	void  funB()
	{
	System.out.println("fun B of  MethodDemo5 ");	
	funA();
	}// every function name before we have to put datatype.
}
