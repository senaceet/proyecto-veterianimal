/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Controlador.MarcasDAO;
import modelo.marcas;
import java.util.Scanner;

/**
 *
 * @author Julián Cepeda
 */
public class PruebaActualizarMarcas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcasDAO MARCASdao = new MarcasDAO();
        marcas mimarcas = new marcas();
        
        Scanner Leer = new Scanner(System.in);
        
        String Descripcion;
        System.out.println("Por favor digite la nueva descripción de la marca");
        Descripcion = Leer.nextLine();
        
        mimarcas.setDescripcion(Descripcion);
        
        mimarcas.setIdMarcas(1);
        
        String respuesta = MARCASdao.ActualizarMarcas(mimarcas);
        
        if (respuesta.length() == 0){
            System.out.println("Marca actualizada");
        }else {
            System.out.println("No se ha podido actualizar la marca" + respuesta);
        }
        
        
    }
    
}
