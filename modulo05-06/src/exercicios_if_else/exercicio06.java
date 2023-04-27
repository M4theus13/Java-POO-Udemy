package exercicios_if_else;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
		//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”
		//https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		if (x < 0 || x > 100.01) {
			System.out.println("Fora do intervalo");
		}
		else if (x >= 75.01) {
			System.out.println("Intervalo [75,100]");
		}
		else if (x >= 50.01) {
			System.out.println("Intervalo [50,75]");
		}
		else if (x >= 25.01) {
			System.out.println("Intervalo [25,50]");
		}
		else if (x >= 0) {
			System.out.println("Intervalo [0,25]");
		}
		sc.close();
	}

}
