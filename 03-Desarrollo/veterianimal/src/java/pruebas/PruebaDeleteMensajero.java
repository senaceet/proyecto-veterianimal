/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Modelos.Mensajero;
import controlador.MensajeroDAO;
import java.util.ArrayList;

/**
 *
 * @author Jonh Ladino
 */
public class PruebaDeleteMensajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/* 
        MensajeroDAO mensaDao = new MensajeroDAO();
        Mensajero mimensa = mensaDao.consultarMensajero(1);
        
        if (mimensa != null){
     
           System.out.println("datos :" + mimensa.getdireccion() + " " +mimensa.getidentificacion()+" "+mimensa.gettelefono()+" "+mimensa.getnombres() +" "+ mimensa.getidMensajero());
    }else{
        
            System.out.println("LOS DATOS NO EXISTEN:");
    }*/
          MensajeroDAO mensaDao= new MensajeroDAO();
          ArrayList<Mensajero> misListadosMensajero = mensaDao.ConsultarListadoMensajero(' ', ' ', ' ',' '," ");
          
          for (Mensajero P: misListadosMensajero) {
           
          System.out.println("Id. :" + P.getidMensajero()+ "direccion : " + P.getdireccion()+ "identificacion:"+ P.getidentificacion()+ "telefono:" +P.gettelefono()+"nombres:" +P.getnombres());
    
    }
         mensaDao.DeleteMensajero(misListadosMensajero.get(3));
         misListadosMensajero =mensaDao.ConsultarListadoMensajero(' ', ' ', ' ',' '," ");
                 
          for (Mensajero P: misListadosMensajero){
           
          System.out.println("Id. :" + P.getidMensajero()+ "direccion : " + P.getdireccion()+ "identificacion:"+ P.getidentificacion()+ "telefono:" +P.gettelefono()+"nombres:" +P.getnombres());
    }
}
}