package exercicio_for;

import java.util.Scanner;

public class loop_infinito_for {

	public static void main(String[] args) {
		//loop de +1
		Scanner sc = new Scanner(System.in);
		
		
		for (long i = 0; i < 999999999 ; i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
