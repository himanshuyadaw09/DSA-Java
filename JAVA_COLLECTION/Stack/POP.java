import java.util.*;
public class POP{
	public static void main(String[] args){

		Stack<String> stack = new Stack<>();

		stack.push("Pooja");
		stack.push("Himanshu");
		stack.push("Rajiv");
		stack.push("Vanshika");
		stack.push("MS Dhoni");

		System.out.println("Satck: " + stack);
		
		System.out.println("Removed Element: " + stack.pop());

		System.out.println("Updated Stack: " + stack);

		System.out.println("Top Element currntly persent in Stack: " + stack.peek());

		if(stack.empty())
			System.out.println("Stack is Empty!");
		else 
			System.out.println("Stack is Not Empty!");
 	}
}