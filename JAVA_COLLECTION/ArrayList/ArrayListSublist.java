import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListSublist{
	public static void main(String[] args){
		Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
		ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));
		System.out.println("Number List: " + numList);
		// System.out.println("Number SubList: " + numList.subList(1,5));
		List<Integer> sublist = numList.subList(1,5); // 5 Excluded
		System.out.println("Sublist: " + sublist);
	}
}