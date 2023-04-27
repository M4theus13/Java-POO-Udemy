package exercicios_java;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		//https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
		
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, DIFERENÇA;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIFERENÇA = A + B + C - D;
		
		System.out.println("DIFERENÇA = " + DIFERENÇA);
		
		sc.close();
	}

}
