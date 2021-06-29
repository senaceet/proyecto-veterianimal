package pruebas;

import controlador.TipoDocumentoDAO;
import java.util.Scanner;
import modelo.tipo_de_documento;

public class PruebaActualizarTipoDocumentoDAO {

     public static void main(String[] args) {
        
         TipoDocumentoDAO modeloDAO = new TipoDocumentoDAO();
         tipo_de_documento referencia = new tipo_de_documento();

         Scanner Leer = new Scanner(System.in);

         String Descripcion;

         System.out.println("Por favor digite la nueva descripcion de tipo de documento");
         Descripcion = Leer.nextLine();

         referencia.setDescripcion(Descripcion);

         referencia.setIdTipo_de_documento(1);

         String respuesta = modeloDAO.ActualizarTipodocumento(referencia);

         if (respuesta.length() == 0) {
             System.out.println("Dato Encontrado actualizado ");

         } else {
             System.out.println("Dato no sea actualizado en tipo de documento " + respuesta);

         }
        
    }

}
