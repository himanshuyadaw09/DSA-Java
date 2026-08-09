import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class SortArrayList{
	public static void main(String[] args){
		String[] name = {"Pooja","Himanshu","Harshit","Shudhanshu"};
		ArrayList<String> names = new ArrayList<>(Arrays.asList(name));
		Collections.sort(names);
		System.out.println(names);
	}
}