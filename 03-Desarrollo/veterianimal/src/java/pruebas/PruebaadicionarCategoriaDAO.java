/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.CategoriaDAO;
import java.sql.SQLException;
import java.util.Scanner;
import modelo.categoria;

/**
 *
 * @author LiLu
 */
public class PruebaadicionarCategoriaDAO {

    public static void main(String[] args) throws SQLException {

        CategoriaDAO modeloDAO = new CategoriaDAO();
        categoria referencia = new categoria();

        Scanner Leer = new Scanner(System.in);

        String Descripcion = " ";

        System.out.println("Por favor digite la categoria que desea ingresar");
        Descripcion = Leer.next();
        referencia.setDescripcion(Descripcion);
        String respuesta = modeloDAO.adicionarCategoria(referencia);

        if (respuesta.length() == 0) {
            System.out.println("Categoria registrado");
        } else {
            System.out.println("Error" + respuesta);
        }

    }

}
