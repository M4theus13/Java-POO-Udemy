package exercicios_while;

import java.util.Scanner;

public class exercicio00 {

	public static void main(String[] args) {
		//enquanto x menor que 3 y ganha mais 2 de valor
		Scanner sc =  new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();;
		while (x < 3) { 
			y+=2;
			x +=1;
			System.out.println(x + "-" + y);
		}
		sc.close();
	}

}
