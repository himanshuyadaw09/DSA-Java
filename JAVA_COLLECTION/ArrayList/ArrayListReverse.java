import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayListReverse{
	public static void main(String[] args){
		Integer[] num = {4,2,8,5,6,19,2,5,49,30,10};
		ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(num));
		System.out.println("List: " + numList);
		Collections.reverse(numList);
		System.out.println("Reversed List: " + numList);

	}
}