public class SwapNumber1{
	public static void main(String[] args){
		int a = 5;
		int b = 10;
		System.out.println("Swapping without using extra variable!");
		System.out.println("Before Swap a: "+a);
		System.out.println("Before Swap b: "+b);
		a = a+b;
		b = a-b; // a+b-b=a
		a = a-b; // a+b-a=b		
		System.out.println("After Swap a: "+a);
		System.out.println("After Swap b: "+b);
	}
}