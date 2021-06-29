/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.TipoDocumentoDAO;
import java.sql.SQLException;
import java.util.Scanner;
import modelo.tipo_de_documento;

/**
 *
 * @author LiLu
 */
public class PruebaadicionarTipodocumentoDAO {

    public static void main(String[] args) throws SQLException {
       
        TipoDocumentoDAO documentoDAO = new TipoDocumentoDAO ();
        tipo_de_documento midocumento = new tipo_de_documento();

        Scanner Leer = new Scanner(System.in);

        String Descripcion = " ";

        System.out.println("Por favor digite la descripcion del documento");
        Descripcion = Leer.next();
        midocumento.setDescripcion(Descripcion);
        String respuesta = documentoDAO.adicionarTipodocumento(midocumento);
        if (respuesta.length() == 0) {
            System.out.println("Tipo de docuemento registrado");
        }else {
            System.out.println("Error" + respuesta);
        }
        
    }
    
}
