public class FinallyExample{
	public static void main(String[] args){
		try{
			System.out.println("Inside try block.");
			int result = 10/0;
		
		}
		catch(ArithmeticException e){	
			System.out.println("Exception caught!");
		}
		catch(Exception ex){
			System.out.println("Exception: " + ex.getMessage());
		}
		finally{
			System.out.println("Finally block running");
		}
	}
}
			