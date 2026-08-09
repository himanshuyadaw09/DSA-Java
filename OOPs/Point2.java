public class Point2{
	int x,y;
	// Default Constructor 
	public Point2(){
		this.x = 0;
		this.y = 0;
	}

	// Parameterized Constructor 
	public Point2(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString(){
		return "x co-ordinate is " + x + ",y co-ordinate is " + y;
	}

	public static void main(String[] args){
		Point2 p1 = new Point2();
		Point2 p2 = new Point2(3,4);
		System.out.println("p1= " + p1);
		System.out.println("p2= " + p2);
	}
}