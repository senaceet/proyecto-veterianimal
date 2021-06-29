/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Modelos.Mensajero;
import controlador.MensajeroDAO;

/**
 *
 * @author Jonh Ladino
 */
public class PruebasConsultarMensajeroDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MensajeroDAO mensajeroDao = new MensajeroDAO();
        Mensajero mimensa = mensajeroDao.consultarMensajero(1);
        
        if (mimensa != null){
            System.out.println("Dato encontrado :" + mimensa.getidMensajero() + " - " + mimensa);
        }else {
            System.out.println("Dato no encontrado en la BD");
        }

    }
    
}
