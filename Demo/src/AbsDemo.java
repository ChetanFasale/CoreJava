

class Person
{
	//member variables
	int rollNumber,age,idCard,percentage;
	String Name;
	char Address;
	String diseaseRecord;
	//member function
	public int getPercentage()
	{
		return percentage;
	}
	public String getDiseaseRecord()
	{
		return diseaseRecord;
	}
	
	//  this is the internal aspect in case of students perspective
	private int calMarks()
	{
		System.out.println("Logic for calculation of internal marks");
		return 30;
	}
	//	 this is the internal aspect in case of doctors perspective
	private int calBill()
	{
		System.out.println("Logic for calculation bill");
		return 4000;
	}
	//this method is external aspect which is visible to other classes
	public int getInternalMarks()
	{
		int mks=calMarks();
		return mks;
	}
	
	//this method is external aspect which is visible to other classes
	public int getBillAmount()
	{
		int bill=calBill();
		return bill;
	}
	
}

class A
{
	//
}
public class AbsDemo {

	
	A a =new A();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("-------Abstraction-------");
		Person StudentView =new Person();
		//View of student (Abstraction of object in Student's perspective) 
		StudentView.rollNumber=10;
		StudentView.age=20;
		StudentView.Name="chetan";
		StudentView.percentage=68;
		int perc=StudentView.getPercentage();
		System.out.println("Percentage of Student:"+perc);
		
		
		//View of doctor (Abstraction of object in Doctor's perspective)
		Person DoctorsView = new Person();
		DoctorsView.Name="Prasad";
		DoctorsView.age=35;
		DoctorsView.diseaseRecord="Asthma";
		String dRecord=DoctorsView.getDiseaseRecord();
		System.out.println("Disease Record of Patient:"+dRecord);
		
		System.out.println("-------Encapsulation-------");
		//Encapsulation in Students View 
		int mks=StudentView.getInternalMarks();
		System.out.println("Internal Marks of student:"+mks);
		
		//Encapsulation in Doctors View 
		int bill=DoctorsView.getBillAmount();
		System.out.println("Bill amount for patient:"+bill);
		
		
		
		
		
	}

}
