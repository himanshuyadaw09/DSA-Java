class Animal{
	
	String name;
	
	public Animal(String name){
		this.name = name;
	}

	public void sound(){
		System.out.println("Parent class Sound");
	}
}

class Dog extends Animal{

	public Dog(String name){
		super(name);
	}

	@Override
	public void sound(){
		System.out.println(name + " Say: Woof!");
	}
}

public class Main{
	public static void main(String[] args){

		Dog d1 = new Dog("Buddy");
		d1.sound();
	}
}
