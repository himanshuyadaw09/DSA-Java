public class Example1{
	public static void main(String[] args){
		try{
			int val = 10/0;
		}
		catch(ArrayIndexOutOfBoundsException iob){
			System.out.println("IOB Error: " + iob.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println("Error Found: " + e.getMessage());
		}
	}
}