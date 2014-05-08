<%@ page contentType="text/html; charset=utf-8" %>
<jsp:useBean id="selseguros" class="beans.SeleccionSeguros"
	scope="session" />
<jsp:useBean id="contenido" class="beans.ContenidoDetalles"
	scope="session" />
<jsp:useBean id="continente" class="beans.ContinenteDetalles"
	scope="session" />

<!DOCTYPE html PUBLIC
 "-//W3C//DTD XHTML 1.1//EN"
 "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
<head>
<link href="seguroscentrales.css" rel="stylesheet" type="text/css" />
<title>SegurosCentrales prima del seguro</title>
</head>

<body>
	<h1>Prima resultante</h1>
	<%
		if (selseguros.getContinente()) {
	%>
	<h2>Su prima de Continente:</h2>
	<jsp:getProperty name="continente" property="primaSeguroFormateada" />
	<%
		}
		if (selseguros.getContenido()) {
	%>
	<h2>Su prima de Contenido:</h2>
	<jsp:getProperty name="contenido" property="primaSeguroFormateada" />
	<%
		}
		session.invalidate();
	%>
	<form action="seleccionseguros.html" method="get">
		<input type="submit"
			value="Gracias por confiar en nosotros, ahora regresaremos a la pagina inicial" />
	</form>
</body>
</html>