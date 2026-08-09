class Device{
	{
		System.out.println("Device init block");
	}

	public Device(){
		System.out.println("Device Constructor");
	}
}

class Computer extends Device{
	{	
		System.out.println("Computer init block");
	}
	public Computer(){
		System.out.println("Computer Constructor");
	}

}
class Laptop extends Computer{

	public Laptop(){
		System.out.println("This is in Laptop class");
	}
}

public class MultilevelInheritance{
	public static void main(String[] args){
		new Laptop();
	}
}