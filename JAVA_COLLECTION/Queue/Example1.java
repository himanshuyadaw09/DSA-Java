import java.util.*;
public class Example1{
	public static void main(String[] args){
		
		Queue<String> days = new LinkedList<>();
		
		days.offer("Monday");
		days.offer("Tuesday");
		days.offer("Wednesday");
		days.offer("Thursday");
		days.offer("Friday");
		days.offer("Saturday");
		days.offer("Sunday");
		
		while(!days.isEmpty()){
			System.out.println(days.remove());
		}
	}
}
