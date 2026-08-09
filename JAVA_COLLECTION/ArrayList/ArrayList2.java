import java.util.ArrayList;
public class ArrayList2{
	public static void main(String[] args){
		ArrayList <Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(19);
		System.out.println("Before removes: " + numbers);
		numbers.remove(3); // remove element present at index 3
		System.out.println("After removes: " + numbers);
	}
}