package pruebas;

import controlador.UsuarioDAO;
import java.sql.SQLException;
import modelo.usuario;

public class pruebasConsultarUsuarioDAO {

    public static void main(String[] args) throws SQLException {

        UsuarioDAO usuariodao = new UsuarioDAO();
       usuario usuarios = usuariodao.consultarTipoUsuario(1);

        if (usuarios != null) {
            System.out.println("Dato Encontrado : " + usuarios.getIdUsuario()+ " - " + usuarios.getNombres() + " - " + usuarios.getDireccion() + " - " + usuarios.getIdentificacion() + " - " + usuarios.getDireccion() + " - " + usuarios.getUsername());

        } else {
            System.out.println("Dato no encontrado en la BD");

        }

    }

}
