class Base 
{
	public final void disp()
	{
		System.out.println("Sub disp");
	}
}
//class Sub extends Test
//{
//	 private void disp()
//	{
//		System.out.println("Sub disp");
//	}
//}


public class Test extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base ref= new Base();
		ref.disp();
		
	}

}
