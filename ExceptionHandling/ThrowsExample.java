import java.util.Scanner;
public class ThrowsExample{
		public static double div(int a, int b) throws ArithmeticException{
			return a/b;
		}
	public static void main(String[] args){
 		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.printf("Enter 2nd number: ");
		int b = sc.nextInt();
		try{
			System.out.println(div(a,b));
		}
		catch(ArithmeticException ex){
			System.out.println("Exception: " + ex.getMessage());
		}
		finally{
			sc.close();
		}
	}
}
		
		