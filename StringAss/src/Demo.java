
public class Demo {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="test";// It will get stored in string pool inside heap memory
		String s2= new String("test");// it will get stored in heap
		System.out.println(s1==s2);
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1= new StringBuilder(10);
		sb1.append("maharashtra").append("nashik");
		System.out.println(sb1);
//		sb.append("chetan").append("fasale");
//		//System.out.println uses string builder internally
//		System.out.println(new StringBuilder("chetan").append("fasale"));//internally
//		System.out.println("chetan"+"fasale");//users view
		
		 StringBuffer s = new StringBuffer("GeeksGeeks"); 
	        s.insert(5, "for"); 
	        System.out.println(s); // returns GeeksforGeeks 
	  
	        s.insert(0, 5); 
	        System.out.println(s); // returns 5GeeksforGeeks 
	  
	        s.insert(3, true); 
	        System.out.println(s); // returns 5GetrueeksforGeeks 
	  
	        s.insert(5, 41.35d); 
	        System.out.println(s); // returns 5Getr41.35ueeksforGeeks 
	  
	        s.insert(8, 41.35f); 
	        System.out.println(s); // returns 5Getr41.41.3535ueeksforGeeks 
	  
	        char geeks_arr[] = { 'p', 'a', 'w', 'a', 'n' }; 
	  
	        // insert character array at offset 9 
	        s.insert(2, geeks_arr); 
	        System.out.println(s); // returns 5Gpawanetr41.41.3535ueeksforGeeks
		
	}

}
