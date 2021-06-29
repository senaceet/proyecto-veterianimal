<%-- 
    Document   : venta
    Created on : 22/06/2021, 08:12:52 PM
    Author     : Kevin Ladino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>venta</title>
    </head>
    <body>
        <div class ="Formulario">
        <h1>venta</h1>
        <form action  ="/venta" method="post">
            
            <label>producto</label><input type="text" name="producto">
            <label>descripcion</label><input type="text" name="descripcion">
            <input type="Submit" name="Enviar " id="boton">
            
          </form>
        </div>
      </body>
   </html>
