package application_exe4;

import java.util.Locale;
import java.util.Scanner;

import entities_exe4.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		/*
		Fazer um programa que pergunte o valor do dollar, e quantos dolares será comprado, e em seguida quanto sera pago em reias
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price?");
		CurrencyConverter.valor =  sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		CurrencyConverter.quantity =  sc.nextDouble();
		
		double result = CurrencyConverter.convertion();
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		
		sc.close();
	}

}
