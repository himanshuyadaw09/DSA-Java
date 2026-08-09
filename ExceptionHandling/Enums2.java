// Converting String to Enum

public class Enums2{
	enum Day{ MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY}
	public static void main(String[] args){

	// 1. Convet name to enum constant
		Day today = Day.valueOf("FRIDAY");

	// 2. Print result 
		System.out.println("Converted: " + today);
	}
}