package ar.edu.unalam.pb2.cuentasBancarias;

public abstract class CuentasBancarias {
	protected Double dineroEnCuenta = 0.00;

	public Boolean depositar(Double monto) {

		this.dineroEnCuenta = monto;

		if (dineroEnCuenta == monto && monto > 0) {
			return true;
		} else {
			return false;
		}

	}

	public Double getSaldo() {

		return dineroEnCuenta;
	}

	public abstract Boolean extraer(Double monto);
}
