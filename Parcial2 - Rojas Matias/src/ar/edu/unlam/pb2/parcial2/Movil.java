package ar.edu.unlam.pb2.parcial2;

public class Movil extends Dispositivo implements Denunciable{

	private String codigoimei;
	private Boolean registroBiometrico;

	public Movil(Integer codigoDispositivo, String sistemaOperativo, String direccionip, String localidadConexion, String codigoimei,
			Boolean registroBiometrico) {
		super(codigoDispositivo,sistemaOperativo, direccionip, localidadConexion);
		this.codigoimei = codigoimei;
		this.registroBiometrico = registroBiometrico;
	}

	public String getCodigoimei() {
		return codigoimei;
	}

	public void setCodigoimei(String codigoimei) {
		this.codigoimei = codigoimei;
	}

	public Boolean getRegistroBiometrico() {
		return registroBiometrico;
	}

	public void setRegistroBiometrico(Boolean registroBiometrico) {
		this.registroBiometrico = registroBiometrico;
	}

}
