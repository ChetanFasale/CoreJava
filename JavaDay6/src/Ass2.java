//create a class "Vehicle", define a method "public void start()" in it. From this class derive a class FourWheeler. 
//How will u override "start()" method of parent class ?

class Vehicle
{
	public void start()
	{
		System.out.println("Vehicle Start Lodic");
	}
}

class FourWheeler extends Vehicle
{
	public void start()
	{
		super.start();
		System.out.println("FourWheeler Start Lodic");
	}
}
public class Ass2 {
public static void main(String args[])
{
	FourWheeler fw= new FourWheeler();
	fw.start();
	
}	
}
