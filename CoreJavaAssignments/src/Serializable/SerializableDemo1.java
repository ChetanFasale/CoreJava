package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 1)create a customer class with following attributes
	custid
	custname
	address
	age
create one instance of it and store it in a file. (Serialization).
now open a file, read the object and read its contents . (Deserialization)
 */


class Customer implements Serializable
{
	int custid,age;
	String custname,address;
	public Customer(int custid,int age,String custname,String address) {
		this.custid=custid;
		this.custname=custname;
		this.age=age;
		this.address=address;
}
	
	
	
}
public class SerializableDemo1 {

	public static void main(String[] args) {
		Customer c= new Customer(1, 23, "Chetan", "nashik");
		try(FileOutputStream fos=new FileOutputStream("D:\\CDAC\\temp\\Files\\test.txt"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
				oos.writeObject(c); //Serialization
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		System.out.println(c.custname+"\t"+c.age+"\t"+c.address);
		c=null;
		try(FileInputStream fis=new FileInputStream("D:\\CDAC\\temp\\Files\\test.txt"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				Customer s1=(Customer)ois.readObject();//downcasting
				//Deserialization
				System.out.println(s1.custname+"\t"+s1.age+"\t"+s1.address);
			}
		}
	catch(Exception ee)
	{
		ee.printStackTrace();
	}

	}

}
