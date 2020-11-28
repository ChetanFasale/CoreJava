class A1
{
	void display()
	{
		System.out.println("in display of A1");
	}
	void testA1()
	{
		System.out.println("in testA1 of A1");
	}
}

class B1 extends A1
{
	void display()
	{
		System.out.println("in display of B1");
	}
	void testB2()
	{
		
	}
}

public class UpcastingDemo {
	
	public static void main(String[] args) 
	{
		A1 a = new B1();
		//What is the advantage of upcasting
		// We can call overriding method of base class ( i.e method specified in child class) 
		// as well as we can call base class methods 
		
		a.display();
		a.testA1();
	}
}
