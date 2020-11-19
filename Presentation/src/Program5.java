class Person
{

	public void display()//overridden method
	{
		System.out.println("in display of Person");
	}

}

class Student extends Person
{
	public void Exam()//custom function
	{
		System.out.println("in test method of student");
	}
	public void display()//overriding method
	{
		System.out.println("in display of Student");
	}
}
class Doctor extends Person
{
	public  void display()//overriding method
	{
		System.out.println("in display of Doctor");
		
	}
}

public class Program5 {
	
public static void perform(Person ref)
{
	if(ref instanceof Student)
	{
		((Student) ref).Exam();//downcasting
	}
	ref.display();//Polymorphic invokation
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		perform(new Person());
		perform(new Student());// Upcasting
		perform(new Doctor());// Upcasting
	}

}
