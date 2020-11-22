package collectionApi;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//3) add 5 numbers inside CopyOnWriteArrayList and 
//show how can you add one more number at the same time of traversal through 
//its iterator.

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteArrayList<Integer> cw = new CopyOnWriteArrayList<>();
		for(int i=1;i<=5;i++)
		{
			cw.add(i);
		}
		Iterator<Integer> iterator = cw.iterator();
		while(iterator.hasNext())//5 values
		{
			cw.add(20);//5 values
			System.out.println(iterator.next());
		}
		iterator=cw.iterator();
		while(iterator.hasNext())
		{
//			cw.add(20);
			System.out.println(iterator.next());
		}
		

	}

}
