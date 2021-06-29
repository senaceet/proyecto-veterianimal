<%-- 
    Document   : usuarios
    Created on : 6/05/2021, 09:49:41 AM
    Author     : LiLu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Veterianimal</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../css/estilo.css">
        <link rel="stylesheet" href="../css/fonts.css">
        <script type="text/javascript" src="cambiarpestaña.js"></script>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>

        <title>Formulario de registro</title>
    </head>
    <body onload="javascript:cambiarPestanna(pestanas, pestana1);">
        <section class="admin">
            <p>Bienvenido a Veterianimal<p>
        </section>
        <header>
            <nav id="menu">
                <ul>
                    <li><a href="../Index.jsp"><span class="primero"><i class="icon icon-home"></i></span>Inicio</a></li>
                    <li><a href="#"><span class="segundo"><i class="icon icon-shopping-bag"></i></span>Tienda</a>
                        <ul>
                            <li><a href="#">Marcas</a></li>
                            <li><a href="#">Productos</a></li>
                            <li><a href="#">Categorias</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><span class="tercero"><i class="icon icon-cart"></i></span>Carrito</a>
                        <ul>
                            <li><a href="../javascript/IniciarSesion.jsp">Inicio de Sesion</a></li>
                            <li><a href="../javascript/Carrito.jsp">Carrito</a></li>

                        </ul>
                    </li>
                    <li><a href="#"><span class="cuarto "><i class="icon icon-rss"></i></span>Contacto</a></li>
                </ul>
            </nav>
        </header>
        <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
        <div id="pestanas">
            <ul id=lista>
                <li id="pestana1"><a href='javascript:cambiarPestanna(pestanas,pestana1);'>Iniciar Sesion</a></li>
                <li id="pestana2"><a href='javascript:cambiarPestanna(pestanas,pestana2);'>Crear cuenta</a></
            </ul>
        </div>
        <div id="contenidopestanas">
            <div id="cpestana1">
                <form action = "/veterianimal/IniciarSesion" method="post" class="form-register">
                    <input class="controls" type="text" name="usuario" placeholder="Ingrese su nombre">
                    <input class="controls" type="password" name="password"  placeholder="Contraseña">
                    <input class="botones" type="submit" value = "Ingresar">
                </form>

            </div>
            <div id="cpestana2">
                <form  class="form-register">
                    <input class="controls" type="text" name="Nombre" id="nombre" placeholder="Ingrese su nombre">
                    <input class="controls" type="text" name="Apellido" id="apellido" placeholder="Ingrese su apellido">
                    <input class="controls" type="text" name="Usua" id="usua" placeholder="Ingrese su nombre de usuario">
                    <select class= "selected" name=tipodoc>
                        <option selected value="0"> Tipo de documento </option>
                        <option value="1">Cédula Ciudadana</option>
                        <option value="2">Tarjeta de Identidad</option>
                        <option value="3">Pasaporte</option>
                    </select>
                    <input class="controls" type="text" name="Numerodoc" id="numdoc" placeholder="Ingrese su numero de documento">
                    <input class="controls" type="email" name="correo" id="correo" placeholder="Ingrese su correo electronico">
                    <input class="controls" type="password" name="contra" id="contra" placeholder="Ingrese una contraseña">
                    <p>Estoy de acuerdo con los <a href="#">terminos y condiciones de la pagina </a></p>
                    <input class="botones" type="submit" value = "Registrar">
                </form>
            </div>
            <object width="1000" height="400" data="https://codepen.io/isc7" type="text/html"></object>
        </div>
    </body>
</html>

