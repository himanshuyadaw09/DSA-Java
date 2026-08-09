import java.util.*;
public class Search{
	public static void main(String[] args){

		Stack<String> names = new Stack<>();

		names.push("Pooja");
		names.push("Himanshu");
		names.push("Rudrika");
		names.push("Shivani");
		names.push("Seema");
		
		System.out.println("Stack: " + names);

		System.out.println("Position of 'Pooja' from the top: " + names.search("Pooja"));
	}
}
	
		