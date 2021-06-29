package pruebas;

import controlador.UsuarioDAO;
import java.util.Scanner;
import modelo.usuario;

public class PruebaActualizarUsuario {

    public static void main(String[] args) {
        
        UsuarioDAO modeloDAO = new UsuarioDAO();
        usuario referencia = new usuario();
        
        Scanner Leer = new Scanner (System.in);
        
        String nombre;
        int identificacion;
        String Direccion;
        String Username;
        String Contraseña;
        int Tipo_de_documento_idTipo_de_documento;
        int Tipos_de_usuario_idTipos_de_usuario;
        
        System.out.println("Por favor digite el nuevo nombre de usuario");
        nombre = Leer.next();
        
        System.out.println("Por favor digite la nueva identificacion de usuario");
        identificacion = Leer.nextInt();
        
        System.out.println("Por favor digite la nueva direccion de usuario");
        Direccion = Leer.next();
        
        System.out.println("Por favor digite el nuevo username de usuario");
        Username = Leer.next();
        
        System.out.println("Por favor digite la nueva contraseña de usuario");
        Contraseña = Leer.next();
        
        System.out.println("Por favor digite el id de tipo de documento");
        Tipo_de_documento_idTipo_de_documento = Leer.nextInt();
        
        System.out.println("Por favor digite el id de tipo de usuario");
        Tipos_de_usuario_idTipos_de_usuario = Leer.nextInt();
        
        referencia.setNombres(nombre);
        referencia.setIdentificacion(identificacion);
        referencia.setDireccion(Direccion);
        referencia.setUsername(Username);
        referencia.setTipo_de_documento_idTipo_de_documento(Tipo_de_documento_idTipo_de_documento);
        referencia.setTipos_de_usuario_idTipos_de_usuario(Tipos_de_usuario_idTipos_de_usuario);
        referencia.setIdUsuario(1);
        
        String respuesta = modeloDAO.Actualizarusuario(referencia);
        
        if (respuesta.length() == 0){
             System.out.println("Dato Encontrado actualizado ");
        
        } else{
            System.out.println("Dato no sea actualizado en usuario" + respuesta);
            
        }
    }

}
