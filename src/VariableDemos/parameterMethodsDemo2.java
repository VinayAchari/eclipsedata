package VariableDemos;

public class parameterMethodsDemo2
{    

	public static void main(String[] args) 
	{   parameterMethodsDemo2 j = new parameterMethodsDemo2(); 
	    j.fun1();
		j.funA(0,0);
		j.funB(0,false);
		j.funC(00,false);
		j.funD(0.0d,0.0f);
		j.funE(0.0d,0.0f);
		j.funF(10.0);


	}
	void fun1()
	{

		System.out.println(" fun1 of  parameterMethodsDemo1 ");

	}
	void funA(int a,int b)
	{   
		System.out.print("funA of parameterMethodsDemo1 ");
		System.out.println("a");
		System.out.println("b");
	}
	void funB(int a,boolean b)
	{
		System.out.print("funB of parameterMethodsDemo1");
		System.out.println("a");
		System.out.println("b");
	}
	void funC(float a,boolean b)
	{
		System.out.print("funC of parameterMethodsDemo1");
		System.out.println("a");
		System.out.println("b");
	}
	void funD(double a, float b)
	{
		System.out.print("funD of parameterMethodsDemo1");
		System.out.println("a");
		System.out.println("b");
	}void funE(double a, float b)
	{
		System.out.print("funE of parameterMethodsDemo1");
		System.out.println("a");
		System.out.println("b");
	}void funF(double F)
	{
		System.out.print("funF of parameterMethodsDemo1");
		System.out.println("F");
	}
	
                    
}
