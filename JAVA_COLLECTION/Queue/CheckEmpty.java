import java.util.*;
public class CheckEmpty{
	public static void main(String[] args){
	
		Queue<String> to_do_list = new LinkedList<>();
		
		to_do_list.offer("Maths Revision");
		to_do_list.offer("Programming Practices");
		to_do_list.offer("Microprocessor lecture");

		if(to_do_list.isEmpty())
			System.out.println("That's it for today!");
		else
			System.out.println("You need to do some work!");

		for(String today_list : to_do_list)
			System.out.println(today_list);
	}
}