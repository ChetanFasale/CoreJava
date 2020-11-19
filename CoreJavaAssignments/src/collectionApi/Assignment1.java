package collectionApi;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 
 1) Accept 10 numbers from user and add them inside the ArrayList.

	using ListIterator display all the numbers bidirectionally.

 */
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<>();
		myList.add("test1");
		myList.add("test2");
		myList.add("test3");
		
		ListIterator<String> iterator= myList.listIterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		while(iterator.hasPrevious())
		{
			System.out.println(iterator.previous());
		}
	}

}
