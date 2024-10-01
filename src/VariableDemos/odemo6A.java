package VariableDemos;

public class odemo6A
{     int x=4;
A a1 = new A ();
odemo6A d1;


public static void main(String[] args) 
{   System.out.println("main method start");
odemo6A d1= new odemo6A();
System.out.println(d1.x);
System.out.println(d1.d1);
d1.d1=new odemo6A();
d1.d1.d1=new odemo6A();
int x=6;
d1.d1.d1.x=x;
d1.d1.d1.d1=d1;
d1.d1.d1.d1.d1.x=13;
System.out.println(d1.d1.d1.d1.d1.d1.d1.d1.d1.d1.d1.x);
System.out.println(d1);
}

}
