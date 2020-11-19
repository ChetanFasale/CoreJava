package lambda;
/*
 2) define a functional interface "Second" with an abstract method "void disp4()".
	define a class Demo with main function.
	inside main function create two implementations of "Second" using lambda expression and display their names.
 */
@FunctionalInterface
interface Second
{
	public void disp4();
	
}


public class Assignment2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Second ref=()->{System.out.println("first reference inside disp4");};
		Second ref1=()->{System.out.println("second reference inside disp4");};
		System.out.println("First Implementation of interface is defined by Class "+ref.getClass().getName());
		ref.disp4();
		System.out.println("Second Implementation of interface is defined by Class "+ref1.getClass().getName());
		ref1.disp4();
	}

}
