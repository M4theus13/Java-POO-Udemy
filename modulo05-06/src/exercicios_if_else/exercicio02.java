package exercicios_if_else;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		//https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
		Scanner sc = new Scanner(System.in);
		
		double num, divisao;
		 
		num = sc.nextDouble();
		
		divisao = (num % 2);
		
		if( divisao == 0) {
			System.out.println("PAR");
		}
		else
			System.out.println("IMPAR");
		
		sc.close();
	}

}
