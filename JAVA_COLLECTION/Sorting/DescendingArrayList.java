import java.util.*;
public class DescendingArrayList{
	public static void main(String[] args){
		String[] color = {"Red","Green","Black","Blue","Orange"};
		ArrayList<String> colors = new ArrayList<>(Arrays.asList(color));
		System.out.println(colors);
		Collections.sort(colors, new Comparator<String>()
				{
					public int compare(String a, String b)
					{
						return b.compareTo(a);
					}
				}
					);
		System.out.println(colors);
	}
}