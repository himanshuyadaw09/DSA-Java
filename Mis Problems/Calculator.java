public static class Calculator{
//sc-> scientific calculator simpC-> simple calculator

	public static class SimpC{
 
		public int add(int x, int y){
			return x+y;
		}

		public double add(double x,double y){
			return x+y;
		}
		
		public int sub(int x,int y){
			return x-y;
		}

		public double sub(double x,double y){
			return x-y;
		}

		public double mul(double x,double y){
			return x*y;
		}

		public double div(double x, double y){
			return x/y;
		}
		
	}

	class SC extends simpC{

	public double power(int x,int y){
		return Math.pow(x,y);
	}

	public double squareRoot(int x){
		return Math.sqrt(x);
	}

	public double log(int x){
		return Math.log(x);
	}

	public double sine(int x){
		return Math.sin(x);
	}

	public double cosine(int x){
		return Math.cos(x);
	}
	
	public double tangent(int x){
		return Math.tan(x);
	}

public static void main(String[] args){
	SimpC c = new SimpC();
	SC sc = new SC();
	
	System.out.println("Simple Calculator-----");

	System.out.println("Addition: " + c.add(5,6));
	System.out.println("Addition: " + c.add(4.3,7));
	System.out.println("Subtraction: " + c.sub(9,4));
	System.out.println("Subtraction: " + c.sub(9.3,2));
	System.out.pritln("Multipliction: " + c.mul(7,5));
	System.out.pritln("Multipliction: " + c.mul(7.2,5));
	System.out.pritln("Divison: " + c.div(7,5));
	System.out.pritln("Divison: " + c.div(7,5.3));

	System.out.println("Scientifi Calculator----");

	System.out.pritln("Logiarithm value: " + sc.log(8));
	System.out.pritln("Power: " + sc.power(2,5));
	System.out.pritln("Square Root : " + sc.squareRoot(25));
	System.out.pritln("Sine Value: " + sc.sine(1));
	System.out.pritln("Cosine Value: " + sc.cosine(2,5));
	System.out.pritln("Tangent Value: " + sc.tangent(2,5));

	