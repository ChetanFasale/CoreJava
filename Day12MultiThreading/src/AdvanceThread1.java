//1) create a multi-threaded application by using Thread pool.
//create 2 threads. 
//each thread should display characters from A to J. 
//[ make sure while one thread executes , other thread should not interfere ]
import java.util.concurrent.*;
class Th_1 implements Runnable
{
    public void run()
	{
		perform();
	}
    static void perform()
	{
    	 synchronized(Th_1.class) 
    	 {
    		 for(char i='a';i<='j';i++)
    		 {
    			 System.out.println(i+"\t"+Thread.currentThread());
    		 }
    	 }
	}
}
		 
public class AdvanceThread1 {

	public static void main(String args[])
	{
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<=1;i++)
		{
			exec.execute(new Th_1());
		}

		exec.shutdown();
	}

}
