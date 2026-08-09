import java.util.Stack;
public class Basic{
	public static void main(String[] args){

		Stack<Integer> stack = new Stack<>();

		stack.push(3);
		stack.push(2);
		stack.push(5);
		stack.push(10);
		stack.push(11);
		stack.push(9);

		System.out.println("Stack:" + stack);
	}
}