package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
 * Question

define a class Student 
	rollno
	name
	age
	marks

	parameterized constructor 
	getter methods

	create 5 objects and store them inside list.

	using java8 stream api:

	1) find out name starts with 's'

		hint:- use "filter" to check names start with "s" and "forEach" method to display all those names.

	
	2) how many students got more than 70

		hint: use "filter" and "count"

	3) how many students in between age 22 and 25

		hint: use "filter" and "count"

 */


class Student
{
	int rollno,age,marks;
	String name;
	
	Student(String name,int rollno,int age,int marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.marks=marks;
	}

	public int getRollno() {
		return rollno;
	}

	public int getAge() {
		return age;
	}

	public int getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

//	@Override
//	public String toString() {
//		return name;
//	}
}
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int rn,age,mks;
		List<Student> myList = new ArrayList<>();
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the name");
			name=sc.next();
			System.out.println("Enter the roll number");
			rn=sc.nextInt();
			System.out.println("Enter the age");
			age=sc.nextInt();
			System.out.println("Enter the marks");
			mks=sc.nextInt();
			myList.add(new Student(name, rn, age, mks));
		}
		System.out.println("The students whose name starts from s are :");
		//1st way
		myList.stream().filter((s) -> s.getName().startsWith("s")).forEach(System.out::println);
		//2nd way
		CustomAction c = new CustomAction() ;
		myList.stream().filter((s) -> s.getName().startsWith("s")).forEach(c);
		//3rd way
		myList.stream().filter((s) -> s.getName().startsWith("s")).forEach((s)->System.out.println(s.getName()));
		
		System.out.println("The students with more than 70 marks are :"+myList.stream().filter((s)->s.getMarks()>70).count());
		System.out.println("The students with age between 22 to 25 are :"+myList.stream().filter((s)->s.getAge()>=22 && s.getAge()<=25).count());
	}

}

class CustomAction implements Consumer<Student>
{

	@Override
	public void accept(Student t)
	{
		System.out.println(t.getName());
	}
	
}
