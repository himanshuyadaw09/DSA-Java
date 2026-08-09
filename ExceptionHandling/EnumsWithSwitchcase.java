public class EnumsWithSwitchcase{
	enum Day{ MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY}
	public static void main(String[] args){
		Day exp = Day.MONDAY;
		switch(exp){
			case MONDAY :
				System.out.println("Today is Monday!");
				break;
			case TUESDAY:
				System.out.println("Today is Tuesday!");
				break;
			case WEDNESDAY:
				System.out.println("Today is Wednesday!");
				break;
			case THRUSDAY:
				System.out.println("Today is Thursday!");
				break;
			case FRIDAY:
				System.out.println("Today is Friday!");
				break;
			case SATURDAY:
				System.out.println("Today is Saturday!");
				break;
			case SUNDAY: 
				System.out.println("Today is Sunday!");
				break;
 		}
	}
}