package VariableDemos;

public class parameterMethodsDemo1
{    

	public static void main(String[] args) 
	{   parameterMethodsDemo1 j = new parameterMethodsDemo1(); 
	    j.fun1();
		j.funA(0);
		j.funB(20.f);
		j.funC(100l);
		//j.funD(0);
		j.funE(102);
		j.funF(10.0);


	}
	void fun1()
	{

		System.out.println(" fun1 of  parameterMethodsDemo1 ");

	}
	void funA(int a)
	{   
		System.out.print("funA of parameterMethodsDemo1 ");
		System.out.println("a");
	}
	void funB(float B)
	{
		System.out.print("funB of parameterMethodsDemo1");
		System.out.println("B");
	}
	void funC(long v1 )
	{
		System.out.print("funC of parameterMethodsDemo1");
		System.out.println("vinay");
	}
	void funD(byte D)
	{
		System.out.print("funD of parameterMethodsDemo1");
		System.out.println("D");
	}void funE(float E)
	{
		System.out.print("funE of parameterMethodsDemo1");
		System.out.println("E");
	}void funF(double F)
	{
		System.out.print("funF of parameterMethodsDemo1");
		System.out.println("F");
	}
	
                    
}
