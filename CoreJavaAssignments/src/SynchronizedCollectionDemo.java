
import java.util.*;
class HelloThread  
{

 int i=1;
 
  public  void go()
  {
// List arrayList=Collections.synchronizedList(new ArrayList());
	  List<String> arrayList = new ArrayList();
	arrayList.add("hello");

 Thread thread1=new Thread(new Runnable() 
{

  public void run() 
  {
	int size=arrayList.size();	  
try
{
	Thread.sleep(100);
}
catch(InterruptedException ie)
{
	ie.printStackTrace();
}
System.out.println(arrayList.get(size-1));
}
});
 thread1.start();
 Thread thred2=new Thread(new Runnable() 
 {
  public void run() 
  {
	arrayList.remove(0);
  }
 });
 thred2.start();
  }
 }

public class SynchronizedCollectionDemo
{
  public static void main(String[] args)
  {
   HelloThread hello=new HelloThread();
   hello.go();
  }
}