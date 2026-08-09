class Calculator{
	
	public int add(int a,int b){
		return a+b;
	}
	public int add(int a,int b,int c){
		return a+b+c;
	}
	public double add(double a,double b){
		return a+b;
	}
}
public class CalculatorOverloding{
	public static void main(String[] args){
		Calculator cal = new Calculator();
		System.out.println(cal.add(1,4));
		System.out.println(cal.add(1,4,9));
		System.out.println(cal.add(4,6.3));
	}
}