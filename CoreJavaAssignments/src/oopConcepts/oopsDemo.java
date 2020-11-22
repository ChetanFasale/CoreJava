package oopConcepts;
class Vita
{
	//member variables
	static int prnNo=0,empId=0;
	private int age;
	String Name;
	private String shift;
	private int TotalMarks,salary;
	
	Vita(String Name,int age)
	{
		this.prnNo++;
		this.Name=Name;
		this.age=age;
	}
	Vita(String Name,int age,String shift)
	{
		this.empId++;
		this.Name=Name;
		this.age=age;
		this.shift=shift;
	}

	
	//member function
	public void getCertificate()
	{
		internalMksCal(20, 30, 40);
		System.out.println("Dear Student "+this.Name+" you have successfully passed dac course with "+TotalMarks+" marks");
	}
	public void getSalary()
	{
		salaryCal(20000, 0, 0);
		System.out.println("Dear Teacher "+this.Name+" your salary is "+salary+" rupees");
	}
	//  this is the internal aspect in case of students perspective
	private void internalMksCal(int behaviourMks,int mentorMks,int testMks)
	{
		this.TotalMarks=behaviourMks+mentorMks+testMks;
	}
	
	//  this is the internal aspect in case of Teacher perspective
	private void salaryCal(int basicpay,int hike,int bonus)
	{
		this.salary=basicpay+hike+bonus;
	}
	
	public void Syllabus()
	{
		System.out.println("Core Java + Advanced Java + R programming");
	}
	
	
	//getter and setters
	public int getPrnNo() {
		return prnNo;
	}
	
	public int getAge() {
		return age;
	}

	
	public String getName() {
		return Name;
	}
}


class Dac extends Vita
{
	Dac(String Name, int age) {
		super( Name, age);
		// TODO Auto-generated constructor stub
	}
	Dac(String Name,int age,String shift)
	{
		super(Name,age, shift);
	}
	public void Syllabus()
	{
		System.out.println("Core Java + Advanced Java");
	}
	
	
}

class Dbda extends Vita
{
	Dbda( String Name, int age) {
		super( Name, age);
		// TODO Auto-generated constructor stub
	}
	Dbda(String Name,int age,String shift)
	{
		super(Name,age, shift);
	}
	public void Syllabus()
	{
		System.out.println("Core Java + R programming");
	}
	
}

public class oopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------Abstraction--------------");
		System.out.println("Looking at SMVita college their can be two perspective one is student and another is teacher\n"
				+ "Teacher will look at vita from job perspective whereas Student will look at vita as an Institute\n"
				+ "So for teacher students data like marks is unneccessary and for student data like salary is unneccessary");
		
		//Student Object 
		Vita Student = new Vita("chetan",23);
		
		
		//Teacher Object
		Vita Teacher = new Vita("Nitin Sir",34, "Morning");
		
		System.out.println("---------------Encapsulation--------------");
		System.out.println("Student will not bother about internal marks calculation he will directly get the certificate because it is internal aspect of Vita\n"
							+"Teacher will not bother about salary calculation hw will directly get the salary because it is internal aspect of Vita");
		Student.getCertificate();
		Teacher.getSalary();
		System.out.println("---------------Inheritance--------------");
		System.out.println("Dac and Dbda class will aquire properties of vita means their objects can call non-private and non-static variable and methods"
		+"they can define their own constructor and methods inside their individual classes");
		Dac dac = new Dac("chetan", 34);
		dac.Syllabus();
		
		Dbda dbda = new Dbda("tejas", 45);
		dbda.Syllabus();
		
		System.out.println("---------------Polymorphism--------------");
		System.out.println("Vita is an institute so it is having many courses like dac,dbda "
		+"So if we consider vita's syllabus then it will be combination of all the syllabus courses"
		+"But we need individual syllabus of those courses their we will need polymorphism "
		+"We can achieve it by overriding syllabus method of vita class in dbda and dac classes"
		+"From this we can have separate syllabus for dac class and dbda class");
		Vita dac1 = new Dac("Yogesh", 24);//upcasting we have assigned child class reference in base class reference 
		dac1.Syllabus();// So dac's syllabus method gets called
		
		Vita dbda1= new Dbda("Shubham", 23);
		dbda1.Syllabus();// So dbda's syllabus method gets called
		
	}

}
