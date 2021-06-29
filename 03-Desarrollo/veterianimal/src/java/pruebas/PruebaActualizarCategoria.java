
package pruebas;

import controlador.CategoriaDAO;
import java.util.Scanner;
import modelo.categoria;


public class PruebaActualizarCategoria {

    public static void main(String[] args) {

        CategoriaDAO modeloDAO = new CategoriaDAO();
        categoria referencia = new categoria();

        Scanner Leer = new Scanner(System.in);

        String Descripcion;

        System.out.println("Por favor digite la nueva descripcion de categoria");
        Descripcion = Leer.nextLine();

        referencia.setDescripcion(Descripcion);

        referencia.setIdCategoria(1);

        String respuesta = modeloDAO.Actualizarcategoria(referencia);

        if (respuesta.length() == 0) {
            System.out.println("Dato Encontrado actualizado ");

        } else {
            System.out.println("Dato no sea actualizado en categoria" + respuesta);

        }

    }
    
}
