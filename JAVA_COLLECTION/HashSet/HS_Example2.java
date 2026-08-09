// check if a HashSet of strings contains the element "apple".

import java.util.HashSet;
public class HS_Example2{
	public static void main(String[] args){
		HashSet<String> fruits = new HashSet<>();
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		// System.out.println("Is Contains Apple? " + fruits.contains("Apple"));

		boolean hasApple = fruits.contains("Apple");
		System.out.println("Contains 'apple'? " + hasApple);
	}
}