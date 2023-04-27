package exemplo_matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < matriz.length; i++) { //for para percorrer as linhas
			for (int j = 0; j < matriz[i].length; j++) { //for para percorrer as colunas
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal");
		for (int i = 0; i < matriz.length; i++) { 
				System.out.println(matriz[i][i]);
		}
		
		int count = 0;
		for (int i = 0; i < matriz.length; i++) { //matriz.length para percorrer as linhas
			for (int j = 0; j < matriz[i].length; j++) { //matriz[i].length para percorrer as colunas
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Quantidade de numeros negativos: " + count);
		
		System.out.println("Matriz:");
		
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
