/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Modelos.Venta;
import controlador.VentaDAO;
import java.util.Scanner;

/**
 *
 * @author Jonh Ladino
 */
public class PruebasAdicionarVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentaDAO ventaDao = new VentaDAO();
        Venta miventa = new Venta();

        Scanner Leer = new Scanner(System.in);

        String Producto = "";

        System.out.println("Por favor digite la descripcion de la compra");
        Producto = Leer.next();
        miventa.setProducto(Producto);
        miventa.setCliente("I");
        String respuesta = ventaDao.adicionarVenta(miventa);
        if (respuesta.length() == 0) {
            System.out.println("Venta Registrada");
        } else {
            System.out.println("Error" + respuesta);
        }
    }
  }
    

