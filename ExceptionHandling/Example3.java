public class Example3{
	public static void main(String[] args){
		try{
			String s = null;
			s.length();
		}
		catch(ArrayIndexOutOfBoundsException iob){
			System.out.println("IOB Error: " + iob.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println("Error Found: " + e.getMessage());
		}
 		catch(Exception eg){
			System.out.println("Exception!!" + eg.getMessage());
		}
	}
}