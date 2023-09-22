package ar.edu.unalam.pb2.cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest {

	@Test
	public void queSePuedaDepositarEnLaCuentaRecienCreada() {
		CuentaCorriente cuenta1 = new CuentaCorriente();

		Boolean deposito = cuenta1.depositar(22220.00);

		assertTrue(deposito);

	}

	@Test
	public void queSePuedaObtenerElMontoDisponibleEnCuenta() {
		CuentaCorriente cuenta1 = new CuentaCorriente();

		cuenta1.depositar(22220.00);
		Double getSaldo = cuenta1.getSaldo();

		assertEquals(getSaldo, 22220, 1.00);
	}

	@Test
	public void queSePuedaExtraeSiHayDineroDisponibleEnLaCuenta() {
		CuentaCorriente cuenta1 = new CuentaCorriente();

		cuenta1.depositar(2000.00);
		cuenta1.extraer(1000.00);

		assertTrue(cuenta1.extraer(1000.00));

	}

	@Test
	public void queAlUsarDineroDescubiertoCobreCincoPorcientoExtra() {

		CuentaCorriente cuenta1 = new CuentaCorriente();
		cuenta1.depositar(2000.00);
		cuenta1.setDescubierto(2000.00);

		cuenta1.extraer(3000.00);
		Double obtenerDeuda = cuenta1.getDeuda();

		assertEquals(obtenerDeuda, 1050.00, 0.01);

	}

}
