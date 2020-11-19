
public class DemoArr {
//) create a class "DemoArr",with the function "disp". create 4 objects of this class in an array.
//Traverse the array and invoke "disp" on each objects
	void disp()
	{
		System.out.println("Display");
	}
	
	public static void main(String args[])
	{
		DemoArr[] demo= new DemoArr[4];//array of object 
		System.out.println("Size "+demo.length);
		for(int i=0;i<demo.length;i++)
		{
			demo[i] = new DemoArr();//create object 
			demo[i].disp();
		}
	}
}
