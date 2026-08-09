import java.util.Scanner;
public class Method2{
	public void slove(int n){
		if( n%3==0 && n%5==0 )
			System.out.println("FizzBuzz");
			//break;
		else if( n%3==0)
			System.out.println("Fizz");
		else if( n%5==0)
			System.out.println("Buzz");
		else
			System.out.println("not divisible by 3 and 5");
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Method2 obj_1 = new Method2();
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		obj_1.slove(x);
	}
}