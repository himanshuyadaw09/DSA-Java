abstract class College{

	abstract public void dep();

	public void enroll(){
		System.out.println("Enrollment number: 246301101");
	}
}

class Student extends College{
	
	@Override
	public void dep(){
		System.out.println("CSE");
	}
}

public class Abstraction{

	public static void main(String[] args){
		Student s = new Student();
		s.dep();
		s.enroll();
	}
}