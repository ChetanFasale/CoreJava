
class Base
{
	public void display()
	{
		System.out.println("Base Display");
	}
}
class Sub1 extends Base
{
	public void display()
	{
		System.out.println("Sub1 Display");
	}
}

class Sub2 extends Base
{
	public void display()
	{
		System.out.println("Sub2 Display");
	}
}

public class Program3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base arrayObj[]= new Base[3];//Array of Objects
		arrayObj[0]=new Base();
		arrayObj[1]=new Sub1();// Upcasting
		arrayObj[2]=new Sub2();// Upcasting
		
		for(int i=0;i<arrayObj.length;i++)
		{
			arrayObj[i].display();
		}
		
	}
}
