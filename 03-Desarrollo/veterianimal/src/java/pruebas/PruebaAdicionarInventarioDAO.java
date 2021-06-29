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
public class PruebaAdicionarInventarioDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InventarioDAO INVENTARIOdao = new InventarioDAO();
        Inventario miinventario = new Inventario();

        Scanner Leer = new Scanner(System.in);

        String Productos = "";
        int Cantidad;
        int Total;

        System.out.println("Por favor digite un producto para inventario");
        Productos = Leer.next();
        miinventario.setProductos(Productos);

        System.out.println("Por favor digite la cantidad del producto ingresado");
        Cantidad = Leer.nextInt();
        miinventario.setCantidad(Cantidad);

        System.out.println("Por favor digite el total producto ingresado");
        Total = Leer.nextInt();
        miinventario.setTotal(Total);

        String respuesta = INVENTARIOdao.adicionarInventario(miinventario);

        if (respuesta.length() == 0) {
            System.out.println("Producto registrado en inventario");
        } else {
            System.out.println("Error" + respuesta);
        }
    }

}
