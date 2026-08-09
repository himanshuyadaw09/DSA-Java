public class SillyAnimal{

	// Instance variales
	String type;
	int age;

	// Method to dispaly details
	public void displayInfo(){
		System.out.println("Type: " + type + "\nAge: " + age);
	}

	public static void main(String[] args){
		// Creating an object of SillyAnimal 
		SillyAnimal a = new SillyAnimal();
		a.type = "Cat";
		a.age = 3;
		a.displayInfo();
	}
}