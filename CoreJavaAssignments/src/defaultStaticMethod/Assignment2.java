package defaultStaticMethod;
/*
 2) define interface "Third" with "default void disp1()" and "static void disp2()" methods.
	derive a class "Sub" from "Third" ( do not override "disp1")
	inside main function invoke "disp1" and "disp2" methods.
*/

interface Third
{
	default void disp1()
	{
		System.out.println("in disp1");
	}
	static void disp2()
	{
		System.out.println("in disp2");
	}
}


class Sub implements Third
{
	
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		s.disp1();
		Third.disp2();
		
	}

}
