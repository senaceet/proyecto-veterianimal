/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Modelos.Mensajero;
import controlador.MensajeroDAO;
import java.util.ArrayList;

/**
 *
 * @author Jonh Ladino
 */
public class PruebasConsultarListaMensajeroDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MensajeroDAO mensajeroDao = new MensajeroDAO();
         ArrayList<Mensajero>misListadosMensajero  = new ArrayList<Mensajero> ();
         misListadosMensajero = mensajeroDao.ConsultarListadoMensajero(' ', ' ', ' ', ' ', " ");
         
         int size = misListadosMensajero.size();
         
         System.out.println("<table border=\"1\")><br><td>idMensajero</td<td>direccion></td><td>identificacion</td><td>telefono</td><td>nombres</td>");
         
         for (Mensajero  L : misListadosMensajero ) {
         
             System.out.println("<tr>");
             System.out.println("<tr>" + L.getidMensajero() + "</td>");
             System.out.println("<tr>" + L.getdireccion() + "</td>");
             System.out.println("<tr>" + L.getidentificacion() + "</td>");
             System.out.println("<tr>" + L.gettelefono() + "</td>");
             System.out.println("<tr>" + L.getnombres() + "</td>");
             
             
             System.out.println("</table>");
         }
    }
    
}
