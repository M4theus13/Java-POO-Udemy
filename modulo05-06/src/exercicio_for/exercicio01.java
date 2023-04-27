package exercicio_for;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		/*
		Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
		X, se for o caso.
		https://github.com/acenelio/nivelamento-java/blob/master/src/uri1067.java
		*/
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		
		for (int i = 1; i <= entrada; i+=2) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
