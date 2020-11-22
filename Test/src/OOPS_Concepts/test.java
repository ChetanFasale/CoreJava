package OOPS_Concepts;

public class test 
{

	public static void main(String args[])throws Exception
	{
		String s1="hello";
		String s3=new String("hello");		

		// here if I want to check s1 and s3 equality
		System.out.println(s1.equals(s3));  // true
		System.out.println(s1==s3);   // false
		System.out.println(s1==s3.intern());
//		cs=Class.forName("ClassLock3");
		
	}
}