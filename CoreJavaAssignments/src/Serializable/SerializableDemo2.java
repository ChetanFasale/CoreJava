package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Person class implements Serializable with
	private String name
	private int age

		getters and setters
		parameterized constructor

Student extends Person
	private int rollno
		getter and setters
		parameterized constructor accepting name,age and rollno
			pass name and age to the super constructor


Demo class with main
	create one object of Student, write it inside file and then read.
 */


class  Person  implements Serializable
{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Student extends Person
{
	private int rollno;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Student(String name, int age,int rollno) {
		super(name, age);
		this.rollno=rollno;
		// TODO Auto-generated constructor stub
	}
	public void readObject()
	{
		
	}
	
}
public class SerializableDemo2 {

	public static void main(String[] args) {

		Student s = new Student("Chetan", 23, 23);
			
		try(FileOutputStream fos=new FileOutputStream("D:\\CDAC\\temp\\Files\\test.txt"))
			{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
			oos.writeObject(s); //Serialization
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(s.getName());
			System.out.println(s.getAge());
			
			s=null;
		
			try(FileInputStream fis=new FileInputStream("D:\\CDAC\\temp\\Files\\test.txt"))
			{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
			Student s1=(Student)ois.readObject();

			System.out.println(s1.getName());
			System.out.println(s1.getAge());}
			}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
	
}
