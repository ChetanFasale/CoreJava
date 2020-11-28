package collectionApi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * create a HashMap.
store  prn no. and students name of 10 students inside the HashMap.
display it using iterator.
 */
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "chetan");
		map.put(1, "value");
		map.put(1, "value1");
		map.put(2, "medha");
		
		
		Set<Entry<Integer, String>> set=map.entrySet();
		Iterator<Entry<Integer,String>> iterator = set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer,String> me=(Entry<Integer,String>)iterator.next();
			System.out.print(me.getKey()+ ":");
			System.out.println(me.getValue());
		}
	}

}
