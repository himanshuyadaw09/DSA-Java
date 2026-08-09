// create a HashSet of integers and print the set.

import java.util.HashSet;
public class HS_Example1{
	public static void main(String[] args){
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(9);
		numbers.add(5);
		numbers.add(7);
		numbers.add(5);
		numbers.add(11);
		System.out.println("HashSet: " + numbers);
	}
}