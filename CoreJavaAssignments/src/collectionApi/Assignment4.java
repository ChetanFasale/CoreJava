package collectionApi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *  create a class "MyClass".
create 5 different objects of it.
add them in a ArrayList.
store ArrayList in file.
Now open a file, read ArrayList and display all objects.
 */

class MyClass implements Serializable
{
	String name="sachin";
	int age=20;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "name :"+name+"  age :"+age;
}	
}
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list = new ArrayList<>();
		for(int i=1;i<=5;i++)
		{
			list.add(new MyClass());
		}
		try(FileOutputStream fos=new FileOutputStream("D:\\CDAC\\temp\\Files\\test.txt"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
				oos.writeObject(list); //Serialization
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		Iterator<Object> iterator = list.iterator();
		while(iterator.hasNext())//5 values
		{
			System.out.println(iterator.next());
		}
		list=null;

		try(FileInputStream fis=new FileInputStream("D:\\CDAC\\temp\\Files\\test.txt"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				List s1=(List)ois.readObject();
//				Deserialization
				Iterator<Object> iterator1 = s1.iterator();
				while(iterator1.hasNext())//5 values
				{
					System.out.println(iterator1.next());
				}
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
	}

}
