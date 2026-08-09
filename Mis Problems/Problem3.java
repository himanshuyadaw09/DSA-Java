// Given a list of integers, find the first element that repeats.Return -1 if no such element exists.

import java.util.*;
public class Problem3{

	public static void main(String[] args){
	
		List<Integer> a = new ArrayList<>();
		
		a.add(4);
		a.add(2);
		a.add(5);
		a.add(4);
		a.add(3);
		a.add(2);
	
		System.out.println(a);

		HashSet<Integer> s = new HashSet<>();
		int ans = -1;
		for(int elem: a){
			if(s.contains(elem)){
				ans = elem;
				break;
			}
			s.add(elem);
		}

		System.out.println(ans);
	}
}