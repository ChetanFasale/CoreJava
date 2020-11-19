//Create a multi-level inheritance , instantiate the child class and observe constructor invocation.Also show, 
//if needed how will u invoke parent class constructor from child class ?

class Parent
{
	Parent()
	{
		System.out.println("Parent constructor");
	}
}

class Child extends Parent
{
	Child(int a)
	{
		System.out.println("child constructor");
	}
}

class Child1 extends Child
{
	Child1()
	{
		super(20);
		System.out.println("child1 constructor");
	}
}


public class Ass1 {

	public static void main(String args[])
	{
		Child1 c = new Child1();
	}
	
}
