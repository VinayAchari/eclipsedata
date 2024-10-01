package VariableDemos;

public class odemo1 
{     int x,y;
    void fun1()
{ 
	x=x+1;
	A a1 = new A();
	a1.i=9;

}
public static void main(String[] args) 
{
	odemo1 d1= new odemo1();
	d1.fun1();
	A a1 = new A();
	System.out.println(a1.i);
}

}
