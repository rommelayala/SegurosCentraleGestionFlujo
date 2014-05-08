package beans;

import java.text.NumberFormat;
import java.io.Serializable;

public class ContinenteDetalles implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoPropiedad;
	private int numeroHabitaciones;
	private String fechaConstruccion;
	private String tipoConstruccion;
	private int valorMercado;
	
	private double primaSeguro;

	public ContinenteDetalles() {
		super();
	}

	public String getTipoPropiedad() {
		return tipoPropiedad;
	}

	public void setTipoPropiedad(String tipoPropiedad) {
		this.tipoPropiedad = tipoPropiedad;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public String getFechaConstruccion() {
		return fechaConstruccion;
	}

	public void setFechaConstruccion(String fechaConstruccion) {
		this.fechaConstruccion = fechaConstruccion;
	}

	public String getTipoConstruccion() {
		return tipoConstruccion;
	}

	public void setTipoConstruccion(String tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}

	public int getValorMercado() {
		return valorMercado;
	}

	public void setValorMercado(int valorMercado) {
		this.valorMercado = valorMercado;
	}

	public double getPrimaSeguro() {
		return primaSeguro;
	}

	public String getPrimaSeguroFormateada() {
		NumberFormat monedaFormato = NumberFormat.getCurrencyInstance();
		return monedaFormato.format(getPrimaSeguro());
	}

	public void setPrimaSeguro(double primaSeguro) {
		this.primaSeguro = primaSeguro;
	}
}