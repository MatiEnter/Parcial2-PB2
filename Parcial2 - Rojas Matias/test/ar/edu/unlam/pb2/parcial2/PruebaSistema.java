package ar.edu.unlam.pb2.parcial2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaSistema {

	@Test
	public void queSePuedaCrearUnCliene() {
		Cliente cliente = new Cliente(11111111, "Matias Rojas", 0.0);

		assertEquals(11111111, cliente.getCuil(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnDispositivo() {
		Dispositivo celular = new Movil(1, "android", "192.168.2.2", "San Justo", "1651SD56S1A", Boolean.TRUE);
		Dispositivo notebook = new Pc(2, "Windows 10", "192.168.1.1", "Casanova");

		assertEquals(1, celular.getCodigoDispositivo(), 0.01);
		assertEquals(2, notebook.getCodigoDispositivo(), 0.01);
	}

	@Test
	public void queSePuedaMonitorearUnaExtraccion() throws FraudeException {
		
		Cliente cliente = new Cliente(11111111, "Matias Rojas", 100.0);
		Dispositivo celular = new Movil(1, "android", "192.168.2.2", "San Justo", "1651SD56S1A", Boolean.TRUE);
		TransaccionMonetaria t1 = new Extraccion(0, cliente, celular);
		((Extraccion)t1).monitorear(null, t1);

	}

	@Test
	public void queSePuedaMonitorearUnaTransferencia() throws FraudeException {
		TransaccionMonetaria t2 = new Transferencia(0, cliente, celular);
		Cliente cliente = new Cliente(11111111, "Matias Rojas", 100.0);
		Dispositivo celular = new Movil(1, "android", "192.168.2.2", "San Justo", "1651SD56S1A", Boolean.TRUE);
		((Transferencia)t2).monitorear(null, t2);
	}

	@Test
	public void queSePuedaMonitorearUnPagoConQR() throws FraudeException {
		TransaccionMonetaria t3 = new PagoQR(0, cliente, celular);
		Cliente cliente = new Cliente(11111111, "Matias Rojas", 100.0);
		Dispositivo celular = new Movil(1, "android", "192.168.2.2", "San Justo", "1651SD56S1A", Boolean.TRUE);
		((PagoQR)t3).monitorear(null, t3);
	}

	@Test
	public void queSePuedaMonitorearUnPagoDeServicio(){
		TransaccionMonetaria t4 = new PagoServicio(0, cliente, celular);
		Cliente cliente = new Cliente(11111111, "Matias Rojas", 100.0);
		Dispositivo celular = new Movil(1, "android", "192.168.2.2", "San Justo", "1651SD56S1A", Boolean.TRUE);
		((PagoServicio)t4).monitorear(null, t4);
	}

	@Test
	public void queSePuedaMonitorearUnAltaDeUsuario() {
		TransaccionNoMonetaria tn2 = new AltaUsuario();
		Cliente cliente = new Cliente(11111111, "Matias Rojas", 100.0);
		Dispositivo celular = new Movil(1, "android", "192.168.2.2", "San Justo", "1651SD56S1A", Boolean.TRUE);
		((PagoServicio)tn2).monitorear(null, tn2);
	}

	@Test
	public void queSePuedaMonitorearUnCambioDeContraseña(){
		TransaccionNoMonetaria tn4 = new CambioContrasenia();
		Cliente cliente = new Cliente(11111111, "Matias Rojas", 100.0);
		Dispositivo celular = new Movil(1, "android", "192.168.2.2", "San Justo", "1651SD56S1A", Boolean.TRUE);
		((CambioContrasenia)tn4).monitorear(null, tn4);
	}

	@Test
	public void queElScoreDeUnaTransaccionRechazableSinAntecedentesDeCero() {
		fail("Not yet implemented");
	}

	@Test
	public void queUnaTransaccionAlertablePuedaSerMarcadaComoFraudulenta() {
		fail("Not yet implemented");
	}

	@Test
	public void queElScoreDeUnaTransaccionRechazableConNuevoDispositivoDe20Puntos() {
		fail("Not yet implemented");
	}

	@Test
	public void QueUnaTransaccionDeMasDe60PuntosYMenosDeOchentaSeaAlertadaPeroAprobada() {
		fail("Not yet implemented");
	}

	@Test
	public void queUnaTransaccionDeMasDe80PuntosLanceLaExcepcionFraudeException() throws FraudeException{
		fail("Not yet implemented");
	}

}
