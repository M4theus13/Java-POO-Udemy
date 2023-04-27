package application_exe1;

import java.util.Locale;
import java.util.Scanner;

import entities_exe1.Rectangle;

public class Program {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de
		sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.Area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagonal());
		sc.close();
	}

}
