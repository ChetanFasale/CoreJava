
class A 
{
	//instance members
	int num=100;
	
	//member functions
	public void addNum(int k)
	{
		num=k;
	}
	public void display()
	{
		System.out.println("Num : "+num);
	}
}


public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new A();
		a.display();
		
		a.addNum(200);//call by value
		a.display();
	}

}
