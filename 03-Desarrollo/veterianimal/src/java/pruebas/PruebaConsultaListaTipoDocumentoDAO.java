package pruebas;

import controlador.TipoDocumentoDAO;
import java.util.ArrayList;
import modelo.tipo_de_documento;

public class PruebaConsultaListaTipoDocumentoDAO {

    public static void main(String[] args) {
        TipoDocumentoDAO referencia = new TipoDocumentoDAO();
        ArrayList<tipo_de_documento> midocumento = new ArrayList<tipo_de_documento>();
        midocumento = referencia.consultarlistaTipodocumento(' ', "");

        int size = midocumento.size();
        System.out.println("<table border=\"1\"><br><td>idTipo_de_documento</td><td>descripcion</td>");

        for (tipo_de_documento L : midocumento) {

            System.out.println("<tr>");
            System.out.println("<td>" + L.getIdTipo_de_documento()+ "</td>");
            System.out.println("<td>" + L.getDescripcion() + "</td>");
            System.out.println("</tr>");

        }
        System.out.println("</table>");
    }

}
