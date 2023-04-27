package exercicios_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
		//https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		Double H, S, salario;
		N = sc.nextInt();
		H = sc.nextDouble();
		S = sc.nextDouble();
		salario = H * S;
		
		System.out.println("NUMBER = " + N);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		 
		sc.close();
		
	}

}
