import java.util.*;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg){
		super(msg);
	}
}

public class CustomException{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		try{
			if(age<18){
				throw new InvalidAgeException("You are not eligible to vote!");
			}
			else{
				System.out.println("You are eligible to vote!");
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		finally{
			sc.close();
		}
	}
}
			