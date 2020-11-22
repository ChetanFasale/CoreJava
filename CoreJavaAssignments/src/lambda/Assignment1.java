package lambda;
/*
  1)define a functional interface "First" with an abstract method "void disp1()"
    ,default method "void disp2()" and a static method "void disp3()"
	inside main function using lambda expression invoke "disp1()" and "disp2()"
 methods.
	also invoke "disp3()" method inside main.
 */
public class Assignment1 {

	@FunctionalInterface
	interface First
	{
		public void disp1();
		default void disp2()
		{
			System.out.println("First default disp2");
		}
		static void disp3()
		{
			System.out.println("First static disp3");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First f = new First() {
			
			@Override
			public void disp1() {
				// TODO Auto-generated method stub
				System.out.println("First Abstract disp1");
				
			}
		};//anonymous class
		
		//We cannot access default methods directly
		//in order to call default methods we need to override them in anonymous classes or in child classes
		First ref=()->{First.disp3(); f.disp2(); };
		System.out.println("Implementation of First is defined by Class "+ref.getClass().getName());
		ref.disp1();
	}

}
