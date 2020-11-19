package defaultStaticMethod;

/*
 4) define interface "Base1" with "default void fun1()".
	derive an interface "Sub1" from "Base1" with "default void fun2()"
	derive a class "Sub2" from "Sub1". It should have only "public void fun3()" method.
	inside main function, create an object of "Sub2" and make sure when u invoke "fun3",
	 it should call "Sub1's fun2" which should call "Base1's fun1" method.
*/


interface Base2
{
	default void fun1()
	{
		System.out.println("inside Base1 fun1 method");
	}
}

interface Sub2 extends Base2
{
	default void fun2()
	{
		System.out.println("inside Sub2 fun2 method");
		Base2.super.fun1();
	}
}

class Sub3 implements Sub2
{
	public void fun3()
	{
		System.out.println("inside Sub3 fun3 method");
		Sub2.super.fun2();
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub3 s2 = new Sub3();
		s2.fun3();
	}

}
