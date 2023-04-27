package exercicios_vetor;


import java.util.Locale;
import java.util.Scanner;

import util_exercicios.Pessoas07;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
		que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
		de homens.
		✅COMPLETO✅
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Pessoas07[] pessoas = new Pessoas07[n];
		Pessoas07[] pessoasm = new Pessoas07[n];
		Pessoas07[] pessoasf = new Pessoas07[n];
		double totalF = 0.0;
		double totalM = 0.0;
		
		for (int i = 0; i < pessoasm.length; i++) {
			char s = sc.next().charAt(0);
			double altura = sc.nextDouble();
			pessoas[i] = new Pessoas07(s, altura);
				if (s == 'm') {
					pessoasm[i] = new Pessoas07(s, altura);
					totalM += 1.0;
				}
				if (s == 'f') { 
					pessoasf[i] = new Pessoas07(s, altura);
					totalF += 1.0;
				}
			}
		
		//maior altura
		double maioraltura = pessoas[0].getAltura();
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getAltura() > maioraltura) { 
				maioraltura = pessoas[i].getAltura();
			}	
		}
		
		//menor altura
		double menoraltura = pessoas[0].getAltura();
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getAltura() < menoraltura) { 
				menoraltura = pessoas[i].getAltura();
			}	
		}
		//resultado
		System.out.printf("maior altura: %.2f%n" ,maioraltura);
		System.out.printf("menor altura: %.2f%n" ,menoraltura);
		
		//Feminino
		double alturaF = 0.0;
		for (int i = 0; i < pessoasf.length; i++) {
			if (pessoasf[i] != null) {
			alturaF += pessoasf[i].getAltura();
			}
		}
		double mediaF = 0.0;
		mediaF = alturaF/totalF;
		System.out.printf("Media de altura das mulheres: %.2f%n" , mediaF);
		
		//Masculino
		double alturaM = 0.0;
		for (int i = 0; i < pessoasm.length; i++) {
			if (pessoasm[i] != null) {
			alturaM += pessoasm[i].getAltura();
			}
		}
		double mediaM = 0.0;
		mediaM = alturaM/totalM;
		System.out.printf("Media de altura dos homens: %.2f%n" , mediaM);
		
		sc.close();
	}

}
