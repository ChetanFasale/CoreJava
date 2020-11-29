package TestPackage;

@FunctionalInterface
interface one
{
	public void test();
}

class Sample
{
	public void test()
	{
		System.out.println("test in sample");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one ref=()->{System.out.println("test");};
		Sample s1= new Sample();
		one ref1=s1::test;
		ref1.test();
		ref.test();
	}

}
