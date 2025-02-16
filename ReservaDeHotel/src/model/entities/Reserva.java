package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exception.DomainException;

public class Reserva {
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
    
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Reserva() {
	}

	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut)  {
		if(!checkOut.after(checkIn)) {
			 throw new DomainException("a data de saída deve ser maior que a de entrada!");
		 }
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	public long duracao() {
		long diferenca = checkOut.getTime()-checkIn.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
	public void datasAtualizada(Date checkIn, Date checkOut) {
		Date agora = new Date();
		 if(checkIn.before(agora)|| checkOut.before(agora)) {
			throw new  DomainException("as datas devem ser futuras!");
		 } if(!checkOut.after(checkIn)) {
			 throw new DomainException("a data de saída deve ser maior que a de entrada!");
		 }
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}
	
	@Override
	public String toString() {
		return "Quarto "
				+numeroQuarto
				+", checkIn: "
				+sdf.format(checkIn)
				+", checkOut: "
				+sdf.format(checkOut)
				+", "
				+duracao()
				+" noites";
	}

}
