import java.util.*;
public class LogicalProblem{
	public static void main(String[] args){
		
		HashSet<String> names = new HashSet<>();
		
		names.add("Alic");
		names.add("Bob");
		names.add("Charli");
		names.add("Himanshu");
		names.add("Shivank");
		names.add("Shuruti");
		names.add("AJ");
		names.add("Aranva");
		names.add("Ananya");

		System.out.println("Names: " + names);

		HashSet<String> ans = new HashSet<>();

		for(String name : names ){
			if(name.startsWith("A"))
				ans.add(name);
		}
		
		System.out.println("Names Start With 'A' : " + ans);
	}
}