// Implement contains() without using it.

public class Problem{
	public static void main(String[] args){
		String str = "Java Programming";
		String find = "Programming";
		if(str.indexOf(find) == -1)
			System.out.println("false");
		else
			System.out.println("true");
	}
}