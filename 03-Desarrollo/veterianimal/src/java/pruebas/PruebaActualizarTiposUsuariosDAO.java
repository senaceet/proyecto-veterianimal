
package pruebas;

import controlador.TiposUsuariosDAO;
import java.util.Scanner;
import modelo.tipos_de_usuario;


public class PruebaActualizarTiposUsuariosDAO {

   
    public static void main(String[] args) {
       TiposUsuariosDAO modeloDAO = new TiposUsuariosDAO();
        tipos_de_usuario referencia = new tipos_de_usuario();
        
        Scanner Leer = new Scanner (System.in);
        
        String Descripcion;
        
        System.out.println("Por favor digite la nueva descripcion de tipo de usuario");
        Descripcion = Leer.nextLine();
        
        referencia.setDescripcion(Descripcion);
        
        referencia.setIdTipos_de_usuario(1);
        
        String respuesta = modeloDAO.ActualizarTiposUsuarios(referencia);
        
        if (respuesta.length() == 0){
             System.out.println("Dato Encontrado actualizado ");
        
        } else{
            System.out.println("Dato no sea actualizado en tipo de documento " + respuesta);
            
        }
    }
    
}
