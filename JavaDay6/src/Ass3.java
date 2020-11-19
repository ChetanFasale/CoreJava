

//Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.

class Father
{
	Father(int b)
	{
		System.out.println("Father Constructor"+b);
	}
}

class Son extends Father
{
	Son()
	{
		super(20);
		System.out.println("Son Constructor");	
	}
}

class Daughter extends Father
{
	Daughter()
	{
		super(20);
		System.out.println("Daughter Constructor");
	}
}

public class Ass3 {
	public static void main(String[] args) {
		Daughter d = new Daughter();
		Son s= new Son();
	}
}
