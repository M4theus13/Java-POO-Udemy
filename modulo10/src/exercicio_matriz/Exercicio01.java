package exercicio_matriz;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler dois números inteiros M e N, e depois ler
		uma matriz de M linhas por N colunas contendo números inteiros,
		podendo haver repetições. Em seguida, ler um número inteiro X que
		pertence à matriz. Para cada ocorrência de X, mostrar os valores à
		esquerda, acima, à direita e abaixo de X, quando houver, conforme
		exemplo.
		✅COMPLETO✅
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("quantidade de linhas da matriz: ");
		int m = sc.nextInt();//linha
		
		System.out.print("quantidade de colunas da matriz: ");
		int n = sc.nextInt();//coluna
		
		int[][] mat = new int[m][n];
		
		System.out.println("digite a matriz:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("----------");
		for (int i = 0; i < mat.length; i++) { 
			for (int j = 0; j < mat[i].length; j++) { 
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("----------");
		System.out.println();
		
		System.out.print("escolha um numero da matriz: ");
		int num = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					
					System.out.println("posicao " + i  +", " + j + ":");
					if (j > 0) {
						System.out.println("esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("cima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("baixo: " + mat[i+1][j]);
					}
					System.out.println();
				}
			}
		}
		
		
		sc.close();
	}

}
