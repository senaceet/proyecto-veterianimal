<%-- 
    Document   : admin
    Created on : 6/05/2021, 10:51:42 AM
    Author     : LiLu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Registro admins</title>
        <link rel="stylesheet" href="../css/admin.css">
    </head>
    <body>
        <section class=admin2>
            <div align="center"><img src="../imagenes/logo.jpeg" width="150" height="60" /></div>
            <p>Bienvenido a Veterianimal<p>
        </section>
        <ul class= "menu">
            <li><a href="#">Inicio</a></li>
            <li><a href="#">Tienda</a></li>
            <li><a href="#">Carrito</a></li>
            <li><a href="#">Contacto</a></li>
        </ul>
        <section class="form-register">
            <h2>Formulario de registro para administradores</h2>
            <input class="controls" type="text" name="Nombre" id="nombre" placeholder="Ingrese su nombre">
            <input class="controls" type="text" name="Apellido" id="apellido" placeholder="Ingrese su apellido">
            <input class="controls" type="text" name="Usua" id="usua" placeholder="Ingrese su nombre de usuario">
            <select class= "selected" name=tipodoc>
                <option selected value="0"> Tipo de documento </option>
                <option value="1">Cédula Ciudadana</option>
                <option value="2">Tarjeta de Identidad</option>
                <option value="3">Pasaporte</option>
            </select>
            <select class= "admin" name=tipoad>
                <option selected value="0"> Tipo de administrador </option>
                <option value="1">Contador</option>
                <option value="2">Administrador</option>
            </select>
            <input class="controls" type="text" name="Numerodoc" id="numdoc" placeholder="Ingrese su numero de documento">
            <input class="controls" type="email" name="correo" id="correo" placeholder="Ingrese su correo electronico">
            <input class="controls" type="password" name="contra" id="contra" placeholder="Ingrese una contraseña">
            <p>Estoy de acuerdo con los <a href="#">terminos y condiciones de la pagina </a></p>
            <p><a href="ingresoad.html"><input class="botones" type="submit" value = "Registrar"></a></p>
            <p><a href="cuentaad.html">Ya tengo una cuenta</a></p>
        </section>
        <section class="volver">
            <p><a href="usuarios.jsp">volver al formulario de registro</a></p>
        </section>
    </body>
</html>
