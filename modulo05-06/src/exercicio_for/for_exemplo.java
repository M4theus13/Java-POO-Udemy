package exercicio_for;


import java.util.Scanner;

public class for_exemplo {

	public static void main(String[] args) {
		/*
		Fazer um programa que lê um valor inteiro N e depois N números inteiros.
		
		Ao final, mostra a soma dos N números lidos
		*/
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < N ; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println("Soma = " + soma);
		
		sc.close();
	}

}
