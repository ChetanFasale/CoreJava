package ExceptionHandling;

public class MyCalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		try {
			int a=c.caldouble(10);
			System.out.println(a);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("Zero not allowed");
		}
		catch(Exception e)
		{
			System.out.println("negative not allowed");
		}
	}

}
