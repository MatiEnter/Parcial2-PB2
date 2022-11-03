package ar.edu.unlam.pb2.parcial2;

import java.util.Set;

public interface Rechazable {
	
	public Boolean monitorear(Set<Denunciable> listaNegra, Transaccion ultimaRealizada) throws FraudeException;

}
