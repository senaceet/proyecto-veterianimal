/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.UsuarioDAO;
import java.sql.SQLException;
import java.util.Scanner;
import modelo.usuario;

/**
 *
 * @author LiLu
 */
public class PruebaadiccionarUsuarioDAO {

    public static void main(String[] args) throws SQLException {

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuario misusuarios = new usuario();

        Scanner Leer = new Scanner(System.in);

        String nombres = " ";
        int identificacion;
        String Direccion = " ";
        String Username = " ";
        String clave = " ";
        int Tipo_de_documento_idTipo_de_documento;
        int Tipos_de_usuario_idTipos_de_usuario;

        System.out.println("Por favor digite tipo de documento(numero id)");
        Tipo_de_documento_idTipo_de_documento = Leer.nextInt();
        misusuarios.setTipo_de_documento_idTipo_de_documento(Tipo_de_documento_idTipo_de_documento);

        System.out.println("Por favor digite tipo de (numero id)");
        Tipos_de_usuario_idTipos_de_usuario = Leer.nextInt();
        misusuarios.setTipos_de_usuario_idTipos_de_usuario(Tipos_de_usuario_idTipos_de_usuario);

        System.out.println("Por favor digite un nombre");
        nombres = Leer.next();
        misusuarios.setNombres(nombres);

        System.out.println("Por favor digite la identificacion");
        identificacion = Leer.nextInt();
        misusuarios.setIdentificacion(identificacion);

        System.out.println("Por favor digite el Username del perfil");
        Username = Leer.next();
        misusuarios.setUsername(Username);
        
        System.out.println("Por favor digite el contraseña del perfil");
        clave = Leer.next();
        misusuarios.setClave(clave);

        System.out.println("Por favor digite la direccion");
        Direccion = Leer.next();
        misusuarios.setDireccion(Direccion);

        String respuesta = usuarioDAO.adicionarTipoUsuario(misusuarios);
        if (respuesta.length() == 0) {
            System.out.println("Tipo de usuario registrado");
        } else {
            System.out.println("Error" + respuesta);
        }
    }

}
