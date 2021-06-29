/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Controlador.InventarioDAO;
import Modelo.Inventario;
import java.sql.SQLException;

/**
 *
 * @author Julián Cepeda
 */
public class PruebaConsultarInventarioDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        InventarioDAO INVENTARIOdao = new InventarioDAO();
        Inventario miinventario = INVENTARIOdao.consultarInventario(1);
        if (miinventario != null) {
            System.out.println("dato encontrado : " + miinventario.getIdInventario() + " - " + miinventario.getCantidad());
            System.out.println("dato encontrado : " + miinventario.getIdInventario() + " - " + miinventario.getTotal());
            System.out.println("dato encontrado : " + miinventario.getIdInventario() + " - " + miinventario.getProductos());
        } else {
            System.out.println("dato no encontrado");
        }
    }

}
