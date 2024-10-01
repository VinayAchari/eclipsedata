package VariableDemos;

public class methodsdemo7 
{

	public static void main(String[] args) 
	{System.out.println(" main method of methodsdemo7 ");
	//m1.funB();
	methodsdemo7 m1 = new methodsdemo7();
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
		methodsdemo7 m1 = new methodsdemo7();
		m1.funA();
	}

}
