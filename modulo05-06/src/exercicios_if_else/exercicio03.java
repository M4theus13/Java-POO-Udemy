package exercicios_if_else;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		//ordem crescente ou decrescente.
		//https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		double div1, div2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		div1 = num1 % num2;
		div2 = num2 % num1;
		
		if(div1 == 0 || div2 == 0) {
			System.out.println("Sao Multiplos");
		}
		else
		System.out.println("Nao sao Multiplos");
		
		sc.close();
		
	}

}
