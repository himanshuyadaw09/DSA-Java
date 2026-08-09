public class Person2{

	private String name;

	public String getName(){
		return  name;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public void print(){
		System.out.println("Name: " + name);
	}

	public static void main(String[] args){
		Person2 p1 = new Person2();
		p1.setName("Pooja");
		p1.print();
	}
}