package exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
		tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
		bem como os nomes dessas pessoas caso houver.
		✅COMPLETO✅
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		
		int n = sc.nextInt();
		String[] vetorN = new String[n]; //nome
		int[] vetorI = new int[n]; //idade
		double[] vetorA = new double[n]; //altura
		
		
		for (int i = 0; i < vetorN.length; i++) { 
			System.out.printf("Nome da %sa Pessoa %n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			vetorN[i]= sc.nextLine();
			
			System.out.print("Idade: ");
			vetorI[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			vetorA[i] = sc.nextDouble();
		}
		
		double menores = 0;
		double media = 0;
		
		for (int i = 0; i < n; i++) {
			media += vetorA[i];
		}
		System.out.printf("Altura média: %.2f%n", media/n);
		for (int i = 0; i < n; i++) {
			if (vetorI[i] < 16) {
				menores+=1;
			}
		}
		double porcentagem = menores /n  * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n" , porcentagem);

		for (int i = 0; i < n; i++) {
			if (vetorI[i] < 16) {
				System.out.println(vetorN[i]);
			}
		}
		
		sc.close();
	}

}
