/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.Conexion;
import java.sql.Connection;

/**
 *
 * @author LiLu
 */
public class Pruebaconexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esta es la prueba de conexion
        
        Conexion con = new Conexion();
        Connection reg = con.getConn();
    }
    
}
