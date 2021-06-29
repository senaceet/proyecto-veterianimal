<%-- 
    Document   : Mensajero
    Created on : 22/06/2021, 07:46:53 PM
    Author     : Kevin Ladino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Mensajero</title>
    </head>
    <body>
        <div class ="Formulario">
        <h1>Datos factura</h1>
        <form action  ="/Mensajero" method="post">
            
            <label>direccion</label><input type ="text" name ="direccion">
            <label>identificacion</label><input type ="text" name ="identificacion">
            <label>telefono</label><input type="text" name="telefono">
            <label>nombres</label><input type="text" name="nombres">
            <input type="Submit" name="Enviar " id="boton">
            
            
          </form>
        </div>
      </body>
   </html>

