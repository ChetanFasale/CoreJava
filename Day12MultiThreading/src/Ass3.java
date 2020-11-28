//create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere. 
//they should display output "Exec  0" to "Exec 5".
class RunImpl1 implements Runnable
{
	
	@Override
	 synchronized public void run() {
//		synchronized(this)
//		{
			for(int i=0;i<=5;i++)
			{
				System.out.println("Exec "+i);
			}
//		}
	}
	
}
class RunImpl2 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Second Thread Logic");
	}
	
}


public class Ass3 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		RunImpl1 r1= new RunImpl1();
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r1);
		th1.start();
		th2.start();
		
		
	}

}
