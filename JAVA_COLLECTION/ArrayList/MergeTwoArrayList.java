import java.util.ArrayList;
import java.util.Arrays;
public class MergeTwoArrayList{
	public static void main(String[] args){
		String[] namesOne = {"Himanshu","Salendar","Vishal","Biru"};
		ArrayList<String> names1 = new ArrayList<>(Arrays.asList(namesOne));
		String[] namesTwo = {"Pooja","Shivani","Richa","Ananya"};
		ArrayList<String> names2 = new ArrayList<>(Arrays.asList(namesTwo));
		names1.addAll(names2);
		System.out.println("Marged List: " + names1);
	}
}