import java.util.LinkedList;
public class LinkedListExample4{
	public static void main(String[] args){
		LinkedList<String> names = new LinkedList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("Pooja");
		System.out.println("Before Removal: " + names);
		System.out.println("First Removal Value: " + names.removeFirst());
		System.out.println("Last Removal Value: " + names.removeLast());
		System.out.println("After Removal: " + names);
	}
}