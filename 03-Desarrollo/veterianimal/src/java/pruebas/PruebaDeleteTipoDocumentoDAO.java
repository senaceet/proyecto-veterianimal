/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.TipoDocumentoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.tipo_de_documento;

/**
 *
 * @author LiLu
 */
public class PruebaDeleteTipoDocumentoDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        TipoDocumentoDAO documentoDao = new TipoDocumentoDAO();
        ArrayList<tipo_de_documento> milistadodocumento = documentoDao.consultarlistaTipodocumento(' ', "");

        for (tipo_de_documento c : milistadodocumento) {

            System.out.println("id " + c.getIdTipo_de_documento()+ " descripcion: " + c.getDescripcion());

        }

        documentoDao.DeleteTipodocumento(milistadodocumento.get(0));

        milistadodocumento = documentoDao.consultarlistaTipodocumento(' ', "");

        for (tipo_de_documento c : milistadodocumento) {

            System.out.println("id " + c.getIdTipo_de_documento()+ " descripcion: " + c.getDescripcion());

        }

    }
    
}
