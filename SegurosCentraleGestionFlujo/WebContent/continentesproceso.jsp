<jsp:useBean id="selseguros" class="beans.SeleccionSeguros" scope="session" /><!-- dice voy a buscar la sesion a ver si debo reenviar al contenido porqueu ha marcado las 2 opciones -->

<jsp:useBean id="continente" class="beans.ContinenteDetalles" scope="session" />
<jsp:setProperty name="continente" property="*" />

<%
// seleccionar la siguiente página si también se requiere el seguro de contenidos
if(selseguros.getContenido()) {
response.sendRedirect("contenidos.html");

}
else {
%>
<jsp:include page="primaproceso.jsp" />
<jsp:forward page="primamostrar.jsp" />
<%
}
%>