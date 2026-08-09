import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class DesendingArrayListLembda{
	public static void main(String[] args){
		Integer[] num = {5,7,3,8,5,4,1,10};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(num));
		Collections.sort(nums,(a,b)->a-b);
		System.out.println("Sorted Acending: " + nums);
	}
}