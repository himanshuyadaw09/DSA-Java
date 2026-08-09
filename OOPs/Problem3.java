public class Problem3{

	static class Animal{

		Animal get(){
			return this;
		}
	}
	
	static class Dog extends Animal{
		@Override
		Dog get(){
			return this;
		}
	}

	public static void main(String[] args){
		Animal a = new Animal();
		Animal d = new Dog();
		System.out.println(a.get().getClass().getSimpleName());
		System.out.println(d.get().getClass().getSimpleName());
	}
}