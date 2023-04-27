package exemplo_data;

import java.time.LocalDateTime;

public class Obter_dados_de_uma_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime data1 = LocalDateTime.parse("2023-08-03T12:30:26");
		
		System.out.println("dia: " + data1.getDayOfMonth()); //dia do mes
		System.out.println("nome do mês: " + data1.getMonth()); //mes por extenso
		System.out.println("mês: " + data1.getMonthValue()); //numero do mes
		System.out.println("ano: " + data1.getYear()); //ano
		System.out.println("ano: " + data1.getHour()); //hora
		System.out.println("ano: " + data1.getMinute()); //minuto
	}

}
