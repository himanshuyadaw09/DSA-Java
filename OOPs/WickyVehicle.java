public class WickyVehicle{

	String brand;
	int year;

	public WickyVehicle(String b, int y){
		this.brand = b;
		this.year = y;
	}
	
	public void shownInfo(){
		System.out.println("Brand : " + brand + ",	year : " + year);
	}

	public static void main(String[] args){

	WickyVehicle car = new WickyVehicle("Toyota" , 1998);
	WickyVehicle var = new WickyVehicle("Maruti",2000);
	car.shownInfo();
	var.shownInfo();
	}
}
	