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
public class PruebasDeleteVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
        VentaDAO ventaDao = new VentaDAO();
        Venta miventa = ventaDao.consultarVenta(0);
        
        if (miventa != null){
     
           System.out.println("datos :" + miventa.getProducto() + " " + miventa.getCliente() + " " + miventa.getidVenta());
    }else{
        
            System.out.println("EL PERFIL NO EXISTE:");
        }*/
        
          VentaDAO ventaDao= new VentaDAO();
          ArrayList<Venta> misListadosVenta = ventaDao.ConsultarListadoVenta(' ', " ", " ");
          
          for (Venta P: misListadosVenta) {
           
          System.out.println("Id. :" + P.getidVenta()+ "Producto : " + P.getProducto()+ "Cliente" + P.getCliente());
    
    }
         ventaDao.DeleteVenta(misListadosVenta.get(3));
         misListadosVenta =ventaDao.ConsultarListadoVenta(' ', " ", " ");
                 
          for (Venta P: misListadosVenta){
           
          System.out.println("Id. :" + P.getidVenta()+ "Producto : " + P.getProducto()+ "Cliente" + P.getCliente());
    }
    }
    
    
}
