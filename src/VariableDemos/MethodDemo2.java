 package VariableDemos;

public class MethodDemo2 
{

	public static void main(String[] args) 
	{
		System.out.println("Main Methods of Methoddemo2");
		//funA();//(NonStatic we can't call in main method)
		//funB();//(NonStatic we can't call in main method)
		funC();//( we can call it because its static )

	}

	void funA()//(NonStatic we can't call in main method)
	{
		System.out.println("funA of MethodDemo2");
	}
	void funB()//(NonStatic we can't call in main method)
	{
		System.out.println("funB of MethodDemo2");
	}
	static void funC()//( we can call it because its static )
	{
		System.out.println("funC of MethodDemo2");

	}
}
