/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import modelo.metodos_de_pago;
import controlador.Metodos_de_pagoDAO;
import java.util.ArrayList;

/**
 *
 * @author Jonh Ladino
 */
public class PruebasConsultarListasMetodos_de_pagoDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Metodos_de_pagoDAO Metodo_de_pagoDao = new Metodos_de_pagoDAO();
         ArrayList<metodos_de_pago>misListadosmetodos_de_pago  = new ArrayList<metodos_de_pago> ();
         misListadosmetodos_de_pago = Metodo_de_pagoDao.ConsultarListadometodos_de_pago(' ',"");
         
         int size = misListadosmetodos_de_pago.size();
         
         System.out.println("<table border=\"1\")><br><td>idMetodo_de_pago</td<td>descripcion></td>");
         
         for (metodos_de_pago L : misListadosmetodos_de_pago ) {
         
             System.out.println("<tr>");
             System.out.println("<tr>" + L.getidMetodo_de_pago() + "</td>");
             System.out.println("<tr>" + L.getdescripcion() + "</td>");
             
            
             
             
             System.out.println("</table>");
         }
    }
    
}
