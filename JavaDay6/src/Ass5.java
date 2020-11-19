//create abstract class Shape. declare "draw()" function as abstract.
//From this class define "Triangle","Polygon" and "Circle" .
//create an array of Shape having 3 elements.
//store child objects into this array . and call
//their draw function.

abstract class Shape
{
	int a,b;//it can have member variable or instance variable
	public void disp()
	{
		
	}
	//concrete methods and contract methods
	abstract void draw();
}


class Triangle extends Shape
{
	void draw() {	
		System.out.println("Traingle logic");
	}
}


class Circle extends Shape
{
	void draw() {
		System.out.println("Circle logic");
	}
}


class Polygon extends Shape
{
	void draw() {
		System.out.println("Polygon logic");
	}
}

public class Ass5 {
	
	public static void main(String args[])
	{
		
		
		Shape[] ShapeArray = new Shape[3];//array for shape class objects
		ShapeArray[0]= new Triangle();//Shape s= new Triangle();
		ShapeArray[0].draw();
		ShapeArray[1]= new Circle();
		ShapeArray[1].draw();
		ShapeArray[2]= new Polygon();
		ShapeArray[2].draw();
		}
		
	}


