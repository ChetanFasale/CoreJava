
class A
{
	
	static int s=8;
	private static int a;
	
	
	static
	{
		System.out.println("in class A ");
	}

	int b,c;
	void setData(int a, int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void getData()
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
	
}

class B
{
	private static int b;
	static int s=10;
	int a,c;
	void setData(int a, int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void getData()
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
}


class C
{
	private static int c;
	static int s=12;//static initializer
	int a,b;
	void setData(int a, int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void getData()
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
}

public class Demo {
	int a=0;
	void display()
	{
		System.out.println("a:"+a);
	}
	public static void main(String args[])
	{
		//4) Define a class "DemoOb". 
		//create an instance of it.
		//now create a reference and assign the reference created in the above statement.
//			Discuss what happens?
		//Now since u have 2 references, take one of the reference and assign a new instance of the class.
//			Discuss what happens?
		//(For ur discussion, write necessary comments in the program)
//		Demo demoob=new Demo();//created instance of Demo
//
//		Demo reference=demoob;
//		reference.a=20;
//		reference.display();
//		demoob.display();
//		demoob.a=40;
//		demoob.display();
		
	
//		5) Define 3 classes A , B and C
//		 in all these classes create static and nonstatic variables as well as methods.
//		 Now Define a class "Demo" ,in which define "main" function. 
//		From this main function try to access all the members of A ,B  and C.

		
		
		
		
		
		
		
		A a=new A();
		a.setData(2, 3, 4);
		a.getData();
		System.out.println("Static variable of A :"+A.s);
		B b=new B();
		b.setData(4, 5, 6);
		b.getData();
		System.out.println("Static variable of B :"+B.s);
		C c= new C();
		c.setData(7, 8, 9);
		c.getData();
		System.out.println("Static variable of C :"+C.s);
	}
}



//6) define static initializers in the above A,B and C classes and check the order of their execution.
