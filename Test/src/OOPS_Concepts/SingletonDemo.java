package OOPS_Concepts;

class Singleton
{
	private static Singleton obj = new Singleton();//memory allocated only once 
	
	private Singleton()
	{
		
	}
	
	public static Singleton getSingleton()
	{
		return obj;
	}
	
	public void disp1()
	{
		System.out.println("in disp1");
	}
	
	public void disp2()
	{
		System.out.println("in disp2");
	}
}



public class SingletonDemo {

	public static void main(String args[])
	{
//		Singleton s1= new Singleton(); //cannot create singleton object because constructor is private
		
		Singleton ref= Singleton.getSingleton();//
		ref.disp1();
		ref.disp2();
	}
	
}

