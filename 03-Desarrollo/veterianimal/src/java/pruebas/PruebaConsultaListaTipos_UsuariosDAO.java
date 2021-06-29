package pruebas;

import controlador.TiposUsuariosDAO;
import java.util.ArrayList;

import modelo.tipos_de_usuario;

public class PruebaConsultaListaTipos_UsuariosDAO {

    public static void main(String[] args) {
        TiposUsuariosDAO referencia = new TiposUsuariosDAO();
        ArrayList<tipos_de_usuario> miusuario = new ArrayList<tipos_de_usuario>();
        miusuario = referencia.consultarlistaTiposUsuarios(' ', "");

        int size = miusuario.size();
        System.out.println("<table border=\"1\"><br><td>idTipos_de_usuarios</td><td>Descripcion</td>");

        for (tipos_de_usuario L : miusuario) {

            System.out.println("<tr>");
            System.out.println("<td>" + L.getIdTipos_de_usuario() + "</td>");
            System.out.println("<td>" + L.getDescripcion() + "</td>");
            System.out.println("</tr>");

        }
        System.out.println("</table>");
    }

}
