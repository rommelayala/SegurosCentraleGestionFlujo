package beans;

import java.text.NumberFormat;
import java.io.Serializable;

public class ContenidoDetalles implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean coberturaAccidentes;
	private int importeCobertura;
	private int importeDeducible;

	private double primaSeguro;

	public ContenidoDetalles() {
		super();
	}

	// Este método se llama getCoberturaAccidentes en vez de
	// isCoberturaAccidentes para ser compatible con JSP
	public boolean getCoberturaAccidentes() {
		return coberturaAccidentes;
	}

	public void setCoberturaAccidentes(boolean coberturaAccidentes) {
		this.coberturaAccidentes = coberturaAccidentes;
	}

	public int getImporteCobertura() {
		return importeCobertura;
	}

	public void setImporteCobertura(int importeCobertura) {
		this.importeCobertura = importeCobertura;
	}

	public int getImporteDeducible() {
		return importeDeducible;
	}

	public void setImporteDeducible(int importeDeducible) {
		this.importeDeducible = importeDeducible;
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