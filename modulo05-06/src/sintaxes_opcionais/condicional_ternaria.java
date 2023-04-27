package sintaxes_opcionais;

import java.util.Scanner;

public class condicional_ternaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble(); //insira um preço
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;//se valor maior que 20, sera aplicado um desconto
		
		System.out.println(preco -= desconto);//valor total com desconto
		sc.close();
	}

}
