package exemplo_data;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos_data_hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime data1 = LocalDateTime.parse("2023-08-03T12:30:26");
		Instant data2 = Instant.parse("2023-08-03T12:30:26Z");
		
		LocalDateTime weekPastData1 = data1.minusDays(7); // minus = subtração
		LocalDateTime weekNextData1 = data1.plusDays(7); //plus = adição
		
		Instant weekPastData2 = data2.minus(7, ChronoUnit.DAYS);
		Instant weekNextData2 = data2.plus(7, ChronoUnit.DAYS);
		
		System.out.println("data1 -7 dias: " + weekPastData1);
		System.out.println("data1 +7 dias: " + weekNextData1);
		
		System.out.println("data2 -7 dias: " + weekPastData2);
		System.out.println("data2 +7 dias: " + weekNextData2);
	}

}
