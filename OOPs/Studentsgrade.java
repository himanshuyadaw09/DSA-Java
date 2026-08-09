public class Studentsgrade{
	
	String name;
	int rollNo;
	Character grade;
	
	public void showGrade(){
		System.out.println("Student Name: " + name + "	Roll No: " + rollNo + "	Grade: " + grade);
	}
	
	public static void main(String[] args){
	Studentsgrade s1 = new Studentsgrade();
	s1.name = "Pooja";
	s1.rollNo = 1;
	s1.grade = 'A';

	Studentsgrade s2 = new Studentsgrade();
	s2.name = "Himanshi";
	s2.rollNo = 2;
	s2.grade = 'B';
		
	s1.showGrade();
	s2.showGrade();
	}
}
	