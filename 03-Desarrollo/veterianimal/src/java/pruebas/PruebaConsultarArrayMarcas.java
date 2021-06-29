/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Controlador.MarcasDAO;
import modelo.marcas;
import java.util.ArrayList;

/**
 *
 * @author Julián Cepeda
 */
public class PruebaConsultarArrayMarcas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

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
