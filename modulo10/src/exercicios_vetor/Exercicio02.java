package exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		- Imprimir todos os elementos do vetor
		- Mostrar na tela a soma e a média dos elementos do vetor
		
		✅COMPLETO✅
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		double[] vetor = new double[numero];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			
		}
		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		double media = soma / numero;
		
		System.out.println();
		System.out.print("VALORES =");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(" " + vetor[i] );
		}
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + media);
		
		
		sc.close();
	}

}
