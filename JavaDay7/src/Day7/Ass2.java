package Day7;
//Define class "Parent1" with some data.
//Define interface "Parent2" with some data.
//Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.
class Parent1
{
	int a=30;
	public void display() {
		System.out.println("Display of parent1 interface");
	}
}
interface Parent2
{
	int a=20;
	abstract void display();
}

class Child extends Parent1 implements Parent2
{

	@Override
	public void display() {
		System.out.println("Display of parent2 interface");
	}
	
	
}

public class Ass2 {
	public static void main(String[] args)
	{
		Child c= new Child();
		c.display();
	}
}
