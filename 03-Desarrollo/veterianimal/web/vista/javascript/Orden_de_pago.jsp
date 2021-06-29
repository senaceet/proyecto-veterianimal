<%-- 
    Document   : Orden_de_pago
    Created on : 22/06/2021, 08:09:42 PM
    Author     : Kevin Ladino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Orden_de_pago</title>
    </head>
    <body>
        <div class ="Formulario">
        <h1>Orden_de_pago</h1>
        <form action  ="/Orden de pago" method="post">
            
            <label>cantidad</label><input type ="text" name ="numero">
            <label>precio</label><input type ="text" name ="numero">
            <label>descripcion</label><input type="text" name="descripcion">
            <label>producto</label><input type="text" name="producto">
            <input type="Submit" name="Enviar " id="boton">
            
          </form>
        </div>
      </body>
   </html>

