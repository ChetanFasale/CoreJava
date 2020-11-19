import java.lang.reflect.*;
import java.util.*;
class one 
{
//	one(int a)
//	{
//		
//	}
	void disp1()
	{
		System.out.println("in disp1");
	}
}
class two
{
	void disp2()
	{
		System.out.println("in disp2");
	}
}
class three
{
	void disp3()
	{
		System.out.println("in disp3");
	}
}

public class Refl5
{
	static Object createObject(String className) 
	{
		Object object = null;
		Constructor c=null;
		try {
			Class classDefinition = Class.forName(className);
			object= classDefinition.newInstance();
			if(object instanceof one)
			{
				System.out.println("");
				((one) object).disp1();
			}
			
			try {
				 c=classDefinition.getDeclaredConstructor(int.class);
//				System.out.println(c);
			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			try {
				object = c.newInstance(2);
				System.out.println(object);
				
			} catch (IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (InstantiationException e) // if there is no default constr
		{
			System.out.println(e);
      	} 
		catch (IllegalAccessException e) // if constr is not accessible i.e private constructor
		{
			System.out.println(e);
      	}
		catch (ClassNotFoundException e)
		{
			System.out.println(e);
     	}
      return object;
   }


	public static void main(String args[])
	{
		try
		{
			
			System.out.println("Enter class name which you want to instantiate");
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			Object ob=createObject(str);
//			if(ob instanceof one)
//			{
//				((one)(ob)).disp1();
//			}
//			else if(ob instanceof two)
//			{
//				((two)(ob)).disp2();
//			}
//			else if(ob instanceof three)
//			{
//				((three)(ob)).disp3();
//			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}