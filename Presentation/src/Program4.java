class BaseClass
{
	int num=100;

	BaseClass(int k)
	{
		this.num=k;
		System.out.println("BaseClass parameterized Constructor");
	}
}
class ChildClass extends BaseClass
{
	ChildClass(int k)
	{
		super(20);
		System.out.println("ChildClass Constructor");
	}
}


public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass cc = new ChildClass(20);
		
	}

}
