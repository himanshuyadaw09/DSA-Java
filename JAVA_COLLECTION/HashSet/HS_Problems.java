import java.util.*;
public class HS_Problems{
	public static void main(String[] args){

		HashSet<Integer> gradeA = new HashSet<>();
		HashSet<Integer> international = new HashSet<>();

		gradeA.add(2);
		gradeA.add(4);
		gradeA.add(5);
		gradeA.add(7);
		gradeA.add(10);
		System.out.println("Roll no who has grade 'A' : " + gradeA);

		international.add(2);
		international.add(8);
		international.add(7);
		international.add(10);
		System.out.println("Going to international trip : " + international);

		HashSet<Integer> gradeA_and_international = new HashSet<>();

		for(int roll : gradeA){
			if(international.contains(roll)){
				gradeA_and_international.add(roll);
			}
		}
		System.out.println("Has gradeA and going to an international trip : " + gradeA_and_international);

		// Method 2 

		HashSet<Integer> common_elem = new HashSet<>(gradeA);
		
		common_elem.retainAll(international);
		
		System.out.println(gradeA);
		System.out.println(international);
		System.out.println(common_elem);
	}
}
				