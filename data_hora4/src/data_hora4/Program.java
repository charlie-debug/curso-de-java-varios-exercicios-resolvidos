package data_hora4;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate data1 = LocalDate.parse("2024-10-02");
		LocalDateTime data2 = LocalDateTime.parse("2024-10-02T02:00:00");		
		Instant data3 = Instant.parse("2024-10-02T02:00:00Z");
		Instant data4 = Instant.parse("2024-10-02T02:47:00Z");
		
	   LocalDate semanaAnterior = data1.minusDays(7);
	   LocalDate semanaPosterior= data1.plusDays(7);
	   
	   LocalDateTime semanaAnteriorTime = data2.minusDays(7);
	   LocalDateTime semanaPosteriorTime= data2.plusDays(7);
	   
	   Instant semanaAnteriorInstant = data3.minus(7,ChronoUnit.DAYS);
	   Instant semanaPosteriorInstant= data3.plus(7,ChronoUnit.DAYS);
	   
	   Duration t1 = Duration.between(semanaAnterior.atStartOfDay(), data1.atStartOfDay());
	   Duration t2 = Duration.between(semanaAnteriorTime,data2);
	   Duration t3 = Duration.between(semanaAnteriorInstant,data3);
	   Duration t4 = Duration.between(data3,semanaAnteriorInstant);
	   Duration t5 = Duration.between(data3,data4);
	   
	   System.out.println("semanaAnterior: "+semanaAnterior);
	   System.out.println("semanaPosterior: "+semanaPosterior);
	   System.out.println("semanaAnteriorTime: "+semanaAnteriorTime);
	   System.out.println("semanaPosteriorTime: "+semanaPosteriorTime);
	   System.out.println("semanaAnteriorInstant: "+semanaAnteriorInstant);
	   System.out.println("semanaPosteriorInstant: "+semanaPosteriorInstant);
	   
	   System.out.println("t1= "+t1.toDays());
	   System.out.println("t2= "+t2.toDays());
	   System.out.println("t3= "+t3.toDays());
	   System.out.println("t4= "+t4.toDays());
	   System.out.println("t5= "+t5.toMinutes());
	}

}
