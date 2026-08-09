import java.util.*;
public class IteratingStack{
	public static void main(String[] args){

		Stack<String> names = new Stack<>();

		names.push("Pooja");
		names.push("Himanshu");
		names.push("Rudrika");
		names.push("Shivani");
		names.push("Seema");
		
		System.out.println("Stack: " + names);
		
		System.out.println("Printed Element as it stored");
		
		for( String name : names)
			System.out.println(name);
	}
}
	
		