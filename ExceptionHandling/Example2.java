public class Example2{
	public static void main(String[] args){
		try{
			int[] a = new int[5];
			a[10] = 90;
		}
		catch(ArrayIndexOutOfBoundsException iob){
			System.out.println("IOB Error: " + iob.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println("Error Found: " + e.getMessage());
		}
	}
}