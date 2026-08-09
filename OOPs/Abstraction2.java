abstract class Shap{

	abstract public double area();
}

class Circle extends Shap{

	double radius;

	public Circle(double r){
		this.radius = r;
	}

	@Override
	public double area(){
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shap{
	double length,breadth;
	public Rectangle(double l, double b){
		this.length = l;
		this.breadth = b;
	}
	@Override
	public double area(){
		return length*breadth;
	}
}
public class Abstraction2{
	public static void main(String[] args){
		Circle c = new Circle(6);
		Rectangle r = new Rectangle(3,8.6);
		System.out.printf("Area of Circle: %.2f\n", c.area());
		System.out.printf("Area of Rectangle: %.2f", r.area());
	}
}