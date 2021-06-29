/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Modelos.Mensajero;
import controlador.MensajeroDAO;
import java.util.Scanner;

/**
 *
 * @author Jonh Ladino
 */
public class PruebaAdicionarMensajeroDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MensajeroDAO mensajeroDao = new MensajeroDAO();
        Mensajero mimensa = new Mensajero();

        Scanner Leer = new Scanner(System.in);

        int direccion = 0;

        System.out.println("Por favor digite la direccion");
        direccion = Leer.nextInt();
        mimensa.setdireccion(direccion);
        String respuesta = mensajeroDao.adicionarMensajero(mimensa);
        
         int identificacion = 0;

        System.out.println("Por favor digite la identificacion");
        identificacion = Leer.nextInt();
        mimensa.setidentificacion(identificacion);
        
        int telefono= 0;

        System.out.println("Por favor digite el telefono");
        telefono = Leer.nextInt();
        mimensa.settelefono(telefono);
        
        String nombres= " ";

        System.out.println("Por favor digite su nombres");
        nombres = Leer.nextLine();
        mimensa.setnombres(nombres);
        if (respuesta.length() == 0) {
            System.out.println("datos Registrados");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}
