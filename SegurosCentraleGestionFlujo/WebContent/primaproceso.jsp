<%@ page import="modelo.PrimaSeguro" %>

<jsp:useBean id="selseguros" class="beans.SeleccionSeguros" scope="session" />
<jsp:useBean id="continente" class="beans.ContinenteDetalles" scope="session" />
<jsp:useBean id="contenido" class="beans.ContenidoDetalles" scope="session" />

<%
// Obtener la prima para una poliza de continente (si se requiere)
if(selseguros.getContinente())
{
 double primaContinente = PrimaSeguro.getPrimaContinente(continente);

 // actualizar los detalles del continente con la prima
 continente.setPrimaSeguro(primaContinente);
}

//Obtener la prima para una poliza de contenido (si se requiere)
if(selseguros.getContenido())
{
 double primaContenido = PrimaSeguro.getPrimaContenido(contenido);

 //actualizar los detalles del contenido con la prima
 contenido.setPrimaSeguro(primaContenido);
}
%>
