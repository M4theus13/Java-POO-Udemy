package exercicios_if_else;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		//seguir, calcule e mostre o valor da conta a pagar.
		//1 CACHORRO QUENTE 4 REAIS
		//2 XSALADA 4.50 REAIS
		//3 XBACON 5 REAIS
		//4 TORRADA SIMPLES 2 
		//5 REFRIGERANTE 1.50
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		int pedido, quantidade;
		double total;
		pedido = sc.nextInt();
		quantidade = sc.nextInt();
		
		
		if(pedido == 1) {
			total = quantidade * 4.0;
		}
		else if(pedido == 2) {
			total = quantidade * 4.5;
		}
		else if(pedido == 3) {
			total = quantidade * 5.0;
		}
		else if(pedido == 4) {
			total = quantidade * 2.0;
		}
		else {	
			total = quantidade * 1.5;
		}
			if (pedido <= 5) {
				System.out.printf("Total: R$ %.2f%n", total);
			}
			else
				System.out.println("Pedido nao encontrado");
		sc.close();
	}

}
