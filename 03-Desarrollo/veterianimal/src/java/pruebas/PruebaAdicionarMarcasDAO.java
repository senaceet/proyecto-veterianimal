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
public class PruebaAdicionarMarcasDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MarcasDAO MARCASdao = new MarcasDAO();
        marcas mimarcas = new marcas();

        Scanner Leer = new Scanner(System.in);

        String Descripcion = "";

        System.out.println("Por favor digite la marca del producto");
        Descripcion = Leer.next();
        mimarcas.setDescripcion(Descripcion);
        String respuesta = MARCASdao.adicionarCategoria(mimarcas);
        if (respuesta.length() == 0) {
            System.out.println("Marca del producto registrada");
        } else {
            System.out.println("Error" + respuesta);
        }

    }
}
