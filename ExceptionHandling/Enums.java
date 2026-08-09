public class Enums{
	enum Day{
	 MONDAY,TUESDAY,WEDNESDAY,
	THRUSDAY,FRIDAY,SATURDAY,SUNDAY
	}
	public static void main(String[] args){
		Day[] days = Day.values();
		for(Day d: days){
			System.out.println(d);
		}
	}
}