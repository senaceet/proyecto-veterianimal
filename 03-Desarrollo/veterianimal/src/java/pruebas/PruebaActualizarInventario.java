/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Controlador.InventarioDAO;
import Modelo.Inventario;
import java.util.Scanner;

/**
 *
 * @author Julián Cepeda
 */
public class PruebaActualizarInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InventarioDAO INVENTARIOdao = new InventarioDAO();
        Inventario miinventario = new Inventario();
        
        Scanner Leer = new Scanner(System.in);
        
        int Cantidad;
        System.out.println("Por favor digite la nueva cantidad del producto");
        Cantidad = Leer.nextInt();
        
        miinventario.setCantidad(Cantidad);
        
        miinventario.setIdInventario(1);
        
        String respuesta = INVENTARIOdao.ActualizarInventario(miinventario);
        
      
        
        if (respuesta.length() == 0){
            System.out.println("Marca actualizada");
        }else {
            System.out.println("No se ha podido actualizar la marca" + respuesta);
        }
    }
    
}
