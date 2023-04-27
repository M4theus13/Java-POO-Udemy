package application_exe2;

import java.util.Locale;
import java.util.Scanner;

import entities_exe2.Employee;

public class Program {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
		seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
		salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
		afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
		projetada abaixo.
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		funcionario.glossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		funcionario.tax =  sc.nextDouble();
		
		System.out.println("Employee:" + funcionario);
		
		System.out.println("Which percentage to increase salary?");
		
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		
		System.out.println("Updated data: " + funcionario);
		sc.close();
	}

}
