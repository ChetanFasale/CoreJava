//create a multi-threaded application by using  "extends Thread " method.create 2 threads. 
//they should display characters from A to J.
class Th1 extends Thread
{
	public void run()
	{
		char i;
		for(i='a';i<='j';i++)
		{
			System.out.println(i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Ass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Th1 t= new Th1();
		Th1 t1= new Th1();
		t.start();
		t1.start();
		

	}

}
