package exercicio_for;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		/* 
		Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double numb1 = sc.nextDouble();
			double numb2 = sc.nextDouble();
			
			if(numb2 == 0) {
				System.out.println("Divisao Impossivel");
			}
			else {
				double divisao = numb1 / numb2;
				System.out.println(divisao);
			}
		}
		sc.close();
	}

}
