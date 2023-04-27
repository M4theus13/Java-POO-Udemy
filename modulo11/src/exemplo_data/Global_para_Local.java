package exemplo_data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Global_para_Local {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant data1 = Instant.parse("2023-08-03T01:30:25Z");//horario Z ou GMT = horario de londres (Fuso horario 0)
		
		LocalDate resultado1 = LocalDate.ofInstant(data1, ZoneId.systemDefault());//data Z convertido para horario padrão da maquina
		LocalDate resultado2 = LocalDate.ofInstant(data1, ZoneId.of("Portugal"));//data Z convertido para fuso de portugal +1GMT
		
		LocalDateTime resultado3 = LocalDateTime.ofInstant(data1, ZoneId.systemDefault()); //data e hora
		LocalDateTime resultado4 = LocalDateTime.ofInstant(data1, ZoneId.of("Portugal"));
		
		System.out.println("resultado1: " + resultado1);
		System.out.println("resultado2: " + resultado2);
		System.out.println("resultado3: " + resultado3);
		System.out.println("resultado4: " + resultado4);
		
	}

}
