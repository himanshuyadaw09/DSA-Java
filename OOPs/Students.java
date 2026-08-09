public class Students{

	int age;
	String name;

	public Students(String name , int age){
		this.name = name;
		this.age = age;		
	}

	public Students(){
		this("Unknown",0);
	}

	public Students(String name){
		this(name,0);
	}
	
	public void showInfo(){
		System.out.println("Name: " + name + ", Age: " + age);
	}
	
	 public static void main(String[] args){
		Students s1 = new Students();
		Students s2 = new Students("Alice");
		Students s3 = new Students("Himanshu",19);
	
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
	}	
}