//create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere. 
//they should display output "Exec  0" to "Exec 5".
class RunImpl1 implements Runnable
{
	
	RunImpl1()
	{
		System.out.println("first");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("First Thread Logic");
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
class RunImpl3 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Third Thread Logic");
	}
	
}

public class Ass3 {
	
	public static void main(String[] args) {
		
		Ass3 a= new Ass3();
		
		// TODO Auto-generated method stub
//		RunImpl1 r1= new RunImpl1();
//		RunImpl2 r2= new RunImpl2();
//		RunImpl3 r3 = new RunImpl3();
//			
//		Thread th1= new Thread(r1);
//		th1.setPriority(Thread.MAX_PRIORITY);
//		Thread th2= new Thread(r2);
//		th2.setPriority(Thread.NORM_PRIORITY);
//		Thread th3= new Thread(r3);
//		th3.setPriority(Thread.MIN_PRIORITY);
//		
//		th1.start();
//		th2.start();
//		th3.start();
	}

}
