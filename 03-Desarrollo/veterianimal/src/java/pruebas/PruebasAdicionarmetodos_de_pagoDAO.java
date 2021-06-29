/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import modelo.metodos_de_pago;
import controlador.Metodos_de_pagoDAO;
import java.util.Scanner;

/**
 *
 * @author Jonh Ladino
 */
public class PruebasAdicionarmetodos_de_pagoDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Metodos_de_pagoDAO metodos_de_pagoDao = new Metodos_de_pagoDAO();
        metodos_de_pago  mipago = new metodos_de_pago ();

        Scanner Leer = new Scanner(System.in);

        String descripcion = "";

        System.out.println("Por favor digite la descripcion del perfil");
        descripcion = Leer.nextLine();
        mipago.setdescripcion(descripcion);
        String respuesta = metodos_de_pagoDao.adicionarMetododepago(mipago);
        if (respuesta.length() == 0) {
            System.out.println("Metodo Registrado");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}
