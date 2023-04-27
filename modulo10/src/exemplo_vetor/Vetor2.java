package exemplo_vetor;


import java.util.Locale;
import java.util.Scanner;

import util_exercicios.Product;

public class Vetor2 {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler um número inteiro N e os dados (nome e
		preço) de N Produtos. Armazene os N produtos em um vetor. Em
		seguida, mostrar o preço médio dos produtos.b
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double value = sc.nextDouble();
			vect[i] = new Product(name, value);
		}
		
		double soma = 0.0; 
		for (int i=0; i<vect.length; i++) { 
			soma += vect[i].getValue(); //
		}
		
		double media = soma / vect.length;
		System.out.println(media);
		sc.close();
	}

}
