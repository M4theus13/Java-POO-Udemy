package exercicios_vetor;


import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
		tela todos os números pares, e também a quantidade de números pares. 
		✅COMPLETO✅
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[]vetor = new int[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		int soma = 0;
		System.out.println();
		System.out.println("numeros pares: ");
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i]%2 == 0 ) {
				soma +=1;
				System.out.print( vetor[i] + " ");
			}
		}
		System.out.println();
		System.out.println("quantidade de numeros pares: " + soma);
		sc.close();
	}

}
