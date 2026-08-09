public class Problem4{

	static abstract class Vehicle{

		public abstract void start();
	}

	static class Car extends Vehicle{

		@Override
		public void start(){
			System.out.println("Start the Car!");
		}
	}
	
	static class Bike extends Vehicle{

		@Override
		public void start(){
			System.out.println("Start Bike!");
		}
	}

	public static void main(String[] args){
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		v1.start();
		v2.start();
	}
}
