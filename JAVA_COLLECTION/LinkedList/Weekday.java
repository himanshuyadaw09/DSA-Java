import java.util.LinkedList;
public class Weekday{
	public static void main(String[] args){
		LinkedList<String> weeks = new LinkedList<>();
		weeks.add("Monday");
		weeks.addLast("Tuesday");
		weeks.addLast("Wednesday");
		weeks.addLast("Thursday");
		weeks.addLast("Friday");
		weeks.addLast("Saturday");
		weeks.addLast("Sunday");
		
		for( String days: weeks)
			System.out.println("Day - " + days);
	}
}