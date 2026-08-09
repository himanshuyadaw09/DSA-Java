import java.util.ArrayList;
import java.util.Arrays;
public class ArrayToList{
	public static void main(String[] args){
		Integer[] numbers = {1,2,3,4,5,6};
		ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));
		System.out.println("Converted ArrayList: " + numList);
	}
}