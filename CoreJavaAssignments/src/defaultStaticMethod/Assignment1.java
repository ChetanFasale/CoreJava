package defaultStaticMethod;
/*
 1) define interface "First" with "default void fun()" and interface "Second" with "default void fun()". 
	Now derive a class Child from both these interfaces. 
	Inside main function instantiate Child class instance and invoke "fun" method.
	
*/

interface First
{
	default void fun()
	{
		System.out.println("First Fun Method");
	}
}

interface Second
{
	default void fun()
	{
		System.out.println("Second Fun Method");
	}
}
//if we have multiple inheritance and we have same methods(overriding) in both
//the interfaces then we also have to override that method in child class 
class Child implements First,Second
{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		First.super.fun();
		Second.super.fun();
	}
	
}
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		c.fun();
	}

}
