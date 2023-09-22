package ar.edu.unalam.pb2.cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaSueldoTest {

	@Test
	public void queSePuedaDepositarEnLaCuentaRecienCreada() {
		CuentaSueldo cuenta1 = new CuentaSueldo();

		Boolean deposito = cuenta1.depositar(22220.00);

		assertTrue(deposito);

	}

	@Test
	public void queSePuedaObtenerElMontoDisponibleEnCuenta() {
		CuentaSueldo cuenta1 = new CuentaSueldo();

		cuenta1.depositar(22220.00);
		Double getSaldo = cuenta1.getSaldo();

		assertEquals(getSaldo, 22220, 1.00);
	}

	@Test
	public void queSePuedaExtraeSiHayDineroDisponibleEnLaCuenta() {
		CuentaSueldo cuenta1 = new CuentaSueldo();

		cuenta1.depositar(2000.00);
		cuenta1.extraer(1000.00);

		assertTrue(cuenta1.extraer(1000.00));

	}

}
