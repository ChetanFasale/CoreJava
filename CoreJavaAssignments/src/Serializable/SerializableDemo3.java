package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 Define a class "Car" with
	private int id and private String modelname;
	setters and getters

	create 2 objects of Car and write them inside filesystem and thereafter read both the objects and display.

 */


class Car implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3572372617294530169L;
	private int id;
	private String modelname;
	
	public Car(int id, String modelname) {
		this.id = id;
		this.modelname = modelname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	
}
public class SerializableDemo3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Car c1= new Car(1, "Scorpio");
		Car c2= new Car(2, "Thar");
		try(FileOutputStream fos=new FileOutputStream("D:\\CDAC\\temp\\Files\\test.txt"))
		{
		try(ObjectOutputStream oos=new ObjectOutputStream(fos))
		{
		oos.writeObject(c1); //Serialization
		oos.writeObject(c2);
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
System.out.println(c1.getId());
System.out.println(c1.getModelname());
System.out.println(c2.getId());
System.out.println(c2.getModelname());
		c1=null;
		c2=null;
		

		try(FileInputStream fis=new FileInputStream("D:\\CDAC\\temp\\Files\\test.txt"))
		{
		try(ObjectInputStream ois=new ObjectInputStream(fis))
		{
		Car s1=(Car)ois.readObject();
		Car s2=(Car)ois.readObject();
//Deserialization
		System.out.println(s1.getId());
		System.out.println(s1.getModelname());
		System.out.println(s2.getId());
		System.out.println(s2.getModelname());
		}
		}
	catch(Exception ee)
	{
		ee.printStackTrace();
	}
		
	}

}
