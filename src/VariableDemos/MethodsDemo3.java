package VariableDemos;

public class MethodsDemo3 
{

	public static void main(String[] args) 
	{
		System.out.print(" main Method of MethodsDemo3 ");
		funB();
		System.out.println("done");
	}
	static void funA()
	{
		System.out.println("fun A of MethodsDemo3 ");
	}
	static void funB()
	{
		System.out.println("fun  of MethodsDemo3 ");
		funA();
	}
}
