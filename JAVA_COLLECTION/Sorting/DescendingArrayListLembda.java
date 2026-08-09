import java.util.*;
public class DescendingArrayListLembda{
	public static void main(String[] args){
		String[] color = {"Red","Green","Black","Blue","Orange"};
		ArrayList<String> colors = new ArrayList<>(Arrays.asList(color));
		System.out.println("Colors Names : " + colors);
		Collections.sort(colors, (a,b) -> a.compareTo(b)); // For Ascending order
		System.out.println("Sorted Acending : " + colors);
		Collections.sort(colors, (a,b) -> b.compareTo(a)); // For Descending order
		System.out.println("Sorted Descending : " + colors);
	}
}