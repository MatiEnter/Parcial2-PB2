package ar.edu.unlam.pb2.parcial2;

import java.util.Set;

public class Transferencia extends TransaccionMonetaria implements Rechazable, Alertable{

	private Integer score;
	private Cliente cliente;
	private Dispositivo dispositivoUsado;
	private Double importe;
	private Sistema sistema;
	
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
		
		if (listaNegra.contains(this.cliente) || listaNegra.contains(this.dispositivoUsado)) {
			this.score += 80;
			throw new FraudeException("Posible fraude");
		} else if (ultimaRealizada instanceof CambioContrasenia) {
			this.score += 20;
			throw new FraudeException("Posible fraude");
			//
		}
		return true;
	}

}
