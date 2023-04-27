package exercicios_vetor;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
		
		RETRABALHAR
		*/
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
