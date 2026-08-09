public class FtoC{
	public static void main(String[] args){
		
		/* Tempreature Relation:- 
		   C/100 = (F-32)/180 = (K-273)/100;
		*/
		double f = 96;
		double c = (5*(f-32))/9;
		System.out.printf("Celsius Temp: %.3f",c);
	}
}