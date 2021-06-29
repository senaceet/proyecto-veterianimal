/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Controlador.MarcasDAO;
import modelo.marcas;
import java.sql.SQLException;

/**
 *
 * @author Julián Cepeda
 */
public class PruebaConsultarMarcas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        MarcasDAO MARCASDao = new MarcasDAO();
        marcas mimarcas = MARCASDao.consultarMarcas(1);
        if (mimarcas != null) {
            System.out.println("dato encontrado : " + mimarcas.getIdMarcas() + " - " + mimarcas.getDescripcion());
        } else {
            System.out.println("dato no encontrado");
        }

    }

}
