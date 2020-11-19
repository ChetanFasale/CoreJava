//Define a class "base1" with only parameterized constructor.
//Derive a class "sub1" from "base1". This class should have following constructors
//	a) Default
//	b) one parameter
//	c) two parameter
//Now try to instantiate "sub1" , using any of the above mentioned constructors.

class Base1
{
	int num1,num2;
	Base1(int a,int b)
	{
		this.num1=a;
		this.num2=b;
		System.out.println("Num1 : "+a+"  Num2 : "+b);
	}
	
}

class Sub1 extends Base1
{
	Sub1()
	{
		super(20,30);
		System.out.println("in base1 constructor");
	}
}


public class Ass8 {
	public static void main(String args[])
	{
		Sub1 s1= new Sub1();
	}

}
