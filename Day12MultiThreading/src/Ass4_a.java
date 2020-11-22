//create 2 threads. Write a program which displays number 1 to 10 using class lock. 
//[hint:- use "implements Runnable" and synchronized block]
class ThreadDemo4 implements Runnable
	{
	 public void run()             
		{
			synchronized(ThreadDemo4.class)
			{	
				
			
					for(int i=1;i<=10;i++)
					{
						System.out.print(i);
					}
					System.out.print(" ");
				
				
			}
		}
	
	}
public class Ass4_a {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThreadDemo4 th = new ThreadDemo4();
		Thread s1 = new Thread(th);
		Thread s2 = new Thread(th);
		
		s1.start();
		s2.start();
		
		
	}

}
