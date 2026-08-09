import java.util.*;
public class LogicalProblem2{
	public static void main(String[] args){

		HashSet<Integer> num1 = new HashSet<>();
		
		num1.add(5);
		num1.add(9);
		num1.add(7);
		num1.add(10);
		num1.add(15);

		HashSet<Integer> num2 = new HashSet<>();
		
		num2.add(3);
		num2.add(4);
		num2.add(9);
		num2.add(10);
		num2.add(7);
		num2.add(6);

		if(num1.equals(num2))
			System.out.println("Boths HashSet is Equal!");
		else 
			System.out.println("HashSet is not Equal!");
	}
}	