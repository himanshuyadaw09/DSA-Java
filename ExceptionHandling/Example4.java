public class Example4{
	public static void main(String[] args){
		try{
			int[] a = new int[5];
			a[6] = 10/0;
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}