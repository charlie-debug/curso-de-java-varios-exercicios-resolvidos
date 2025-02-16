package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		LocalDate data1 = LocalDate.parse("2024-10-01");
		LocalDateTime data2 = LocalDateTime.parse("2024-10-01T23:50:22");     
		
		Instant data3 = Instant.parse("2024-10-01T23:22:13Z");       
      
       DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
       DateTimeFormatter dtf4 = DateTimeFormatter.ISO_DATE_TIME;
       DateTimeFormatter dtf5 = DateTimeFormatter.ISO_INSTANT;
       System.out.println(data1.format(dtf1));
       System.out.println(dtf1.format(data1));
       System.out.println(data1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
       
       System.out.println(data2.format(dtf1));
       System.out.println(data2.format(dtf2));
       
       System.out.println(dtf3.format(data3));
       System.out.println(dtf4.format(data2));
       System.out.println(dtf5.format(data3));
       
       
	}

}
