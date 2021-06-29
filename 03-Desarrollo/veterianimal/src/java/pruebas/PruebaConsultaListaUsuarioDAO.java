
package pruebas;

import controlador.UsuarioDAO;
import java.util.ArrayList;
import modelo.usuario;


public class PruebaConsultaListaUsuarioDAO {

   
    public static void main(String[] args) {
       UsuarioDAO referencia = new UsuarioDAO();
        ArrayList<usuario> miusuario = new ArrayList<usuario>();
        miusuario = referencia.consultarlistausuario(' ', "", ' ', "", "", "",' ',' ');

        int size = miusuario.size();
        System.out.println("<table border=\"1\"><br><td>idUsuario</td><td>nombres</td><td>identificacion</td><td>direccion</td><td>username</td><td>clave</td><td>idTipo_de_documento</td><td>idTipos_de_usuario</td>");

        for (usuario L : miusuario) {

            System.out.println("<tr>");
            System.out.println("<td>" + L.getIdUsuario()+ "</td>");
            System.out.println("<td>" + L.getNombres()+ "</td>");
            System.out.println("<td>" + L.getIdentificacion()+ "</td>");
            System.out.println("<td>" + L.getDireccion()+ "</td>");
            System.out.println("<td>" + L.getUsername()+ "</td>");
            System.out.println("<td>" + L.getClave()+ "</td>");
            System.out.println("<td>" + L.getTipo_de_documento_idTipo_de_documento()+ "</td>");
            System.out.println("<td>" + L.getTipos_de_usuario_idTipos_de_usuario()+ "</td>");
            System.out.println("</tr>");

        }
        System.out.println("</table>");
    }
    
}
