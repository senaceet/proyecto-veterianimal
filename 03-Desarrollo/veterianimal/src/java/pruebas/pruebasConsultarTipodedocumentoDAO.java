package pruebas;

import controlador.TipoDocumentoDAO;
import java.sql.SQLException;
import modelo.tipo_de_documento;

public class pruebasConsultarTipodedocumentoDAO {

    public static void main(String[] args)throws SQLException {
         TipoDocumentoDAO tipoDocumentodao = new TipoDocumentoDAO();
        tipo_de_documento referencia = tipoDocumentodao.consultarTipodocumento(1);
        
        if (referencia != null){
             System.out.println("Dato Encontrado : " + referencia.getIdTipo_de_documento()+ " - " + referencia.getDescripcion());
        
        } else{
            System.out.println("Dato no encontrado en la BD");
            
        }
    }

}
