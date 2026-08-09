public class CrazyStudent{

	private String name;
	private int marks;
	
	public String getName(){
		return name;
	}

	public void setName(String a){
		this.name = a;
	}

	public int getMarks(){
		return marks;
	}
	public void setMarks(int b){
		this.marks = b;
	}
	
	public CrazyStudent(String a, int b ){
		this.name = a;
		this.marks = b;
	}

	public void display(){
		System.out.println("Name: " + name + ",	Marks: " + marks);
	}
	
	public static void main(String[] args){
	CrazyStudent a = new CrazyStudent("Himanshu",91);
	a.display();
	a.setMarks(78);
	a.setName("Pooja");
	a.display();
	}
}	