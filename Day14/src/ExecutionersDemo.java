import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Threads implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello "+Thread.currentThread());
	}
	
}


public class ExecutionersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService exec= Executors.newCachedThreadPool();
		exec.execute(new Threads());
		exec.shutdown();
		
		
		ExecutorService exec1= Executors.newCachedThreadPool();
		exec1.execute(new Threads());
		exec.shutdown();
	}

}
