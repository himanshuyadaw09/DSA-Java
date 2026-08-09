import java.util.Scanner;
public class ThrowsAndThrow{
	public static void checkAge(int age) throws Exception{
		if(age<18){
			throw new Exception("Age shall be greather then 18");
		}
		System.out.println("Valid age!");
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter your age: ");
		int age = sc.nextInt();
		try{
			checkAge(age);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
		}
	}
}