
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device=width, initial-scale=1.0">
        <title>Inicio</title>
        <link rel="stylesheet" media="screen" href="../vista/css/index.css">
        <link rel="stylesheet" href="../vista/css/fonts.css">
        <script src="../vista/javascript/index.js"></script>
    </head>
    <body>
        <section class="admin">
            <p>Bienvenido a Veterianimal<p>
        </section>
        <header>
            <nav id="menu">
                <ul>
                    <li><a href="../vista/Index.jsp"><span class="primero"><i class="icon icon-home"></i></span>Inicio</a></li>
                    <li><a href="#"><span class="segundo"><i class="icon icon-shopping-bag"></i></span>Tienda</a>
                        <ul>
                            <li><a href="#">Marcas</a></li>
                            <li><a href="#">Categoria</a></li>
                            <li><a href="#">Productos</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><span class="tercero"><i class="icon icon-cart"></i></span>Carrito</a>
                        <ul>
                            <li><a href="../vista/javascript/IniciarSesion.jsp">Inicio de Sesion</a></li>
                            <li><a href="../vista/javascript/Carrito.jsp">Carrito</a></li>

                        </ul>
                    </li>
                    <li><a href="#"><span class="cuarto "><i class="icon icon-rss"></i></span>Contacto</a></li>
                </ul>
            </nav>
        </header>
        <div class="container">
  
    <ul class="slider">
      <li id="slide1">
        <img src="../vista/imagenes/fondo4.jpg"/>
      </li>
      <li id="slide2">
        <img src="../vista/imagenes/fondo5.jpg"/>
      </li>
      <li id="slide3">
        <img src="../vista/imagenes/fondo3.jpg"/>
      </li>
    </ul>
    
    <ul class="menu">
      <li>
        <a href="#slide1">1</a>
      </li>
      <li>
        <a href="#slide2">2</a>
      </li>
       <li>
        <a href="#slide3">3</a>
      </li>
    </ul>
    
  </div>

        <section class="categoria"></section>
        <section class="uno">
            <p>Comida</p>
            <a href="#" class="verproducto">Ver productos</a>
        </section>
        <section class="uno dos">

            <p>Juguetes</p>
            <a href="#" class="verproducto">Ver productos</a>
        </section>
        <section class="uno dos">
            <p>Salud</p>
            <a href="#" class="verproducto">Ver productos</a>
        </section>
        <section class="productos_nuevos">
            <p class="titulo">Productos Nuevos</p>
            <section class="producto">
                <section class="inicio dos">
                    <a href="#" class="verproducto1">Ver productos</a>
                    <p>producto <br>
                        Descripcion producto<br>
                        COP $10000<br>
                    </p>
                </section>
            </section>

            <section class="producto">
                <section class="inicio dos">
                    <a href="#" class="verproducto1">Ver productos</a>
                    <p>producto<br>
                        Descripcion producto<br>
                        COP $10000<br>
                    </p>
                </section>
            </section>

            <section class="producto">
                <section class="inicio dos">
                    <a href="#" class="verproducto1">Ver productos</a>
                    <p>producto<br>
                        Descripcion producto<br>
                        COP $10000<br>
                    </p>
                </section>
            </section>
        </section>
    </body>
</html>