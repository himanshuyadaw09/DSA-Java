public class Book{

	String title;
	String author;
	
	public Book(){
		this.title = "NA";
		this.author = "NA";
	}

	public Book(String title){
		this.title = title;
		this.author = "NA";
	}

	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public void displayInfo(){
		System.out.println("Book name is: " + title);
		System.out.println("Author name is: " + author);
	}

	public static void main(String[] args){

	System.out.println("B1: ");
	Book b1 = new Book();
	b1.displayInfo();
	
	System.out.println("B2: ");
	Book b2 = new Book("Life of AJ");
	b2.displayInfo();
	
	System.out.println("B3: ");
	Book b3 = new Book("Life of AJ", " Aditya");
	b3.displayInfo();
	}
}