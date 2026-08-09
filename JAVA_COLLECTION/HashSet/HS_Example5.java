import java.util.*;
public class HS_Example5{
	public static void main(String[] args){
		Integer[] arr = {2,3,7,5,9,10,5,9};
		ArrayList<Integer> numb = new ArrayList<>(Arrays.asList(arr));
		System.out.println("ArrayList Numbers: " + numb);
		HashSet<Integer> numbs = new HashSet<>(numb);
		System.out.println("Unique Element: " + numbs);
	}
}
		