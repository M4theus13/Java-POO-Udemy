package exercicios_vetor;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Quarto09 room[] = new Quarto09[10];
		
		System.out.print("How many rooms will be rented? ");
		int n =  sc.nextInt();
		System.out.println();
		
		String nome;
		String email;
		int quarto;
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("Quarto #%d %n", i+1);
			sc.nextLine();
			
			System.out.print("Nome: ");
			nome = sc.nextLine();
			
			System.out.print("Email: ");
			email = sc.nextLine();
			
			System.out.print("Quarto: ");
			quarto = sc.nextInt();
			
			System.out.println();
			
			room[quarto] = new Quarto09(nome, email, quarto);
			
		}
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < room.length; i++) {
			if (room[i] != null) {
				System.out.printf("%d %s %s %n" , room[i].getQuarto(), room[i].getNome(), room[i].getEmail());
			}
		}
		
		
		
		sc.close();
	}

}
