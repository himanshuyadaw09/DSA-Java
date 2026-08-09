class Animal{
	public void speak(){
		System.out.println("Animal class");
	}
}
class Dog extends Animal{
	@Override
	public void speak(){
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal{
	@Override 
	public void speak(){
		System.out.println("Cat Meows");
	}
}
public class Problem2{
	public static void main(String[] args){
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		a1.speak();
		a2.speak();

	}
}