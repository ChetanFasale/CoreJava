//Create a class "Top1" with "disp1()" method.
//From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
//Now show how will u achieve dynamic polymorphism.

class Top1 
{
	public void disp1()
	{
		System.out.println("Inside Top1");
	}
}


class Bottom1 extends Top1
{
	public void disp1()
	{
		System.out.println("Inside Bottom1");
	}
}

class Bottom2 extends Top1
{
	public void disp1()
	{
		System.out.println("Inside Bottom2");
	}
}

class Bottom3 extends Top1
{
	public void disp1()
	{
		System.out.println("Inside Bottom3");
	}
}
public class Ass4 {
	
	static void perform(Top1 ref)//Top1 ref=new Bottom3();
	{
		ref.disp1();
	}
public static void main(String args[])
{
//	Top1 ref=new Top1();
//	ref.disp1();
//	Top1 ref1=new Bottom1();// very time consuming and requires lot of memory used to create references
//	ref1.disp1();
//	Top1 ref2=new Bottom2();
//	ref2.disp1();
//	Top1 ref3=new Bottom3();
//	ref3.disp1();
	// thats why we used below approach
	perform(new Top1());
	perform(new Bottom1());
	perform(new Bottom2());
	perform(new Bottom3());
}
}
