/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Controlador.ProductoDAO;
import Modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author Julián Cepeda
 */
public class PruebaActualizarProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoDAO MARCASdao = new ProductoDAO();
        Producto mimarcas = new Producto();
        
        Scanner Leer = new Scanner(System.in);
        
        String Codigo;
        System.out.println("Por favor digite el nuevo código del producto");
        Codigo = Leer.nextLine();
        
        mimarcas.setCodigo(Codigo);
        
        mimarcas.setIdProducto(1);
        
        String respuesta = MARCASdao.ActualizarMarcas(mimarcas);
        
        if (respuesta.length() == 0){
            System.out.println("Marca actualizada");
        }else {
            System.out.println("No se ha podido actualizar la marca" + respuesta);
        }
    }
    
}
