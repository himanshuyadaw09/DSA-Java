public class ThrowException{
	public static void main(String[] args){
		try{
			throw new Exception("Custom Exception thrown!");
		}catch(Exception e){
			System.out.println("Caught: " + e.getMessage());
		}
	}
}