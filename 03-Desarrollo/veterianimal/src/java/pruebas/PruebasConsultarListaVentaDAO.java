/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Modelos.Venta;
import controlador.VentaDAO;
import java.util.ArrayList;

/**
 *
 * @author Jonh Ladino
 */
public class PruebasConsultarListaVentaDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         VentaDAO ventaDao = new VentaDAO();
         ArrayList<Venta>misListadosVenta  = new ArrayList<Venta> ();
         misListadosVenta = ventaDao.ConsultarListadoVenta(' '," "," ");
         
         int size = misListadosVenta.size();
         
         System.out.println("<table border=\"1\")><br><td>idVenta</td<td>Producto></td><td>Cliente</td>");
         
         for (Venta  L : misListadosVenta ) {
         
             System.out.println("<tr>");
             System.out.println("<tr>" + L.getidVenta() + "</td>");
             System.out.println("<tr>" + L.getProducto() + "</td>");
             System.out.println("<tr>" + L.getCliente() + "</td>");
            
             
             
             System.out.println("</table>");
         }
    }
    
}
