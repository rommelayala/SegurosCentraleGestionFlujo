package beans;

import java.io.Serializable;

public class SeleccionSeguros implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean contenido;
	private boolean continente;

	public SeleccionSeguros() {
		super();
	} // Este m�todo se llama getContenido en vez de

	// isContenido para ser compatible con JSP
	public boolean getContenido() {
		return contenido;
	}

	public void setContenido(boolean contenido) {
		this.contenido = contenido;
	}

	// Este m�todo se llama getContinente en vez de
	// isContinente para ser compatible con JSP
	public boolean getContinente() {
		return continente;
	}

	public void setContinente(boolean continente) {
		this.continente = continente;
	}

}