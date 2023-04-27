package exemplo_data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Instanciacao_data_hora {

	public static void main(String[] args) {
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		//Link para Data e hora FORMATADO CUSTOMIZADO
		
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();//data local
		LocalDateTime d02 = LocalDateTime.now(); //horario local 
		Instant d03 = Instant.now(); //fuso horario de GMT, horario de londres
		
		LocalDate d04 = LocalDate.parse("2023-08-03");
		LocalDateTime d05 = LocalDateTime.parse("2023-08-03T12:30:26");
		Instant d06 = Instant.parse("2023-08-03T12:30:26Z"); //fuso de londres GTM 0
		Instant d07 = Instant.parse("2023-08-03T12:30:26-03:00"); //GMT-3
		
		LocalDate d08 = LocalDate.parse("03/08/2023", formato1);
		
		LocalDateTime d09 = LocalDateTime.parse("03/08/2023 15:45",  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")); //da pra instanciar direto tb
		
		LocalDate d10 = LocalDate.of(2023, 8, 03);
		
		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03); 
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		System.out.println("d08: " + d08);
		System.out.println("d09: " + d09);
		System.out.println("d10: " + d10);

	}

}
