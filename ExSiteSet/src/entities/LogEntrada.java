package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntrada {
	private String usuario;
	private Date data;

	public LogEntrada() {

	}

	public LogEntrada(String usuario, Date data) {
		this.usuario = usuario;
		this.data = data;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntrada other = (LogEntrada) obj;
		return Objects.equals(usuario, other.usuario);
	}

	
}
