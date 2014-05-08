<jsp:useBean id="selseguros" class="beans.SeleccionSeguros" scope="session" /><!-- la etiqueta use bean mira si existe eln el scope indicado -->

<jsp:setProperty name="selseguros" property="continente" value="false" /><!--seteo a false por lo que pueda pasar -->
<jsp:setProperty name="selseguros" property="contenido" value="false" />

<jsp:setProperty name="selseguros" property="*" />
<%
// Seleccionar la página destino en función del checkbox marcado

if(selseguros.getContinente())
{
%>
<jsp:forward page="continentes.html"/>
<%
}else{
 if(selseguros.getContenido())
 {
%>
<jsp:forward page="contenidos.html"/>
<%
 }
}
%>