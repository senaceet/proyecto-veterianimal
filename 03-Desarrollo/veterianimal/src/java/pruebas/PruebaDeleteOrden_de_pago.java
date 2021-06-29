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
public class PruebaDeleteOrden_de_pago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*    
        Orden_de_pagoDAO pagoDao = new Orden_de_pagoDAO();
        Orden_de_pago  pago = pagoDao.consultarOrden_de_pago(0);
        
        if (pago != null){
     
           System.out.println("datos :" + pago.getcantidad() + " " + pago.getprecio() + " " + pago.getdescripcion() + " " + pago.getproducto() + " " + pago.getidOrden_de_pago());
    }else{
        
            System.out.println("EL PAGO NO SE REALIZO :");
        }*/
          Orden_de_pagoDAO pagoDao= new Orden_de_pagoDAO();
          ArrayList<Orden_de_pago> misListadosOrden_de_pago = pagoDao.ConsultarListadoOrden_de_pago(' ', ' ', ' ', " ", " ");
          
          for (Orden_de_pago P: misListadosOrden_de_pago) {
           
          System.out.println("Id. :" + P.getidOrden_de_pago()+ "cantidad : " + P.getcantidad() + "precio" + P.getprecio()+ "descripcion"+ P.getdescripcion()+ "producto" + P.getproducto());
    
    }
         pagoDao.DeleteOrden_de_pago(misListadosOrden_de_pago.get(3));
         misListadosOrden_de_pago =pagoDao.ConsultarListadoOrden_de_pago(' ', ' ', ' ', " ", " ");
                 
          for (Orden_de_pago P: misListadosOrden_de_pago){
           
          System.out.println("Id. :" + P.getidOrden_de_pago()+ "cantidad : " + P.getcantidad() + "precio" + P.getprecio()+ "descripcion"+ P.getdescripcion()+ "producto" + P.getproducto());
    }
        
    }
        
    
}
