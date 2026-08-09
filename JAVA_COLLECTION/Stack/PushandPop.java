import java.util.*;
public class PushandPop{
	public static void main(String[] args){

		Stack<Integer> stack = new Stack<>();

		stack.push(2);
		stack.push(3);
		stack.push(7);
		stack.push(3);
		stack.push(10);
		stack.push(29);
		
		System.out.println("Stack: " + stack);

		int i = 1;
		while(!stack.empty()){
			if(i==1)
				System.out.println(i + "st Element remove is: " + stack.pop());
			else if (i==2)
				System.out.println(i + "nd Element remove is : " + stack.pop());
			else
				System.out.println(i + "th Element remove is : " + stack.pop());
			i++;
		}
		System.out.println("After Pop Operation: " + stack);
	}
}
			