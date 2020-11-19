//create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
//provide accessor methods on these attributes and allow them to call from outside of your class.
class Shape
{
	private int height,width;//member variable
	
	Shape(int height,int width)//c
	{
		this.height=height;
		this.width=width;
	}
	
	//member functions
	int getHeight()
	{
		return height;
	}
	
	
	int getWidth()
	{
		return width;
	}
}

public class Day2 {
	public static void main(String args[])
	{
		int h,w;
		//1st program
//		Shape s1= new Shape(30,40);//create object
//		Shape s= new Shape(20,30);//create object 
//		h=s.getHeight();
//		System.out.println("height:"+h);
//		w=s.getWidth();
//		System.out.println("width:"+w);
//		h=s1.getHeight();
//		System.out.println("height:"+h);
//		w=s1.getWidth();
//		System.out.println("width:"+w);
		
		//2nd program
//		int a,b;
//		MyClass Myobj= new MyClass(40,50);
//		a=Myobj.getA();
//		b=Myobj.getB();
//		System.out.println("a:"+a);
//		System.out.println("b:"+b);
		
		// 3rd program
		int cnt;
		Emp e=new Emp();
		cnt=e.getCnt();
		System.out.println("cnt :"+cnt);
		
		
		
		
	}
}



//2) Define a class "MyClass" and make sure clients can instantiate it , 
//a) without any argument//default constructor
//b) with one int argument
//c) with two int arguments

class MyClass
{
	private int a,b;
	MyClass()//default constructor
	{
		
	}
	
	MyClass(int a)//constructor with one parameter
	{
		this.a=a;
	}
	
	MyClass(int a,int b)//constructor with two parameter
	{
		this.a=a;
		this.b=b;
	}
	int getA()
	{
		return a;
	}

	int getB()
	{
		return b;
	}
	
}


//3) Define a class "Emp" with private static member "int cnt".
//How will u make sure that outsiders can read the value of cnt ?



class Emp
{
	private static int cnt=10;
	
	int getCnt()
	{
		return cnt;
	}
	
}

//4) Define a class "DemoOb". 
//create an instance of it.
//now create a reference and assign the reference created in the above statement.
//	Discuss what happens?
//Now since u have 2 references, take one of the reference and assign a new instance of the class.
//	Discuss what happens?
//(For ur discussion, write necessary comments in the program)



//Define 3 classes A , B and C
//in all these classes create static and nonstatic variables as well as methods.
//	Now Define a class "Demo" ,in which define "main" function. From this main function try to access all the members of A ,B  and C.


