package exercicios_if_else;

import java.util.Scanner;

public class estrutura_condicional_if_else {

	public static void main(String[] args) {
		int hora;
		System.out.println("Quantas horas?");
			
		Scanner sc = new Scanner(System.in);
			
		hora = sc.nextInt();
			
		if (hora < 12) 
		{
			System.out.println("bom dia");
		}
			else if (hora < 18 )
			{
				System.out.println("boa tarde");
			}
			else
			{
				System.out.println("boa noite");
			}
		sc.close();
			
	}

}
