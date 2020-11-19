package defaultStaticMethod;
/*5) define interface "FirstOne" with "static void disp1()" method.
class "BaseOne" with "static void disp2()" method.
derive a class "SubOne" from "BaseOne" and "FirstOne"
now define a class Demo in which define "main" method.
inside main show how many ways you can invoke "disp1" and "disp2" methods.*/

interface FirstOne
{
	static void disp1()
	{
		System.out.println("disp1");
	}
}

class BaseOne 
{
	static void disp2()
	{
		System.out.println("disp2");
		
	}
}
class SubOne extends BaseOne implements FirstOne
{
	public void callSuperMethods()
	{
		FirstOne.disp1();
		disp2();
	}
}
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Static method of BaseOne is available to sub class
		
		SubOne.disp2();
		BaseOne.disp2();
		FirstOne.disp1();
		SubOne so= new SubOne();
		so.callSuperMethods();
	
		
	}

}
