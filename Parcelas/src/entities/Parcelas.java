package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {
	private LocalDate vencimento;
	private Double montante;
public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
	public Parcelas() {
	}

	public Parcelas(LocalDate vencimento, Double montante) {
		this.vencimento = vencimento;
		this.montante = montante;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public Double getMontante() {
		return montante;
	}

	public void setMontante(Double montante) {
		this.montante = montante;
	}

	@Override
	public String toString() {
		return fmt.format(vencimento) +" - "+String.format("%.2f", montante);
	}
	
	
}
