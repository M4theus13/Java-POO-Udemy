package exemplo_data;

import java.time.Duration;
import java.time.LocalDateTime;

public class Duração_data_hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime d01 = LocalDateTime.parse("2023-08-03T01:35:35");
		LocalDateTime proximaSemana = d01.plusDays(7);
		
		Duration tempoEntre = Duration.between(proximaSemana, d01);
		
		System.out.println("tempo entre: " + tempoEntre.toDays());
		
	}

}
