public class Calculator{
//sc-> scientific calculator simpC-> simple calculator

	static class SimpC{
 
		public static  int add(int x, int y){
			return x+y;
		}

		public static double add(double x,double y){
			return x+y;
		}
		
		public static int sub(int x,int y){
			return x-y;
		}

		public static double sub(double x,double y){
			return x-y;
		}

		public static double mul(double x,double y){
			return x*y;
		}

		public static double div(double x, double y){
			return x/y;
		}
		
	}

	static class SC extends SimpC{

	public static double power(int x,int y){
		return Math.pow(x,y);
	}

	public static double squareRoot(int x){
		return Math.sqrt(x);
	}

	public static double log(int x){
		return Math.log(x);
	}

	public static double sine(int x){
		return Math.sin(x);
	}

	public static double cosine(int x){
		return Math.cos(x);
	}
	
	public static double tangent(int x){
		return Math.tan(x);
	}
}
public static void main(String[] args){
	SimpC c = new SimpC();
	SC sc = new SC();
	
	System.out.println("Simple Calculator-----");

	System.out.println("Addition: " + c.add(5,6));
	System.out.println("Addition: " + c.add(4.3,7));
	System.out.println("Subtraction: " + c.sub(9,4));
	System.out.printf("Subtraction: %.3f \n", c.sub(9.3,2));
	System.out.println("Multipliction: " + c.mul(7,5));
	System.out.println("Multipliction: " + c.mul(7.2,5));
	System.out.println("Divison: " + c.div(7,5));
	System.out.println("Divison: " + c.div(7,5.3));

	System.out.println("Scientifi Calculator----");

	System.out.println("Logiarithm value: " + sc.log(8));
	System.out.println("Power: " + sc.power(2,5));
	System.out.println("Square Root : " + sc.squareRoot(25));
	System.out.println("Sine Value: " + sc.sine(1));
	System.out.println("Cosine Value: " + sc.cosine(0));
	System.out.println("Tangent Value: " + sc.tangent(1));

}
}	