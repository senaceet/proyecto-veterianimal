/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import modelo.marcas;
import Controlador.MarcasDAO;

/**
 *
 * @author LiLu
 */
public class PruebaDeleteMarcas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MarcasDAO MARCASdao = new MarcasDAO();
        ArrayList<marcas> mislistadosmarcas = MARCASdao.ConsultarListadoMarcas(' ', "");

        for (marcas M : mislistadosmarcas) {

            System.out.println("id " + M.getIdMarcas() + " descripcion: " + M.getDescripcion());

        }

        MARCASdao.DeleteMarcas(mislistadosmarcas.get(0));

        mislistadosmarcas = MARCASdao.ConsultarListadoMarcas(' ', "");

        for (marcas M : mislistadosmarcas) {

            System.out.println("id " + M.getIdMarcas() + " descripcion: " + M.getDescripcion());

        }
    }

}
