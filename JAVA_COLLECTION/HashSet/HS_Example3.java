// Remove a specific element from a HashSet from a HashSet of inteegers and print the updated set.

import java.util.HashSet;
public class HS_Example3{
	public static void main(String[] args){
		HashSet<String> fruits = new HashSet<>();
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		System.out.println("Before Removal: " + fruits);
		System.out.println(fruits.remove("Orange"));
		System.out.println("After Removal: " + fruits);
	}		
}