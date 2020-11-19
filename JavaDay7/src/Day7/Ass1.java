package Day7;
//Define interface "A" with "disp1()" method.
//Derive from "A", interface "B" with "disp2" method.
//Derive class "C" , from "B".
//Instantiate class "C" and call its members as well as derived from parent interfaces.

interface A
{
	 int a=20;
	public abstract void disp1();
}

interface B extends A
{
	int b=30;
	public abstract void disp2();
	
}

class C implements B
{

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("display2"+b);
	}

	@Override
	
	public void disp1() {
		// TODO Auto-generated method stub
		System.out.println("display1"+a);
	}
	
}
public class Ass1 {

	public static void main(String[] args)
	{
		C c= new C();
		c.disp1();
		c.disp2();
		
	}
	
}
