package VariableDemos;

public class odemo2A
{     int x,y;
void fun1()
{ 
	x=x+1;
	odemo2A d1= new odemo2A();
	d1.x=x+2;
	System.out.println(d1.x);
	System.out.println(x);
	}

public static void main(String[] args) 
{
	odemo2A d1= new odemo2A();
	d1.fun1();
	
	
}

}
