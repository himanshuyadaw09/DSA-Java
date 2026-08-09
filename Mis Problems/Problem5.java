//form a list of integers, remove all elements that appear more than once.

import java.util.*;

public class Problem5{

	public static void main(String[] args){

		ArrayList<Integer> l = new ArrayList<>();

		l.add(8);
		l.add(6);
		l.add(4);
		l.add(2);
		l.add(8);
		l.add(4);
		l.add(5);
		l.add(4);
		
		int val = 0;

		HashMap<Integer,Integer> freq = new HashMap<>();
		ArrayList<Integer> res = new ArrayList<>();

		for(int elem : l){
			val = freq.getOrDefault(elem,0);
			freq.put(elem,val + 1);
		}

		for(int elem: l){
			if(freq.get(elem) == 1){
				res.add(elem);
			}
		}
		System.out.println(freq);
		System.out.println(res);
	}
}