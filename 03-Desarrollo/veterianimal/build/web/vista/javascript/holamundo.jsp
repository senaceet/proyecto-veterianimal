<%-- 
    Document   : holamundo
    Created on : 6/05/2021, 10:16:55 AM
    Author     : Kevin  Ladino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Formulario</title>
<link rel="stylesheet" type="text/css" href="estilos.css">
</head>
<body>
<form>
<h2>FORMULARIO</h2>
<table>
<tr>
<input type="text" name="Cual es su nombre"placeholder="nombre">
<td><input type="text" name="que raza es su perro"placeholder="edad"></td>
<td><input type="text" name="Articulo que desea" placeholder="Articulo que desea"></td>
<td><input type="text" name="Nombre del articulo"placeholder="Raza de su mascota"></td></table>
<textarea name="Articulo deseado" placeholder="Que articulo  desea "></textarea>
<center><table>
<p>Cual de estos articulos desea :</p>
<tr>
<td><input type="radio" name="Comida de perro"value="gusta">Comida de perros</td>
<td><input type="radio" name="medicinas de perros"value="gusta">Comida de gatos</td>
<td><input type="radio" name="Dulces para mascotas"value="gusta">Dulces para mascotas</td>
</td>
</tr>
</table></center>
<input type="email" name="direccion email"placeholder="correo@gmail.com">
<input type="tel"  name="numero"placeholder="su numero de telefono" >
<input type="Submit" name="Enviar " id="boton">
</body>
</html>
