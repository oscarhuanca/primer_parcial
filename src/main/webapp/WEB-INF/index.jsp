
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Calficaciones</title>
    </head>
    <body>
        <h1>Registro de Calificaciones</h1>
         <form action="ProcesaServlet" method="post">
              <label>Nombre</label>
              <input type="text" name="nombre">
              <br>
              <label>Parcial1</label>
              <input type="text" name="parcial1" value="30">
              <br>
              <label>Parcial2</label>
              <input type="text" name="parcial2" value="30">
              <br>
              <label>ExamenFinal</label>
              <input type="text" name="examenfinal" value="40"><br><br>
        
              <label>NotaFinal</label>
              <input type="text" name="notafinal"><br><br>
       
        <input type="submit" value="Guardar">
    </form>
          
    </body>
</html>
