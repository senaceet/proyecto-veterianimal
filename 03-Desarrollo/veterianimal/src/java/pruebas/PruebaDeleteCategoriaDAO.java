package pruebas;

import controlador.CategoriaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.categoria;

public class PruebaDeleteCategoriaDAO {

    public static void main(String[] args) throws SQLException {
        CategoriaDAO categoriasDao = new CategoriaDAO();
        ArrayList<categoria> mislistadoscategorias = categoriasDao.consultarlistacategoria(' ', "");

        for (categoria c : mislistadoscategorias) {

            System.out.println("id " + c.getIdCategoria()+ " tipo_de_instrumento: " + c.getDescripcion());

        }

        categoriasDao.DeleteCategoria(mislistadoscategorias.get(0));

        mislistadoscategorias = categoriasDao.consultarlistacategoria(' ', "");

        for (categoria c : mislistadoscategorias) {

            System.out.println("id " + c.getIdCategoria()+ " tipo_de_instrumento: " + c.getDescripcion());

        }

    }

}


