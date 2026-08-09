import java.util.LinkedList;
public class LinkedListExample2{
	public static void main(String[] args){
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(4);
		numbers.addFirst(2);
		numbers.addFirst(5);
		numbers.addFirst(29);
		numbers.addLast(39);
		numbers.addLast(10);
		numbers.addLast(30);
		numbers.addLast(50);
		
		System.out.println("Numbers: " + numbers);
	}
}