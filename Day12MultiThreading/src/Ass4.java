/*create 2 threads. Write a program which displays number 1 to 10 using class lock. 
[hint:- use "implements Runnable" and synchronized block] 
 */

class Impl implements Runnable
{
	
	synchronized static void display()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		display();
	}
	
}

public class Ass4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impl th = new Impl();
		Thread s1 = new Thread(th);
		Thread s2 = new Thread(th);
		
		s1.start();
		s2.start();
	}

}
