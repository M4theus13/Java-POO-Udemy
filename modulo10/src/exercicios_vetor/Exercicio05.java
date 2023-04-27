package exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
		o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
		considerando a primeira posição como 0 (zero).
		✅COMPLETO✅
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		System.out.println();
		double maior = vetor[0];
		int position = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				position = i;
				
			}
		}
		System.out.println("maior valor: " + maior);
		System.out.printf("posicao: %d ", position + 1);
		
		sc.close();
	}

}
