package modelo;

import beans.ContinenteDetalles;
import beans.ContenidoDetalles;

public class PrimaSeguro {

	public static final int CUATROVIENTOS = 1;
	public static final int SEMIADOSADA = 2;
	public static final int ADOSADA = 3;
	public static final int PISO = 4;

	public static double getPrimaContinente(
			ContinenteDetalles continenteDetalles) {
		System.out.println("en PrimaSeguro::getPrimaContinente");
		double prima = 0.0;
		double primaBasica = continenteDetalles.getValorMercado() * .002;
		int continente = 0;
		String tipoPropiedad = continenteDetalles.getTipoPropiedad();

		if (tipoPropiedad.equals("piso")) {
			continente = PISO;
		}
		if (tipoPropiedad.equals("semiadosada")) {
			continente = SEMIADOSADA;
		}

		if (tipoPropiedad.equals("adosada")) {
			continente = ADOSADA;
		}

		if (tipoPropiedad.equals("aislada")) {
			continente = CUATROVIENTOS;
		}

		switch (continente) {
		case CUATROVIENTOS:
			prima = primaBasica * 1.1;
			break;
		case SEMIADOSADA:
			prima = primaBasica * 1.05;
			break;
		case ADOSADA:
			prima = primaBasica * 1;
			break;
		case PISO:
			prima = primaBasica * 0.95;
		}
		prima = prima
				+ (continenteDetalles.getNumeroHabitaciones() * (prima / 100));
		String anyoCadena = continenteDetalles.getFechaConstruccion()
				.substring(7, 10);
		int anyo = Integer.parseInt(anyoCadena);

		switch (anyo) {
		case 00:
			prima += prima * .04;
			break;
		case 01:
			prima += prima * .03;
			break;
		case 51:
			prima += prima * .02;
			break;
		case 71:
			prima += prima * .01;
		}

		if (continenteDetalles.getTipoConstruccion().equals("madera")) {
			prima += (prima * 0.1);
		}

		System.out.println("Prima calculada " + prima);
		return prima;
	}

	public static double getPrimaContenido(ContenidoDetalles contenidoDetalles) {
		System.out.println("en PrimaSeguro::getPrimaContenido");
		boolean coberturaAccidentes = contenidoDetalles
				.getCoberturaAccidentes();
		int cobertura = contenidoDetalles.getImporteCobertura();
		int deducible = contenidoDetalles.getImporteDeducible();

		// Calcular la prima inicial

		double prima = cobertura * 0.004;

		if (coberturaAccidentes) {
			prima *= 1.25;
		}
		if (deducible >= 1000) {
			prima -= (prima * 0.2);
		} else {
			if (deducible >= 500) {
				prima -= (prima * 0.1);
			}
		}
		return prima;
	}

}