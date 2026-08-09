class person{

	private String name;
	private int age;

	// getter for name 
	public String getName(){
		return name;
	}
	// setter for name
	public void setName(String name){
		this.name = name;
	}
	// getter for age
	public int getAge(){
		return age;
	}
	// setter for age
	public void setAge(int age){
		this.age = age;
	}
}
public class Persons{
	public static void main(String[] args){

	person p1 = new person();
	p1.setName("Alic");
	p1.setAge(25);
	System.out.println("Name: " + p1.getName());
	System.out.println("Age: " + p1.getAge());
	}
}