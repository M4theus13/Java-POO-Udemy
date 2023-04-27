package exemplo_data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatacao_data_hora {

	public static void main(String[] args) {
		// data formatada
		LocalDate d01 = LocalDate.parse("2022-08-03");
		LocalDateTime d02 = LocalDateTime.parse("2023-08-03T12:30:26");
		Instant d03 = Instant.parse("2023-08-03T12:30:26Z"); // horario de londres, fuso horario aqui é -3horas
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//considenrado fuso horario do sistema
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d01: " + d01.format(fmt1)); //pode ser feito dessa maneira
		System.out.println("d01: " + fmt1.format(d01)); // pode ser feito assim tambem
		System.out.println("d01: " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));// ou assim que cria a formatação momentanea
		//depois é apagada
		
		System.out.println();
		System.out.println("d02: " + d02.format(fmt1));
		System.out.println("d02: " + d02.format(fmt2));
		System.out.println("d02: " + d02.format(fmt4));
		
		System.out.println();
		System.out.println("d03: " + d03.toString()); 
		System.out.println("d03: " + fmt3.format(d03));
		System.out.println("d03: " + fmt5.format(d03));
	}

}
