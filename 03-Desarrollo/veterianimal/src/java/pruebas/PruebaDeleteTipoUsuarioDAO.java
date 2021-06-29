/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.TiposUsuariosDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.tipos_de_usuario;

/**
 *
 * @author LiLu
 */
public class PruebaDeleteTipoUsuarioDAO {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws SQLException {
        TiposUsuariosDAO tipousuarioDao = new TiposUsuariosDAO();
        ArrayList<tipos_de_usuario> mislistadoscategorias = tipousuarioDao.consultarlistaTiposUsuarios(' ', "");

        for (tipos_de_usuario c : mislistadoscategorias) {

            System.out.println("id " + c.getIdTipos_de_usuario()+ " Descripcion: " + c.getDescripcion());

        }

        tipousuarioDao.DeleteTiposUsuarios(mislistadoscategorias.get(1));

        mislistadoscategorias = tipousuarioDao.consultarlistaTiposUsuarios(' ', "");

        for (tipos_de_usuario c : mislistadoscategorias) {

            System.out.println("id " + c.getIdTipos_de_usuario()+ " Descripcion: " + c.getDescripcion());

        }

    }
    
}
