// Given a list of integers, check if it can be split into two parts such that the sum of both part is equal.

import java.util.*;
public class Problem4{

	public static void main(String[] args){
	
		ArrayList<Integer> l = new ArrayList<>();

		l.add(3);
		l.add(6);
		l.add(2);
		l.add(4);
		l.add(7);

		int total_sum = 0, curr_sum = 0, remaining_sum = 0;
		int flag = 0;
		for(int elem : l){
			total_sum += elem;
		}
		System.out.println(total_sum);
		for(int elem: l){
			curr_sum += elem;
			remaining_sum = total_sum - curr_sum;
		
			if(curr_sum == remaining_sum){
				flag = 1;
				System.out.println("Yes");
				break;
			}
		}

		if(flag==0)
			System.out.println("No");
	}
}