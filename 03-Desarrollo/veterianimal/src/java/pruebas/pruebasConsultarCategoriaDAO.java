/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.CategoriaDAO;
import java.sql.SQLException;
import modelo.categoria;

/**
 *
 * @author LiLu
 */
public class pruebasConsultarCategoriaDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        CategoriaDAO categoriadao = new CategoriaDAO();
        categoria categorias = categoriadao.consultarCategoria(1);

        if (categorias != null) {
            System.out.println("Dato Encontrado : " + categorias.getIdCategoria() + " - " + categorias.getDescripcion());

        } else {
            System.out.println("Dato no encontrado en la BD");

        }
    }

}
