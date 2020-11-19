package Day7;
//create interface "Game" , have an abstract method "play()". from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
//Now Define one more class 
//public class Demo with main function.
//In this class have a static method "perform" which will take interface reference as parameter.inside "perform()" see to it that any child object passed ,its "play()" method should be invoked. Call "perform()" method from main function.

//abstract static final public 
						//Interface Game
//class Cricket         //class Tennis      // class FootBall
interface Game
{
	int a=0;
	abstract void play();
}


class Cricket implements Game
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Cricket play function");
	}

	
}
class FootBall implements Game
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Football play function");
	}
	
}
class Tennis implements Game
{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Tennis play function");
	}
}

public class Ass3 {
	
	static void perform(Game ref)//Game ref = new Tennis();
	{
		ref.play();
	}
	public static void main(String[] args)
	{
		
		//interface's object cannot be created then how to call its function ??
		perform(new Cricket());
		perform(new FootBall());
		perform(new Tennis());
	}

}
