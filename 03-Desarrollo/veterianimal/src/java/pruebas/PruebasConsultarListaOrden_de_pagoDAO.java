/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Modelos.Orden_de_pago;
import controlador.Orden_de_pagoDAO;
import java.util.ArrayList;

/**
 *
 * @author Jonh Ladino
 */
public class PruebasConsultarListaOrden_de_pagoDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Orden_de_pagoDAO orden_de_pagoDao = new Orden_de_pagoDAO();
         ArrayList<Orden_de_pago>misListadosOrden_de_pago  = new ArrayList<Orden_de_pago> ();
         misListadosOrden_de_pago = orden_de_pagoDao.ConsultarListadoOrden_de_pago(' ', ' ', ' ', " ", " ");
         
         int size = misListadosOrden_de_pago.size();
         
         System.out.println("<table border=\"1\")><br><td>idOrden_de_pago</td<td>cantidad></td><td>precio</td><td>descripcion</td><td>producto</td>");
         
         for (Orden_de_pago  L : misListadosOrden_de_pago ) {
         
             System.out.println("<tr>");
             System.out.println("<tr>" + L.getidOrden_de_pago() + "</td>");
             System.out.println("<tr>" + L.getcantidad() + "</td>");
             System.out.println("<tr>" + L.getprecio() + "</td>");
             System.out.println("<tr>" + L.getdescripcion() + "</td>");
             System.out.println("<tr>" + L.getproducto() + "</td>");
             
             
             System.out.println("</table>");
         }
    }
    
}
