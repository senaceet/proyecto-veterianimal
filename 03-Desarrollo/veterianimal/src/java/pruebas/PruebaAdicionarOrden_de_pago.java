/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Modelos.Orden_de_pago;
import controlador.Orden_de_pagoDAO;
import java.util.Scanner;

/**
 *
 * @author Jonh Ladino
 */
public class PruebaAdicionarOrden_de_pago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orden_de_pagoDAO orden_de_pagoDao = new Orden_de_pagoDAO();
        Orden_de_pago mispagos = new Orden_de_pago();

        Scanner Leer = new Scanner(System.in);

        int cantidad = 0;

        System.out.println("Por favor digite la cantidad");
        cantidad = Leer.nextInt();
        mispagos.setcantidad(cantidad);
        String respuesta = orden_de_pagoDao.adicionarOrden_de_pago(mispagos);
        
        int precio = 0;
       
       System.out.println("Por favor digite el precio");
        cantidad = Leer.nextInt();
        mispagos.setprecio(precio);
        
        String descripcion = "";
        
       System.out.println("Por favor digite la descripcion");
        descripcion = Leer.nextLine();
        mispagos.setprecio(precio);
       
        String producto = "";
       
        System.out.println("Por favor digite el producto");
        descripcion = Leer.nextLine();
        mispagos.setprecio(precio);
       
       if (respuesta.length() == 0) {
            System.out.println("pago Registrado");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
    
}
