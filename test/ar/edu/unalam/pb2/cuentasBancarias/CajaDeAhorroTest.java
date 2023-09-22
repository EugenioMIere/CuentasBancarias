package ar.edu.unalam.pb2.cuentasBancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CajaDeAhorroTest {

	@Test
	public void queSePuedaDepositarEnLaCuentaRecienCreada() {
		CajaDeAhorro cuenta1 = new CajaDeAhorro();

		Boolean deposito = cuenta1.depositar(22220.00);

		assertTrue(deposito);

	}

	@Test
	public void queSePuedaObtenerElMontoDisponibleEnCuenta() {
		CajaDeAhorro cuenta1 = new CajaDeAhorro();

		cuenta1.depositar(22220.00);
		Double getSaldo = cuenta1.getSaldo();

		assertEquals(getSaldo, 22220, 1.00);
	}

	@Test
	public void queSePuedaExtraeSiHayDineroDisponibleEnLaCuenta() {
		CajaDeAhorro cuenta1 = new CajaDeAhorro();

		cuenta1.depositar(2001.00);
		cuenta1.extraer(1000.00);

		assertTrue(cuenta1.extraer(1001.00));

	}

	@Test
	public void queApartirDeLaSextaExtraccionCobreUnAdicionalDeSeisPorExtraccion() {
		CajaDeAhorro cuenta1 = new CajaDeAhorro();

		cuenta1.depositar(10000.00);
		cuenta1.extraer(1000.00);
		cuenta1.extraer(1000.00);
		cuenta1.extraer(1000.00);
		cuenta1.extraer(1000.00);
		cuenta1.extraer(1000.00);
		cuenta1.extraer(1000.00);
		cuenta1.extraer(1000.00);

		Double getSaldo = cuenta1.getSaldo();

		assertEquals(getSaldo, 2988, 0.1);

	}

}
