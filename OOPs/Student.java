public class Student{
	private String name;
	//Prameterized Constructor 
	public Student(String name){
		this.name = name;
	}
	//No-arg constructor calls the parameterized one 
	public Student(){
		this("Himanshu");
	}
	public void printName(){
		System.out.println("Name: " + this.name);
	}
	public static void main(String[] args){
		new Student().printName(); // objects create without store it 
		new Student("Alice").printName();
	}
}