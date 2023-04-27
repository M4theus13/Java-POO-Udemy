package application_exe3;

import java.util.Locale;
import java.util.Scanner;

import entities_exe3.Student;

public class Program {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
		(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
		ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
		para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
		resolver este problema.
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.mediaFinal());
		
		if (aluno.mediaFinal() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", aluno.failed());	
		}
		else 
			System.out.println("PASS");
			
		sc.close();
	}

}
