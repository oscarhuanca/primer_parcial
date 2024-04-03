<%
  Registro item =(Registro)request.getAttribute("miregi");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos recibidos</h1>
        <p>Los datos recibidos son:</p>
        <ul>
            <li>Nombre<%= item.getNombre()%> </li>
            <li>Parcial1<%= item.getParcial1()%></li>
            <li>Parcial2<%= item.getParcial2()%></li>
            <li>ExamenFinal<%= item.getExamenFinal()%></li>
            <li>NotaFinal<%= item.getNotaFianl()%></li>
        </ul>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>