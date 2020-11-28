import java.util.Scanner;

class A
{
	int a=5;
	A()
	{
		System.out.println("A class constructor");
	}
	void display()
	{
		System.out.println("in display of class A");
	}
}
class B
{
	int c=10;
	void display()
	{
		System.out.println("in display of class B");
	}
}

public class Demo {

//	static A a = new A();//Eager Resolution
//	static A a1= new A();
//	B b =new B();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if(i<=99)
        {
        	i=0+i;
        }
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}

}
