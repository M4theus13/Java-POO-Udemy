package exercicios_if_else;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		//https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("NEGATIVO");
		}
		else
			System.out.println("NÃO NEGATIVO");
		sc.close();
	}

}
