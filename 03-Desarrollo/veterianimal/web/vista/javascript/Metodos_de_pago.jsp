<%-- 
    Document   : Metodos_de_pago
    Created on : 22/06/2021, 07:56:13 PM
    Author     : Kevin Ladino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Metodos_de_pago</title>
    </head>
    <body>
        <div class ="Formulario">
        <h1>Metodos_de_pago</h1>
        <form action  ="/Metodos_de_pago" method="post">
            
            <label>pago en efectivo</label><input type ="button" name ="efectivo"Placeholder="Si"><input type ="button" name ="efectivo"Placeholder="No">
            <label>pago en tarjeta</label><input type ="button" name ="identificacion"Placeholder="Si"><input type ="button" name ="efectivo"Placeholder="No">
            <label>descripcion</label><input type="text" name="descripcion">
            <input type="Submit" name="Enviar " id="boton">
            
            
            
          </form>
        </div>
      </body>
   </html>

