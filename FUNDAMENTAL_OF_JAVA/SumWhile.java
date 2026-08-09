public class SumWhile{
	public static void main(String[] args){
		int sum = 0, k = 1;
		while(k<=10){
			sum+=k;
			k++;
		}
		System.out.println("Sum = " + sum);
	}
}