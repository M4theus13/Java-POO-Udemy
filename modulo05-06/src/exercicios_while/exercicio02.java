package exercicios_while;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		//		|
		//	2	|	1
		//------0--------
		//	3	|	4
		//		|
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (x != 0 || y != 0) {
			if (x<0 && y<0) {
				 System.out.println("3");
			 }
			else if (x<0 && y>0) {
				 System.out.println("2");
			 }
			else if (x>0 & y<0) {
				 System.out.println("4");
			 }
			else if (x>0 && y>0) {
				 System.out.println("1");
			 }
			 else {
				 System.out.println("encerrado");
			 }
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
