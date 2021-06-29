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
public class PruebaDeletemetodos_de_pago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
         MetodosdepagoDAO elpagoDao = new MetodosdepagoDAO();
         metodos_de_pago  mipago = elpagoDao.consultarMetododepago(0);
        
         if (mipago != null){
     
         System.out.println("datos :" + mipago.getdescripcion() + " " + mipago.getidMetodo_de_pago());
         }else{
        
         System.out.println("EL DATO NO EXISTE:");
         }*/
        Metodos_de_pagoDAO elpagoDao = new Metodos_de_pagoDAO();
        ArrayList<metodos_de_pago> misListadosmetodos_de_pago = elpagoDao.ConsultarListadometodos_de_pago(' ', " ");

        for (metodos_de_pago P : misListadosmetodos_de_pago) {

            System.out.println("Id. :" + P.getidMetodo_de_pago() + "descripcion : " + P.getdescripcion());

        }
        elpagoDao.Deletemetodos_de_pago(misListadosmetodos_de_pago.get(3));
        misListadosmetodos_de_pago = elpagoDao.ConsultarListadometodos_de_pago(' ', " ");

        for (metodos_de_pago P : misListadosmetodos_de_pago) {

            System.out.println("Id. :" + P.getidMetodo_de_pago() + "descripcion : " + P.getdescripcion());
        }
    }
}
