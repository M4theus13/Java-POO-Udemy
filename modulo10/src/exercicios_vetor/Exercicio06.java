package exercicios_vetor;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
		terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
		o vetor C gerado.
		✅COMPLETO✅
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		System.out.println("Digite os valores do vetor A: ");
		
		int[] vetorA = new int[n];
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		int[] vetorB = new int[n];
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		int[] vetorC = new int[n];
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		
		
		
		sc.close();
	}

}
