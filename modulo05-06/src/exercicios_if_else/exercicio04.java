package exercicios_if_else;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		//https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
		//REVISAR
		Scanner sc = new Scanner(System.in);
		
		int horai = sc.nextInt();
		int horaf = sc.nextInt();
		int dia;
		
		if(horai < horaf) {
			dia = horaf - horai;
		}
		else
			dia = 24 - horai + horaf;
			
		System.out.println("O JOGO DUROU " + dia + " HORAS");
		
		
		sc.close();
		
	}

}
