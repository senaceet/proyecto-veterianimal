/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Controlador.MarcasDAO;
import java.util.ArrayList;
import modelo.marcas;

/**
 *
 * @author LiLu
 */
public class PruebaConsultaListadoMarcas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MarcasDAO MARCASdao = new MarcasDAO();
        ArrayList<marcas> miListadoMarcas = new ArrayList<marcas>();
        miListadoMarcas = MARCASdao.ConsultarListadoMarcas(' ', "");

        int size = miListadoMarcas.size();

        System.out.println("<table border=\"1\"><br><td>idMarcas</td><td>descripcion</td>");

        for (marcas L : miListadoMarcas) {

            System.out.println("<tr>");
            System.out.println("<td>" + L.getIdMarcas() + "</td>");
            System.out.println("<td>" + L.getDescripcion() + "</td>");
            System.out.println("</tr>");
        }
        System.out.println("</table>");
    }
}
