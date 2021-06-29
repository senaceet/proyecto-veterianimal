/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.CategoriaDAO;
import java.util.ArrayList;
import modelo.categoria;

/**
 *
 * @author LiLu
 */
public class PruebaConsultaListaCategoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CategoriaDAO referencia = new CategoriaDAO();
        ArrayList<categoria> miscategorias = new ArrayList<categoria>();
        miscategorias = referencia.consultarlistacategoria(' ', "");

        int size = miscategorias.size();
        System.out.println("<table border=\"1\"><br><td>idCategoria</td><td>descripcion</td>");

        for (categoria L : miscategorias) {

            System.out.println("<tr>");
            System.out.println("<td>" + L.getIdCategoria() + "</td>");
            System.out.println("<td>" + L.getDescripcion() + "</td>");
            System.out.println("</tr>");

        }
        System.out.println("</table>");
    }

}
