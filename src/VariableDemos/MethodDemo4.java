package VariableDemos;

public class MethodDemo4 
{

	public static void main(String[] args) 
	{
		System.out.print(" main Method of MethodsDemo3 ");
		funC();
		System.out.println("done");	
	}
	static void funA()
	{
		System.out.println(" fun a of MethodDemo4 ");
		funC();
	}
	static void funB()
	{
		System.out.println(" fun B of MethodDemo4 ");
		funA();
	} 
	static void funC()
	{
		System.out.println(" fun C of MethodDemo4 ");
		funB();
	} 
}// goes on stack over flow

