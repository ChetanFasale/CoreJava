/**
 * 
 */
package OOPS_Concepts;

/**
 * @author fasal
 *
 */

class A
{
	private int  var=200;
	static
	{
		System.out.println("Hi");
	}
	public static void fun()
	{
		System.out.println("inside fun");
	}
}



public class LazyEagerResolution {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=20;
		A ob1=new A();// class cannot be loaded till you make object of the LazyEagerResolution Class
		ob1.fun();
//		ob1.fun();
//		LazyEagerResolution Lazy=new LazyEagerResolution();//if you uncomment this then only class A will be loaded 
//		int num=100;
//		
		
		System.out.println("In main");
		

	}

}
