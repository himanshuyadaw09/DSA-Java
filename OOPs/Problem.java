import java.util.*;

abstract class Shape{

	abstract public void draw();
	
}

class Circle extends Shape{

	@Override
	public void draw(){
		System.out.println("Draw Circle");
	}
}

class Square extends Shape{

	@Override 
	public void draw(){
		System.out.println("Draw Square");
	}
}

public class Problem{
	public static void main(String[] args){
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle();
		shapes[1] = new Square();
		for(Shape shape: shapes)
			shape.draw();
	}
}
