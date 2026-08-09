class Animal{
	String name;

	public Animal(String name){
		this.name = name;
	}

	public void sound(){
		System.out.println("Animal class sound ");
	}
	
	public void move(){
		System.out.println("Animal class move");
	}
}

class Dog extends Animal{

	public Dog(String name){
		super(name);
	}
	 
	@Override
	public void sound(){
		super.sound();
		System.out.println(name + " Says: Bhoo Bhoo");
	}

	@Override
	public void move(){
		super.move();
		System.out.println(name + " runs");
	}
	
	public void fetch(){
		System.out.println(name + " fetches the ball");
	}
}

public class Inheritance2{
	public static void main(String[] args){
		Dog d1 = new Dog("Buddy");
		d1.sound();
		d1.move();
		d1.fetch();
	}
}