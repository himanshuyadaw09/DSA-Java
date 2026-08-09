import java.util.Scanner;
public class Compare2Number{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		if(a>b)
			System.out.println(a+" is greather");
		else if(a==b)
			System.out.println(a+ " and " +b +" both are equal");
		else
			System.out.println(b + " is greather");

		// using Ternary Operator
		System.out.println("Using Ternary Operator");
		int max_val = (a>b? a:b);
		System.out.println("Greater value is: " + max_val);
	}
}