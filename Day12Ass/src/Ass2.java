// above program  using "implements Runnable" method.
	class RunThread1 implements Runnable
	{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("First Thread Logic");
			for(char i='a';i<='e';i++)
			{
				System.out.println(i);
				
			}
		}
	}
	
	class RunThread2 implements Runnable
	{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Second Thread Logic");
			for(char i='e';i<='j';i++)
			{
				System.out.println(i);
				
			}
		}
	}
public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunThread1 r1= new RunThread1();
		Thread t1=new Thread(r1);
		t1.start();
		RunThread2 r2= new RunThread2();
		Thread t2=new Thread(r2);
		t2.start();
		
	}

}
