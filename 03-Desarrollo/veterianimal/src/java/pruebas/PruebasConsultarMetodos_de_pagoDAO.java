/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import modelo.metodos_de_pago;
import controlador.Metodos_de_pagoDAO;


/**
 *
 * @author Jonh Ladino
 */
public class PruebasConsultarMetodos_de_pagoDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos_de_pagoDAO metodos_de_pagoDao = new Metodos_de_pagoDAO();
        metodos_de_pago mipago = metodos_de_pagoDao.consultarMetododepago(2);
        
        if (mipago != null){
            System.out.println("Dato encontrado :" + mipago.getidMetodo_de_pago() + " - " + mipago);
        }else {
            System.out.println("Dato no encontrado en la BD");
        }

    }
    
}
