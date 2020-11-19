package OOPS_Concepts;



class Person
{
	int id,percetage,age;
	String name,add,diseaseRecord;
	public void getPercentage()
	{
		System.out.println("Perc "+percetage);
	}
	public void getDiseaseRecord()
	{
		System.out.println("Deseae "+diseaseRecord);
	}
	
}
public class AbsDemo {
	
	static int num=10;
	static Person p = new Person();
	public static void main(String[] args)
	{
		
		System.out.println("test"+AbsDemo.num);
		
//		Person p = new Person();
//		p.id=10;
//		p.percetage=70;
//		p.name="chetan";
//		p.age=20;
//		p.diseaseRecord="none";
//		p.add="nashik";
//		p.getDiseaseRecord();
//		p.getPercentage();
	}
}
