package PackageandException;

public class Calculator {
	int caldouble(int a) throws Exception
	{
		if(a==0)
		{
			throw new NullPointerException();
		}
		else if(a<0)
		{
			throw new Exception(); 
		}
		else
		{
			int c=a+a;
			return c;	
		}
	}
	

}
