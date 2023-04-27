package sintaxes_opcionais;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;
		
		switch (x) { //switch pega a variavel para avaliar ela
		case 1: //case: caso a variavel analisada tenha o valor dado
			dia = "domingo"; //resultado caso aconteça a condição
			break; //obrigatorio break ao final
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default: //
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}
