package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		LocalDate data1 = LocalDate.parse("2024-10-02");
		LocalDateTime data2 = LocalDateTime.parse("2024-10-02T02:00:00");
		Instant data3 = Instant.parse("2024-10-02T02:00:00Z");
		
		LocalDate resultado1 = LocalDate.ofInstant(data3, ZoneId.systemDefault());
		LocalDate resultado2 = LocalDate.ofInstant(data3, ZoneId.of("Portugal"));
		LocalDateTime resultado3 = LocalDateTime.ofInstant(data3, ZoneId.systemDefault());
		LocalDateTime resultado4 = LocalDateTime.ofInstant(data3, ZoneId.of("Portugal"));
		System.out.println("Data/HoraBrasil:"+resultado1);
		System.out.println("Data/HoraPortugal:"+resultado2);
		System.out.println("Data/HoraBrasil:"+resultado3);
		System.out.println("Data/HoraPortugal:"+resultado4);
		System.out.println("Dia="+data1.getDayOfMonth());
		System.out.println("Mês="+data1.getMonthValue());
		System.out.println("Mês="+data1.getYear());
		
		System.out.println("Hora="+data2.getHour());
		System.out.println("Minutos="+data2.getMinute());
		System.out.println("Segundos="+data2.getSecond());
		
	}

}
