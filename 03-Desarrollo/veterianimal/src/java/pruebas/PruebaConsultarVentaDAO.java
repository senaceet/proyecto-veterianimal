/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Modelos.Venta;
import controlador.VentaDAO;

/**
 *
 * @author Jonh Ladino
 */
public class PruebaConsultarVentaDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentaDAO ventaDao = new VentaDAO();
        Venta miventa = ventaDao.consultarVenta(2);
        
        if (miventa != null){
            System.out.println("Dato encontrado :" + miventa.getidVenta() + " - " + miventa);
        }else {
            System.out.println("Dato no encontrado en la BD");
        }
    }
    
}
