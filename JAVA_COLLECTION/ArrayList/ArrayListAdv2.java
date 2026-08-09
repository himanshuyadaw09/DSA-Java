import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListAdv2{
	public static void main(String[] args){
		String[] cityNames = { "Mumbai","Tokyo","Delhi","Kolkata","Siwan","Patna"};
		ArrayList<String> cities = new ArrayList<>(Arrays.asList(cityNames));
		System.out.println("First Occurrence of 'Tokyo' is at index : " + cities.indexOf("Tokyo"));

	}
}