package collectionApi;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 2) create LinkedList with the values 10,20,30 and 40.
display it.
now insert 500 in the beginning.
	insert 400 at 2nd position.
	add 1000 at the end.
display the list again.
 */
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myLinkedList= new LinkedList<>();
		int c=10;
		for(int i=1;i<=4;i++)
		{
			myLinkedList.add(c);
			c+=10;
		}
		Iterator<Integer> iterator = myLinkedList.iterator();
		((LinkedList)myLinkedList).addFirst(500);
		myLinkedList.add(2, 1000);
		System.out.println(myLinkedList);
		
		
	}

}
