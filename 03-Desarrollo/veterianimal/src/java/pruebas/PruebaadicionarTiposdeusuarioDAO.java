package pruebas;

import controlador.TiposUsuariosDAO;
import java.sql.SQLException;
import java.util.Scanner;
import modelo.tipos_de_usuario;

public class PruebaadicionarTiposdeusuarioDAO {

    public static void main(String[] args) throws SQLException {

        TiposUsuariosDAO usuarioDAO = new TiposUsuariosDAO();
        tipos_de_usuario misusuarios = new tipos_de_usuario();

        Scanner Leer = new Scanner(System.in);

        String Descripcion = " ";

        System.out.println("Por favor digite la descripcion del perfil");
        Descripcion = Leer.next();
        misusuarios.setDescripcion(Descripcion);
        String respuesta = usuarioDAO.adicionarTiposUsuarios(misusuarios);
        if (respuesta.length() == 0) {
            System.out.println("Tipo de usuario registrado");
        } else {
            System.out.println("Error" + respuesta);
        }
    }

}
