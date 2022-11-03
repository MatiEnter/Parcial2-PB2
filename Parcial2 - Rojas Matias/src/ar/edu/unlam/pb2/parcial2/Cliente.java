package ar.edu.unlam.pb2.parcial2;

import java.util.Objects;

public class Cliente implements Denunciable{

	private Integer cuil;
	private String nombre;
	private Double saldo;
	

	public Cliente(Integer cuil, String nombre, Double saldo) {
		super();
		this.cuil = cuil;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	
	public Double getSaldo() {
		return saldo;
	}



	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getCuil() {
		return cuil;
	}

	public void setCuil(Integer cuil) {
		this.cuil = cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cuil);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cuil, other.cuil);
	}
	
	

}
