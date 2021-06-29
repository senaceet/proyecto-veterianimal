/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Controlador.CarritoDAO;
import modelo.carrito;
import java.util.Scanner;

/**
 *
 * @author Julián Cepeda
 */
public class PruebaAdicionarCarritoDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarritoDAO CARRITOdao = new CarritoDAO();
        carrito micarrito = new carrito();

        Scanner Leer = new Scanner(System.in);

        int Metodos_de_pago_idMetodos_de_pago;

        System.out.println("Por favor digite el id de metodo de pago ");
        Metodos_de_pago_idMetodos_de_pago = Leer.nextInt();
        micarrito.setMetodos_de_pago_idMetodos_de_pago(Metodos_de_pago_idMetodos_de_pago);
        String respuesta1 = CARRITOdao.adicionarCarrito(micarrito);

        if (respuesta1.length() == 0) {
            System.out.println("Método de pago Registrado");
        } else {
            System.out.println("Error" + respuesta1);
        }

    }
}
