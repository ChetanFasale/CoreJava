/*create 2 threads
	one thread will display 1 to 50
	second thread will display 50 to 1
both the threads should start simultaneously.

(use implements method)
*/

class ThreadDemo5 implements Runnable
	{
	 public void run()             
		{
			synchronized(ThreadDemo4.class)
			{			
				Thread Th= Thread.currentThread();
//				System.out.println(Th);
				String name = Th.getName();
				
				if(name == "first")
				{
					for(int i=1;i<=10;i++)
					{
						System.out.print(i);
					}
					System.out.print(" ");
				}
				else
				{
					for(int i=10;i>=1;i--)
					{
						System.out.print(i);
					}
					System.out.print(" ");
				}
			}
		}
	}
public class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo5 th = new ThreadDemo5();
		Thread s1 = new Thread(th);
		Thread s2 = new Thread(th);
		
		s1.start();
		s2.start();
		s1.setName("first");
		s2.setName("second");
	}

}
