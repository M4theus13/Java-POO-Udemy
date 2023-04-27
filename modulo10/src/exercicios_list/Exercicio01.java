package exercicios_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import util_exercicios.Employees;

public class Exercicio01 {

	public static void main(String[] args) {
		/*ler um número inteiro N e depois os dados (id, nome e salario)
		
		efetuar o aumento de X por cento no salário de um determinado funcionário
		
		Se o id informado não existir, mostrar uma
		mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
		conforme exemplos.
		REVISAR
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employees> listFuncionario = new ArrayList<>();
		
		System.out.print("Quantos funcionarios vao ser registrados? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Funcionario #%d: %n", i+1);
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			System.out.println();
			
			Employees funcionario = new Employees(id,nome,salario);
			
			listFuncionario.add(funcionario);
		}	
		
		System.out.print("Digite o id do funcionario que tera aumento no salario: ");
		int id = sc.nextInt();
		Integer pos = posicao(listFuncionario, id);
		
		if (pos == null) {
			System.out.println("Esse id nao existe.");
		}
		else {
			System.out.print("Digite a porcentagem: ");
			double percent = sc.nextDouble();
			listFuncionario.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios:");
		
		for (Employees x : listFuncionario) {
			System.out.println(x);
		}
		
		sc.close();
	}
	
	public static Integer posicao (List<Employees> lista, int id) {
		for (int i = 0; i<lista.size(); i++) {
			if (lista.get(i).getId() == id) { //lista.get pega o elemento de uma posição getId pega o id da posição
				return i;
			}
		}
		return null;
	}
	
}
