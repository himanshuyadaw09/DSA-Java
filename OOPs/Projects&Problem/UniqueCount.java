/* Given an Integer array arr, return true if the number if occurrences of each value in the
	array is unique, otherwise return false. use a HashMap<Integer,Integer> to count 
		frequenceise,then a Set<Integer> to check for duplicate count.
*/

import java.util.*;

public class UniqueCount{

	public static void main(String[] args){

		int[] arr = {1,2,2,1,1,3};
		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int elem : arr){
			hm.put(elem,hm.getOrDefault(elem,0)+1);
		}

		HashSet<Integer> hs = new HashSet<>();
		for(int val : hm.values()){
			hs.add(val);
		}
		if(hs.size() == hm.size()){
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}