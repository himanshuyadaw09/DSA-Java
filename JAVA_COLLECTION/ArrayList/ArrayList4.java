import java.util.ArrayList;
public class ArrayList4 {
	public static void main(String[] args){
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(3);
		integers.add(5);
		integers.add(8);
		integers.add(30);
		integers.add(20);
		System.out.println("Before Integer List: " + integers);
		integers.set(2,9); // update element 9 at index 2
		System.out.println("After Integer List: " + integers);
	}
}
