import java.util.Scanner;

public class Day1 {

	
	//argc ->  argument count
//	argv->argument value
	
	public static void main(String[] args) {
		//display a table of a particular number  
//		
//		System.out.println("Enter the number :");
//		Scanner sc= new Scanner(System.in);
//		int number=sc.nextInt();
//		for(int i=1;i<=10;i++)
//		{
//			//type sysout and then press ctrl+space to get System.out.println
//			System.out.println(number*i);
//		}	
		
		//using switch ….case   display whether character is vowel or not.
//		System.out.println("Enter the character :");
		
//		char ch='t';
//		
//		switch(ch)
//		{
//			case 'a': System.out.println("It is vowel");
//				  break;
//			case 'e': System.out.println("It is vowel");
//		  		  break;
//
//			case 'i': System.out.println("It is vowel");
//		          break;
//
//			case 'o': System.out.println("It is vowel");
//		          break;
//
//			case 'u': System.out.println("It is vowel");
//		  		  break;
//			default :System.out.println("It is not a vowel");
//		}
		
				
		//Display numbers  1 to 10 using do…. While loop
		int i = 0;
//		do {
//			i++;
//			System.out.println(i);
//		}while(i<10);
		
		//Display numbers from 3 to 30 except number 24  using while loop.
//		i=2;
//		while(i<30)
//		{
//			i++;
//			if(i!=24)
//			{
//				System.out.println(i);
//			}
//		}
		
		//Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.
		double percentage=50;
		if(percentage>=66)
		{
			System.out.println("Distinction");
		}else if (percentage>=60 && percentage<=65.99)
		{
			System.out.println("First Class");
		}else if(percentage>=50 && percentage<=59.99)
		{
			System.out.println("Second Class");
		}
		else if(percentage>=40 && percentage<=49.99)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}


