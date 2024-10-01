package VariableDemos;

public class odemo2
{     int x,y;
void fun1()
{ 
	x=x+1;
	odemo2 d1= new odemo2();
	d1.x=x+2;
	
	}

public static void main(String[] args) 
{
	odemo2 d1= new odemo2();
	d1.fun1();
	System.out.println(d1.x);
	
	
}

}
