/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Modelos.Orden_de_pago;
import controlador.Orden_de_pagoDAO;
import java.sql.SQLException;

/**
 *
 * @author Jonh Ladino
 */
public class PruebasConsultarOrden_de_pagoDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Orden_de_pagoDAO orden_de_pagoDao = new Orden_de_pagoDAO();
        Orden_de_pago  pago = orden_de_pagoDao.consultarOrden_de_pago(1);
        
        if (pago != null){
            System.out.println("Dato encontrado :" + pago.getidOrden_de_pago() + " - " + pago);
        }else {
            System.out.println("Dato no encontrado en la BD");
        }

    }
    
}
