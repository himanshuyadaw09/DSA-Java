import java.util.*;
public class Union{
	public static void main(String[] args){

		HashSet<Integer> set1 = new HashSet<>();

		set1.add(3);
		set1.add(5);
		set1.add(7);
		set1.add(10);
		System.out.println("Set 1 : " + set1);

		HashSet<Integer> set2 = new HashSet<>();

		set2.add(1);
		set2.add(3);
		set2.add(5);
		System.out.println("Set 2 : " + set2);

		// Union of 2 set 

		HashSet<Integer> set3 = new HashSet<>(set1);

		for(int elem: set2 )
			set3.add(elem);

		System.out.println("Union of Set 1 and Set 2 : " + set3);

		// Method 2 

		HashSet<Integer> set4 = new HashSet<>(set1);

		set4.addAll(set2);
		System.out.println(set4);
	}
}
		