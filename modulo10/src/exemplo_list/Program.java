package exemplo_list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("Ana");//posição0
		
		//aqui entra o numero1 que é adicionado logo abaixo
		
		list.add("Alex");//posição1 -> vira posição 2
		list.add("Matheus");//posição2 -> vira posição 3
		list.add("Joao");//posição3 -> vira posição 4
		
		list.add(1,"Maria");//adiciona a posição 1, o "numero1"
		
		list.remove("Joao");//remove o "numero4", poderia ser escrito tb como "list.remove(4);" indicando para remover o item 4 da lista
		
		System.out.println(list.size());//exibe o tamanho da lista
		
		for (String numero : list) {//para cada x(pode ser qualquer nome) da list, fazer algo
			System.out.println(numero);
		}
		
		list.removeIf(x -> x.charAt(0) == 'M');//PREDICADO,pega um valor x da lista, e me diz se o Char0 é igual a N(inicial com N), se for, remover
		
		//como apenas o numero3 nao inicial com N, ele continuara na lista
		System.out.println("----------");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------");
		System.out.println("Index of Ana: " + list.indexOf("Ana")); //mostra em qual posição da lista esta
		System.out.println("Index of Matheus: " + list.indexOf("Matheus")); //se não encontrar na lista, mostra -1
		
		System.out.println("----------");
		//para filtrar uma lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());//cria uma lista, converte para stream
		//faz o filtro ou operação lambda, e depois converte ele para lista, com o comando collect
		
		for (String x : result) {
			System.out.println(x);
			}
		
		System.out.println("----------");
		//para encontrar o primeiro elemento q atenda a um predicado	
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);// findfirst vai me passar o primeiro elemento que
		//atenda aos requisitos, se nao, retornara nulo
		
		System.out.println(name);
	} 

}
