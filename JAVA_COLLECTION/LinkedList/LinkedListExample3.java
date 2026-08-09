import java.util.LinkedList;
public class LinkedListExample3{
	public static void main(String[] args){
		LinkedList<Character> names = new LinkedList<>();
		names.add('H');
		names.addLast('I');
		names.addLast('M');
		names.addLast('A');
		names.addLast('N');
		names.addLast('S');
		names.addLast('H');
		names.addLast('U');
		System.out.println("First Character is : " + names.getFirst());
		System.out.println("Last Character is : " + names.getLast());
		names.set(0,'E');
		System.out.println(names);
	}
}	 