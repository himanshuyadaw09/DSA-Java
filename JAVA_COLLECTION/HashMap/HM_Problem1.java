// construct HashMap of char to int mapping and print the sum of all interger value.

import java.util.HashMap;
public class HM_Problem1{
	public static void main(String[] args){
		HashMap<Character,Integer> numbs = new HashMap<>();
		numbs.put('A',65);
		numbs.put('B',66);
		numbs.put('C',67);
		numbs.put('D',68);
		numbs.put('E',69);

		int sum1=0,sum2=0,sum3=0;

		for( var num: numbs.entrySet())
			sum1 +=num.getValue();
		System.out.println("Sum1: " + sum1);
	
		for( char c : numbs.keySet())
			sum2 +=numbs.get(c);
		System.out.println("Sum2: " + sum2);

		for( int val : numbs.values())
			sum3 +=val;
		System.out.println("Sum3: " + sum3);
	}
}