package OOPS_Concepts;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class test 
{
	/*static int  B,H;
	static
	{
		Scanner sc = new Scanner(System.in);
		B=sc.nextInt();
		H=sc.nextInt();
	}*/
	public static void main(String args[])throws Exception
	{
		/*Set<String> hs 
        = new HashSet<String>(); 

    // Elements are added using add() method 
    hs.add("B"); 
    hs.add("B"); 
    hs.add("C"); 
    hs.add("A"); 

    System.out.println(hs); */
		
		
		
		/*
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	         Enter your code here. Print output to STDOUT. 
	        System.out.println(A.length()+B.length());
	        if(A.compareTo(B)==0)
	        {
	            System.out.println("Yes");
	        }
	        else
	        {
	            System.out.println("No");
	        }
	        String firstLetter = A.substring(0, 1);
	        String remainingLetters = A.substring(1, A.length());

	        // change the first letter to uppercase
	        firstLetter = firstLetter.toUpperCase();

	        // join the two substrings
	        String name = firstLetter + remainingLetters;
	        System.out.println("Name: " + name);
	        

	        firstLetter = B.substring(0, 1);
	       remainingLetters = B.substring(1, B.length());

	        // change the first letter to uppercase
	        firstLetter = firstLetter.toUpperCase();

	        // join the two substrings
	        String name1 = firstLetter + remainingLetters;
	        System.out.println("Name: " + name1);

*/
	        
		
		/*String day;
        String input_date="27/11/2020";
 SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
 Date dt1=(Date) format1.parse(input_date);
 DateFormat format2=new SimpleDateFormat("EEEE"); 
 String finalDay=format2.format(dt1);
 System.out.println(finalDay);
       Calendar c = Calendar.getInstance();
       c.setTime(dt1);
       int dayOfWeek = c.DAY_OF_WEEK;
       System.out.println(dayOfWeek);
       Locale local = Locale.i;*/
       
//		System.out.println(B);
/*		String s1="hello";
		String s3=new String("hello");		

		// here if I want to check s1 and s3 equality
		System.out.println(s1.equals(s3));  // true
		System.out.println(s1==s3);   // false
		System.out.println(s1==s3.intern());
//		cs=Class.forName("ClassLock3");
		*/

		/*Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int s1=sc.nextInt();
		System.out.println(s+s1);
*/		
	/*	Employee e1=new Employee("e001",1,10);
		Employee e2=new Employee("e002",1,12);
		Employee e3=new Employee("e003",2,10);
		Employee e4=new Employee("e004",1,13);

		Map<Employee,String> map=new HashMap<Employee,String>();
		map.put(e1,"first");
		map.put(e2,"second");
		map.put(e3,"third");
		map.put(e4,"fourth");

		String val=map.get(e2); 
		System.out.println(val);*/
		
		
	}
}