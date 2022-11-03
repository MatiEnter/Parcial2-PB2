package ar.edu.unlam.pb2.parcial2;

import java.util.*;

public class Sistema {

	private Set<Transaccion> transaccionesRealizadas;
	

	public Sistema() {
		super();
		this.transaccionesRealizadas = new HashSet<>();
		
	}

	public Set<Transaccion> getTransaccionesRealizadas() {
		return transaccionesRealizadas;
	}

	public void setTransaccionesRealizadas(Set<Transaccion> transaccionesRealizadas) {
		this.transaccionesRealizadas = transaccionesRealizadas;
	}


	
	
}
