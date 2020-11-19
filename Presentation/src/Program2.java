class Parent
{
	//instance members
		int num=100;
		
		//member functions
		public void addNum(Parent ref)
		{
			ref.num=200;
		}
		public void display()
		{
			System.out.println("Num : "+num);
		}
}

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p= new Parent();
		p.display();
		p.addNum(p);//call by reference
		p.display();
	}
}
