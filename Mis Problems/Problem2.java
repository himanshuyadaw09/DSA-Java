import java.util.*;
public class Problem2{

	public static void main(String[] args){
	
		ArrayList<Integer> num = new ArrayList<>();

		num.add(5);
		num.add(8);
		num.add(10);
		num.add(3);
		num.add(7);
		num.add(6);
	
		Collections.sort(num,new Comparator<Integer>(){
					public int compare(Integer a,Integer b){
						return b-a;
					}
				});
		System.out.println("Descending Order: " + num);
	}
}