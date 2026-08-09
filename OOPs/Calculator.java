public class Calculator{
	
	public static int a;
	public static int b;
	
	public int add(int a, int b){
		return a+b;
	}

	public int sub(int a, int b){
		return a-b;
	}
	
	public static void main(String[] args){

		Calculator obj = new Calculator();
		System.out.println("Addition: " + obj.add(3,8));
		System.out.println("Substraction: " + obj.sub(5,2));
	
		Calculator obj2 = new Calculator();
		System.out.println("Addition: " + obj2.add(3,10));
		System.out.println("Substraction: " + obj2.sub(5,4));
	}
}	