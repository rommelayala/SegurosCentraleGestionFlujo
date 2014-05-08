<jsp:useBean id="contenido" class="beans.ContenidoDetalles" scope="session" />
<jsp:setProperty name="contenido" property="*" />

<jsp:include page="primaproceso.jsp" />
<jsp:forward page="primamostrar.jsp" />