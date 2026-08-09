public class UserInputSim{
	public static void main(String[] args){
		int attempts = 0;
		boolean isLoggedIn = false;
		while( (!isLoggedIn) &&  (attempts<3) )
		{
			// assume we check some condition 
			attempts++;
		}
		System.out.println("Login attempts: " + attempts);
	}
}