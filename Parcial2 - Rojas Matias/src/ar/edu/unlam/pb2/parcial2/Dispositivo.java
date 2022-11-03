package ar.edu.unlam.pb2.parcial2;

public abstract class Dispositivo {

	protected Integer codigoDispositivo;
	protected String sistemaOperativo;
	protected String direccionip;
	protected String localidadConexion;

	public Dispositivo(Integer codigoDispositivo, String sistemaOperativo, String direccionip,
			String localidadConexion) {
		super();
		this.codigoDispositivo = codigoDispositivo;
		this.sistemaOperativo = sistemaOperativo;
		this.direccionip = direccionip;
		this.localidadConexion = localidadConexion;
	}

	public Integer getCodigoDispositivo() {
		return codigoDispositivo;
	}

	public void setCodigoDispositivo(Integer codigoDispositivo) {
		this.codigoDispositivo = codigoDispositivo;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getDireccionip() {
		return direccionip;
	}

	public void setDireccionip(String direccionip) {
		this.direccionip = direccionip;
	}

	public String getLocalidadConexion() {
		return localidadConexion;
	}

	public void setLocalidadConexion(String localidadConexion) {
		this.localidadConexion = localidadConexion;
	}

}
