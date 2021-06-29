package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device=width, initial-scale=1.0\">\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        <link rel=\"stylesheet\" media=\"screen\" href=\"../vista/css/index.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../vista/css/fonts.css\">\n");
      out.write("        <script src=\"../vista/javascript/index.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"admin\">\n");
      out.write("            <p>Bienvenido a Veterianimal<p>\n");
      out.write("        </section>\n");
      out.write("        <header>\n");
      out.write("            <nav id=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"../vista/Index.jsp\"><span class=\"primero\"><i class=\"icon icon-home\"></i></span>Inicio</a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"segundo\"><i class=\"icon icon-shopping-bag\"></i></span>Tienda</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Marcas</a></li>\n");
      out.write("                            <li><a href=\"#\">Categoria</a></li>\n");
      out.write("                            <li><a href=\"#\">Productos</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"tercero\"><i class=\"icon icon-cart\"></i></span>Carrito</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"../vista/javascript/IniciarSesion.jsp\">Inicio de Sesion</a></li>\n");
      out.write("                            <li><a href=\"#\">Carrito</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"cuarto \"><i class=\"icon icon-rss\"></i></span>Contacto</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container\">\n");
      out.write("  \n");
      out.write("    <ul class=\"slider\">\n");
      out.write("      <li id=\"slide1\">\n");
      out.write("        <img src=\"../vista/imagenes/fondo4.jpg\"/>\n");
      out.write("      </li>\n");
      out.write("      <li id=\"slide2\">\n");
      out.write("        <img src=\"../vista/imagenes/fondo5.jpg\"/>\n");
      out.write("      </li>\n");
      out.write("      <li id=\"slide3\">\n");
      out.write("        <img src=\"../vista/imagenes/fondo3.jpg\"/>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    \n");
      out.write("    <ul class=\"menu\">\n");
      out.write("      <li>\n");
      out.write("        <a href=\"#slide1\">1</a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"#slide2\">2</a>\n");
      out.write("      </li>\n");
      out.write("       <li>\n");
      out.write("        <a href=\"#slide3\">3</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("        <section class=\"categoria\"></section>\n");
      out.write("        <section class=\"uno\">\n");
      out.write("            <p>Comida</p>\n");
      out.write("            <a href=\"#\" class=\"verproducto\">Ver productos</a>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"uno dos\">\n");
      out.write("\n");
      out.write("            <p>Juguetes</p>\n");
      out.write("            <a href=\"#\" class=\"verproducto\">Ver productos</a>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"uno dos\">\n");
      out.write("            <p>Salud</p>\n");
      out.write("            <a href=\"#\" class=\"verproducto\">Ver productos</a>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"productos_nuevos\">\n");
      out.write("            <p class=\"titulo\">Productos Nuevos</p>\n");
      out.write("            <section class=\"producto\">\n");
      out.write("                <section class=\"inicio dos\">\n");
      out.write("                    <a href=\"#\" class=\"verproducto1\">Ver productos</a>\n");
      out.write("                    <p>producto <br>\n");
      out.write("                        Descripcion producto<br>\n");
      out.write("                        COP $10000<br>\n");
      out.write("                    </p>\n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section class=\"producto\">\n");
      out.write("                <section class=\"inicio dos\">\n");
      out.write("                    <a href=\"#\" class=\"verproducto1\">Ver productos</a>\n");
      out.write("                    <p>producto<br>\n");
      out.write("                        Descripcion producto<br>\n");
      out.write("                        COP $10000<br>\n");
      out.write("                    </p>\n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section class=\"producto\">\n");
      out.write("                <section class=\"inicio dos\">\n");
      out.write("                    <a href=\"#\" class=\"verproducto1\">Ver productos</a>\n");
      out.write("                    <p>producto<br>\n");
      out.write("                        Descripcion producto<br>\n");
      out.write("                        COP $10000<br>\n");
      out.write("                    </p>\n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
