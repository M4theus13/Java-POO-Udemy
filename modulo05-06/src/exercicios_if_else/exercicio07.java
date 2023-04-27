package exercicios_if_else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		//Se o ponto estiver na origem, escreva a mensagem “Origem”.
		//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
		//situação.
		Locale.setDefault(Locale.US);
		System.out.println("Type X and Y: ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x > 0 && y == 0) {
			System.out.println("Eixo Y, Q1 e Q4");
		}
		else if (x < 0 && y == 0) {
			System.out.println("Eixo Y, Q2 e Q3");
		}
		else if (x == 0 && y > 0) {
			System.out.println("Eixo X, Q1 e Q2");
		}
		else if (x == 0 && y < 0) {
			System.out.println("Eixo X, Q3 e Q4");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		sc.close();
	}

}
