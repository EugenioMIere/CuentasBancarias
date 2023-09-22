package ar.edu.unalam.pb2.cuentasBancarias;

public class CuentaSueldo extends CuentasBancarias {

	public Boolean extraer(Double monto) {

		if (this.dineroEnCuenta >= monto) {
			this.dineroEnCuenta = this.dineroEnCuenta - monto;
			return true;
		} else {
			return false;
		}

	}

}
