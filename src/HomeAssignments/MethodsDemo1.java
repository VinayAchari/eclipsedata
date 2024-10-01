package HomeAssignments;

public class MethodsDemo1 
{  
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean bb;


	public static void main(String[] args) 
	{
		System.out.println("MethodsDemo1");
		MethodsDemo1 m1=new MethodsDemo1( );
		m1. vikram();
		m1.vinay();
		gold();
		byte b=10;
		System.out.println(b);
		short s=20;
		System.out.println(s);
		int  i=30;
		System.out.println(i);
		long l=40;
		System.out.println(l);
		float f=50;
		System.out.println(f);
		double d=60;
		System.out.println(d);
		char c= ' ';
		System.out.println(c);
		boolean q = true;
		System.out.println(q);
		

	}
	

	void vikram()
	{
		System.out.println("vikram of MethodsDemo1");
	}

	void vinay()
	{ 
		System.out.println("vinay of MethodsDemo1");
	}

	static void gold()
	{
		System.out.println("gold of MethodsDemo1");
	}

}
