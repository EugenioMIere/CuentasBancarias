package ar.edu.unalam.pb2.cuentasBancarias;

public class CajaDeAhorro extends CuentasBancarias {

	private Integer cantidadDeExtracciones = 0;

	public Boolean extraer(Double monto) {

		if (this.dineroEnCuenta >= monto && this.cantidadDeExtracciones < 5 || this.dineroEnCuenta >= monto + 6) {
			cantidadDeExtracciones++;

			if (cantidadDeExtracciones > 5) {
				this.dineroEnCuenta = this.dineroEnCuenta - monto - 6;
			} else {
				this.dineroEnCuenta = this.dineroEnCuenta - monto;
			}
			return true;

		} else {

			return false;
		}

	}

}
