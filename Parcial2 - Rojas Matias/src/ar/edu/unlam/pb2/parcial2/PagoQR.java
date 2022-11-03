package ar.edu.unlam.pb2.parcial2;

import java.util.Set;

public class PagoQR extends TransaccionMonetaria implements Rechazable, Alertable{

	@Override
	public void marcarComoCasoSospechoso() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirmarSiFueFraude(Boolean fueFraude) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean monitorear(Set<Denunciable> listaNegra, Transaccion ultimaRealizada) throws FraudeException {
		// TODO Auto-generated method stub
		return null;
	}

}
