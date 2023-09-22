package ar.edu.unalam.pb2.cuentasBancarias;

public class CuentaCorriente extends CuentasBancarias {

	private Double deuda = 0.00;
	private Double dineroDescubirto = 0.00;

	public Boolean extraer(Double monto) {

		if ((this.dineroEnCuenta + (this.dineroDescubirto) * 1.05) >= monto) {

			if (monto > this.dineroEnCuenta) {
				this.deuda = (monto - this.dineroEnCuenta) * 1.05;
				this.dineroDescubirto = this.dineroDescubirto + this.dineroEnCuenta - monto;
				this.dineroEnCuenta = 0.00;

			} else {
				this.dineroEnCuenta = this.dineroEnCuenta - monto;
			}

			return true;
		} else {
			return false;
		}

	}

	public void setDescubierto(Double monto) {
		this.dineroDescubirto = monto;

	}

	public Double getDeuda() {

		return this.deuda;
	}

}
