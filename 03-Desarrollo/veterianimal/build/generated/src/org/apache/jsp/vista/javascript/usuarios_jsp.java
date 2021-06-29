package org.apache.jsp.vista.javascript;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Veterianimal</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/estilo.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"cambiarpestaña.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>Formulario de registro</title>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"javascript:cambiarPestanna(pestanas,pestana1);\">\n");
      out.write("      <section class=\"admin\">\n");
      out.write("      <p>Bienvenido a Veterianimal<p>\n");
      out.write("    </section>\n");
      out.write("      <ul class= \"menu\">\n");
      out.write("          <img align=\"left\" src=\"../imagenes/logo.jpeg\" width=\"120\" height=\"57\" />\n");
      out.write("          <li><a href=\"#\">Inicio</a></li>\n");
      out.write("          <li><a href=\"#\">Tienda</a></li>\n");
      out.write("          <li><a href=\"#\">Carrito</a></li>\n");
      out.write("          <li><a href=\"#\">Contacto</a></li>\n");
      out.write("        <li><a href=\"./admin.html\">Soy administrador...</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("            <div id=\"pestanas\">\n");
      out.write("                <ul id=lista>\n");
      out.write("                    <li id=\"pestana1\"><a href='javascript:cambiarPestanna(pestanas,pestana1);'>Iniciar Sesion</a></li>\n");
      out.write("                    <li id=\"pestana2\"><a href='javascript:cambiarPestanna(pestanas,pestana2);'>Crear cuenta</a></\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"contenidopestanas\">\n");
      out.write("                <div id=\"cpestana1\">\n");
      out.write("                  <form action = \"/veterianimal/IniciarSesion\" method=\"post\" class=\"form-register\">\n");
      out.write("                    <input class=\"controls\" type=\"text\" name=\"Usuario\" id=\"nombre\" placeholder=\"Ingrese su nombre\">\n");
      out.write("                    <input class=\"controls\" type=\"password\" name=\"Contraseña\" id=\"apellido\" placeholder=\"Contraseña\">\n");
      out.write("                    <input class=\"botones\" type=\"submit\" value = \"Ingresar\">\n");
      out.write("                  </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div id=\"cpestana2\">\n");
      out.write("                    <form  class=\"form-register\">\n");
      out.write("                    <input class=\"controls\" type=\"text\" name=\"Nombre\" id=\"nombre\" placeholder=\"Ingrese su nombre\">\n");
      out.write("                    <input class=\"controls\" type=\"text\" name=\"Apellido\" id=\"apellido\" placeholder=\"Ingrese su apellido\">\n");
      out.write("                    <input class=\"controls\" type=\"text\" name=\"Usua\" id=\"usua\" placeholder=\"Ingrese su nombre de usuario\">\n");
      out.write("                    <select class= \"selected\" name=tipodoc>\n");
      out.write("                     <option selected value=\"0\"> Tipo de documento </option>\n");
      out.write("                     <option value=\"1\">Cédula Ciudadana</option>\n");
      out.write("                     <option value=\"2\">Tarjeta de Identidad</option>\n");
      out.write("                     <option value=\"3\">Pasaporte</option>\n");
      out.write("                    </select>\n");
      out.write("                    <input class=\"controls\" type=\"text\" name=\"Numerodoc\" id=\"numdoc\" placeholder=\"Ingrese su numero de documento\">\n");
      out.write("                    <input class=\"controls\" type=\"email\" name=\"correo\" id=\"correo\" placeholder=\"Ingrese su correo electronico\">\n");
      out.write("                    <input class=\"controls\" type=\"password\" name=\"contra\" id=\"contra\" placeholder=\"Ingrese una contraseña\">\n");
      out.write("                    <p>Estoy de acuerdo con los <a href=\"#\">terminos y condiciones de la pagina </a></p>\n");
      out.write("                    <input class=\"botones\" type=\"submit\" value = \"Registrar\">\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("                   <object width=\"1000\" height=\"400\" data=\"https://codepen.io/isc7\" type=\"text/html\"></object>\n");
      out.write("                </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
