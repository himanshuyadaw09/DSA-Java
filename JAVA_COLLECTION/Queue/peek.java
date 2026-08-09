import java.util.*;
public class peek{
	public static void main(String[] args){
	
		Queue<String> students = new LinkedList<>();
	
		students.offer("Himanshi");
		students.offer("Nitya");
		students.offer("Akash");
		students.offer("Suman");
		students.offer("Harry");

		System.out.println("Students Names: " + students);

		System.out.println("Fornt student: " + students.peek());
	}
}
		