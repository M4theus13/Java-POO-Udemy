package exercicios_java;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
		//mensagem explicativa
		//https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		A = sc.nextInt();
		B = sc.nextInt();
		soma = A + B;
		
		System.out.println("SOMA = " + soma);
		sc.close();
	}

}