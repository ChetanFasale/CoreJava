package collectionApi;
/*
 * create a hierarchy as follows
	interface Game- play() method
	Derive at least 3 classes from it. ( Cricket, Chess and Football )
Now Create generic class which can take Game type (i.e. any sub type of Game) as parameter.
In this class try to call the play() method of the class which is passed to it.

 */

interface Game
{
	public void play();
}

class Cricket implements Game
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Cricket");
	}
	
}
class Chess implements Game
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Chess");
	}
	
}

class Football implements Game
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Football");
	}
	
}

class generics<T extends Game>
{
	T ob;
	public generics(T ob)
	{
		this.ob=ob;
	}
	public void fun()
	{
		ob.play();
	}
	
}
public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generics<Cricket> c1=new generics<Cricket>(new Cricket());
		c1.fun();

		generics<Football> c2=new generics<Football>(new Football());
		c2.fun();
	}

}
