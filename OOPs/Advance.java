import java.util.Arrays;
class Animal{

	public void speak(){
		System.out.println("Sound");
	}
}

class Dog extends Animal{
	
	@Override
	public void speak(){
		System.out.println("Speak: Bhoo Bhoo!");	
	}
}

class Cat extends Animal{

	@Override
	public void speak(){
		System.out.println("Speak: Meaoo Meaoo!");
	}
}

public class Advance{

	public static void main(String[] args){
		Animal[] zoo = {new Animal(), new Dog(), new Cat()};
		for(Animal a : zoo)
			a.speak();
	}
}