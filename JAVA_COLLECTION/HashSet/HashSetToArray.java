import java.util.HashSet;
import java.util.Arrays;
public class HashSetToArray{
	public static void main(String[] args){
		HashSet<String> fruits = new HashSet<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		Object[] fruitArray = fruits.toArray();
		System.out.println("Array: " + Arrays.toString(fruitArray));
	}
}