public class Point{
	int x,y;
	// Default Constructor 
	public Point(){
		this.x = 0;
		this.y = 0;
	}

	// Parameterized Constructor 
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString(){
		return "("+x+","+y+")";
	}

	public static void main(String[] args){
		Point p1 = new Point();
		Point p2 = new Point(3,4);
		System.out.println("p1= " + p1);
		System.out.println("p2= " + p2);
	}
}