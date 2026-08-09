public class SimpleIntrest{
	public static void main(String[] args){
		double principle = 2000;
		double rate = 5.5; // in%
		int time = 3; // in years
		double si = (principle*rate*time)/100;
		System.out.println("Simple Intrest is : " + si);
	}
}