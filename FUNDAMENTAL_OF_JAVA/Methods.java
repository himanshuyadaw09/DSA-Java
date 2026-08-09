public class Methods{
	public int sum(int a, int b){
		return a+b;
	}
	public static int multiply(int a,int b){
		return a*b;
	}
	public static void main(String[] args){
		Methods obj_sum = new Methods();
		int x = 3, y = 9;
		int a = obj_sum.sum(x,y);
		System.out.println("Sum of " + x + " and " + y + " is " + a);
		int b = multiply(x,y);
		System.out.println("Multiply of " + x + " and " + y + " is " + b);
	}
}