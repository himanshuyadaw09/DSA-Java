public class SwapNumber{
	public static void main(String[] args){
		int a = 5;
		int b = 10;
		System.out.println("Swapping using extra variable!");
		System.out.println("Before Swap a: "+a);
		System.out.println("Before Swap b: "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap a: "+a);
		System.out.println("After Swap b: "+b);
	}
}