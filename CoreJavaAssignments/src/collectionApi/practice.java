package collectionApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
class Person1 implements Comparable<Person>
{
	private String name;
	int age;
	public Person1(String name,int age) {
		super();
		this.name = name;
		this.age=age;
	}

	public int compareTo(Person ref)
	{
		if(age>ref.age)
		{
			return 1;
		}
		else if(age<ref.age)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}


	public String toString() {
		return "name=" + name + ", age=" + age;
	}
}


public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1=new Person1("abc",39);
		 Person1 p2=new Person1("xyz",34);
		Map<Person1,String>a=new HashMap<Person1,String>();
		a.put(p1,"abc");
		a.put(p2,"xyz");
		Set<Entry<Person1,String>> set=a.entrySet();//Set Created
		Iterator<Entry<Person1,String>> itr=set.iterator();
		while(itr.hasNext())
		{
			 Entry<Person1, String> e = itr.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}
