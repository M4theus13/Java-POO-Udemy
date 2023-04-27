package exercicios_while;

import java.util.Scanner;

public class while_exemplo {

	public static void main(String[] args) {
		//exemplo do comando while
		Scanner sc =  new Scanner(System.in);
		int x = sc.nextInt();
		
		while (x != 0) { //enquanto x for diferente de 0, ficara se repetindo o comando
			System.out.println("Número invalido");
			x = sc.nextInt();
		}
			System.out.println("Parabéns, número correto");
		
		sc.close();
	}

}
