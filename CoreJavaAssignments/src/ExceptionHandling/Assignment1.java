package ExceptionHandling;
/*
 * 1)Create abstract base class "Game" with 'play()' as abstract method.
From that derive following classes.
Football,Cricket,Tennis
Create a class called as "Assignment1" (public class)
inside a main method create an array of "Game" (3 elements)
Store objects of Football,Cricket and Tennis respectively.
Now traverse the array and call that Cricket's play() method.
 */
abstract class Game
{
	//concrete method
	public void test()
	{
		
	}
	//contract method
	abstract void play();
}

class Football extends Game
{
	
	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Football Play method");
	}
}
class Cricket extends Game
{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Cricket Play method");
	}
	
}

class Tennis extends Game
{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Tennis Play method");
	}
	
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g[] = new Game[3];
		
		g[0]=new Cricket();
		g[0].play();
		g[1]=new Football();
		g[1].play();
		g[2]=new Tennis();
		g[2].play();
	}

}
