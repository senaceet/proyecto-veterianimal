<%-- 
    Document   : Factura
    Created on : 22/06/2021, 07:10:35 PM
    Author     : Kevin Ladino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Factura</title>
    </head>
    <body>
        <div class ="Formulario">
        <h1>Datos factura</h1>
        <form action  ="/Factura" method="post">
            
            <label>Fecha de pedido</label><input type ="text" name ="fecha">
            <label>Fecha de entrega</label><input type ="text" name ="button">
            <label>Numero de factura</label><input type="text" name="Cual es su numero de factura">
            <label>Codigo de factura</label><input type="text" name="Codigo de factura">
            <p><label>Cantidad del producto</label></p><input type="text" name="Cantidad del producto">
            <label>Producto</label><input type="text" name="Producto">
            <input type="Submit" name="Enviar " id="boton">
            
          </form>
        </div>
      </body>
   </html>
