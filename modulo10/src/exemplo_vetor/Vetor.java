package exemplo_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler um número inteiro N e a altura de N
		pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
		altura média dessas pessoas.
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n]; //vetor double iniciado, nome da variavel vect, quantidade de vetores = n
		for(int i=0; i<n; i++) { //para adicionar valores a um vetor usar "for"
			vect[i] = sc.nextDouble(); // o vetor "valor de i" 0, 1, 2... sera digitado e armazenado
		}
		
		double soma = 0.0; // variavel para armazenar a soma das alturas
		for (int i=0; i<n; i++) { 
			soma += vect[i]; // cada vetor vai sendo adicionado a soma
		}
		
		double media = soma / n;
		
		System.out.println("vetor1 = " + vect[0]);
		System.out.println("vetor1 = " + vect[1]);
		System.out.println("vetor1 = " + vect[2]);
		System.out.println("soma = " + soma);
		System.out.printf("media = %.2f%n" , media);
		
		sc.close();
	}

}
