package exercicios_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		//https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int produto1, produto2, numero1, numero2;
		double valor1, valor2, total;
				
		produto1 = sc.nextInt();
		numero1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		produto2 = sc.nextInt();
		numero2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = numero1 * valor1 + numero2 * valor2;
		
		System.out.println("Lista:");
		System.out.println(produto1);
		System.out.println(produto2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total );
		
		sc.close();
		
	}

}
