public EncapsulatedPoint{

	private int x; // hidden from outside 
	private int y; // hidden from outside 

	public EncapsulatedPoint(int x, int y){
		this.x = x;
		this.y = y;
	}

	// Controlled Access 
	public int getX(){
		return x;
	}
	public int getY(){
		return y;	
	}
	
	public static void main(String[] args){

		EncapsulatedPoint p = new EncapsulatedPoint(2,3);
		System.out.println("Point: (" + getX() + "," + getY() + ")");
	}
}