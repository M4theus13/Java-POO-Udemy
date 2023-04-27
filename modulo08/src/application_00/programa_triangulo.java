package application_00;

import java.util.Locale;
import java.util.Scanner;

import entities_00.Triangle;

public class programa_triangulo {

	public static void main(String[] args) {
		// insira os valores dos lados de dois triangulos, e o programa ira mostra a area dos dois triangulos e qual tem maior area
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y; //duas entidades triangulos criadas X e Y. cada entidade tem 3 valores dentros a definir
		x = new Triangle(); 
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble(); //comando para entrada de valor
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area(); //x.area ira pegar os valores do triangulo x e aplicar na função area na classe triangulo
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if ( areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else
			System.out.println("Larger area: Y");
		
		sc.close();
	}

}
