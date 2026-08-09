import java.util.Scanner;

public class Main{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input: ");

		double x,y;
		int a;
		boolean flage;

		x = sc.nextDouble();
		y = sc.nextDouble();
		a = sc.nextInt();
		flage = sc.nextBoolean();
		sc.close();

		System.out.println("a = " + a);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("flage = " + flage);
	}
}

