package entities_exe4;

public class CurrencyConverter {
	public static double valor;
	public static double quantity;
	public static double iof = 6;
	
	public static double convertion() {
		return (valor * iof / 100 + valor) * quantity ;
	}
}
