enum Currency
{
	DOLLAR("USD","$"),RUPEE("INR","R"),EURO("EUR","E");
	
	String code;
	String symbol;
	
	Currency(String code,String symbol){
		this.code = code;
		this.symbol = symbol;
	}

	public String getDetails(){
		return code + " -> " + symbol;
	}
}
public class Enums3{
	public static void main(String[] args){
		System.out.println(Currency.RUPEE.getDetails());
	}
}