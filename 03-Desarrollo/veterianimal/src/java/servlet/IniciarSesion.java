/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.usuario;

/**
 *
 * @author LiLu
 */
@WebServlet(name = "IniciarSesion", urlPatterns = {"/IniciarSesion"})
public class IniciarSesion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("password");

        try {

            usuario miusuario = new usuario();
            UsuarioDAO miusuarioDao = new UsuarioDAO();

            miusuario = miusuarioDao.consultarLogin(usuario);

            if (miusuario == null) {

                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Identificacion " + usuario + ", no existe." + "');");
                out.println("</script>");
            } else {
                System.out.println(miusuario.getClave());
                System.out.println(clave);
            }
            if (miusuario.getClave().equals(clave)) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Bienvenido : "
                        + miusuario.getNombres() + "');");
                out.println("window.location.href = '/veterianimal/vista/Index.jsp';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "la clave es incorrecta " + "');");
                out.println("</script>");

            }

        } catch (Exception ex) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('" + "la identificacion es incorrecta :" + usuario + "');");
            out.println("</script>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
