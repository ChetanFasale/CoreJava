package collectionApi;
import java.util.*;
import java.util.Map.Entry;
class Person implements Comparable<Person>
{
	private String name;
	int age;
	public Person(String name,int age) {
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
public class TreemapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("abc",39);
		 Person p2=new Person("xyz",34);
		 TreeMap<Person,Integer>ref1=new TreeMap<Person,Integer>();
		 ref1.put(p1, 100);
		 ref1.put(p2, 200);
		 
		 Set<Entry<Person,Integer>>set=ref1.entrySet();
		 Iterator<Entry<Person,Integer>> itr=set.iterator();
		 while(itr.hasNext())
		 {
			 Entry<Person,Integer> e=itr.next();
			 System.out.println(e.getKey());
			 System.out.println(e.getValue());
		 }
		 
		 
		

	}

}
