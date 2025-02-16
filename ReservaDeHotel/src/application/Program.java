package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
		System.out.print("número do quarto:");
		int numeroQuarto = sc.nextInt();
		System.out.print("checkIn date (dd/MM/yyyy):");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("checkOut date (dd/MM/yyyy):");
		Date checkOut = sdf.parse(sc.next());
	
		Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
		System.out.println("Reserva:"+reserva);
		
		System.out.println();
		System.out.println("Entre com os dados para atualizar a reserva:");
		System.out.print("checkIn date (dd/MM/yyyy):");
		 checkIn = sdf.parse(sc.next());
		System.out.print("checkOut date (dd/MM/yyyy):");
		 checkOut = sdf.parse(sc.next());
		
		 reserva.datasAtualizada(checkIn, checkOut);
		 System.out.println("Reserva:"+reserva);
		}catch(ParseException e) {
			System.out.println("datas inválidas!");
		}catch(DomainException e) {
			System.out.println("erro na reserva:"+e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("erro inesperado!");
		}
		sc.close();
	}

}
