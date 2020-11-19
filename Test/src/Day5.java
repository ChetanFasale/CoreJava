import java.lang.reflect.Array;
import java.util.Arrays;

public class Day5 {
//	initialize a single dimension array and sort it in ascending order.
//
//	2) create a class "DemoArr",with the function "disp". create 4 objects of this class in an array.
//	Traverse the array and invoke "disp" on each objects.


	public static void main(String args[])
	{
		int[] arr={5,9,2,1,3};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++)// printing array using for loop 
		{
			for(int j=i;j<arr.length-1;j++)//here we need to take arr.length-1 if not then it will throw array index of bound 
			{
				if(arr[i]>arr[j+1])
				{
					arr[i]=arr[i]+arr[j+1];
					arr[j+1]=arr[i]-arr[j+1];
					arr[i]=arr[i]-arr[j+1];
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));// Array printing using Array class 
		
	}
	
}
