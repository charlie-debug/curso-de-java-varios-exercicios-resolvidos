package entities;

public class EmpregadoTerceirizado extends Empregado {
	private Double despezaAdicional;

	public EmpregadoTerceirizado() {
		super();
	}

	public EmpregadoTerceirizado(String nome, Integer horas, Double valorPorHora, Double despezaAdicional) {
		super(nome, horas, valorPorHora);
		this.despezaAdicional = despezaAdicional;
	}

	public Double getDespezaAdicional() {
		return despezaAdicional;
	}

	public void setDespezaAdicional(Double despezaAdicional) {
		this.despezaAdicional = despezaAdicional;
	}
	
	@Override
	public double pagamento() {
	return super.pagamento() + despezaAdicional * 1.1;
	}
	
}
