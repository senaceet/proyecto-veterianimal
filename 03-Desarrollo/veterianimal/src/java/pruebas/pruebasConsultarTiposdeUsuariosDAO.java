
package pruebas;

import controlador.TiposUsuariosDAO;
import java.sql.SQLException;
import modelo.tipos_de_usuario;

public class pruebasConsultarTiposdeUsuariosDAO {

    
    public static void main(String[] args)throws SQLException {
         TiposUsuariosDAO tipousuariodao = new TiposUsuariosDAO();
         tipos_de_usuario referencia = tipousuariodao.consultarTiposUsuarios(1);
        
        if (referencia != null){
             System.out.println("Dato Encontrado : " + referencia.getIdTipos_de_usuario()+ " - " + referencia.getDescripcion());
        
        } else{
            System.out.println("Dato no encontrado en la BD");
            
        }
    }
    
}
