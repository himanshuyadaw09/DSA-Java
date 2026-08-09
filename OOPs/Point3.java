class Point3{

	public int x,y;

	public Point3(){
		this(0,0);
	}

	public Point3(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public Point3(Point3 p){
		System.out.println("In Copy Constructor");
		this(p.x,p.y);
	}

	@Override
	public String toString(){
		return "(" + x + ","+ y + ")";
	}
	

	public static void main(String[] args){
		Point3 p1 = new Point3();
		Point3 p2 = new Point3(2,5);
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);

		// copy constructor

		Point3 p3 = new Point3(p2);
		System.out.println("p3: " + p3);
	}
}