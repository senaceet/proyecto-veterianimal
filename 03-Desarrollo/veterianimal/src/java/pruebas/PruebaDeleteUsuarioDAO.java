/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.usuario;

/**
 *
 * @author LiLu
 */
public class PruebaDeleteUsuarioDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        ArrayList<usuario> mislistadousuario = usuarioDao.consultarlistausuario(' ', "", ' ', "", "", "",' ', ' ');

        for (usuario c : mislistadousuario) {

            System.out.println("id " + c.getIdUsuario()
                    + " nombres: " + c.getNombres()
                    + " identificacion : " + c.getIdentificacion()
                    + " direccion: " + c.getDireccion()
                    + " Username: " + c.getUsername()
                    + " Clave: " + c.getClave()
                    + "idtipo_documento" + c.getTipo_de_documento_idTipo_de_documento()
                    + "idtipos_de_usuario" + c.getTipos_de_usuario_idTipos_de_usuario()
            );

        }

        usuarioDao.DeleteUsuario(mislistadousuario.get(0));

        mislistadousuario = usuarioDao.consultarlistausuario(' ', "", ' ', "", "", "",' ', ' ');

        for (usuario c : mislistadousuario) {

            System.out.println("id " + c.getIdUsuario()
                    + " nombres: " + c.getNombres()
                    + " identificacion : " + c.getIdentificacion()
                    + " direccion: " + c.getDireccion()
                    + " Username: " + c.getUsername()
                    + " Clave: " + c.getClave()
                    + " idtipo_documento" + c.getTipo_de_documento_idTipo_de_documento()
                    + " idtipos_de_usuario" + c.getTipos_de_usuario_idTipos_de_usuario()
            );

        }

    }

}
