/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Controlador.ProductoDAO;
import Modelo.Producto;
import java.util.Scanner;
import java.sql.SQLException;

/**
 *
 * @author Julián Cepeda
 */
public class PruebaAdicionarProductoDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        ProductoDAO PRODUCTOdao = new ProductoDAO();
        Producto miproducto = new Producto();

        Scanner Leer = new Scanner(System.in);

        String Precio = " ";
        String Codigo = " ";
        String Nombre = " ";
        int Carrito_idCarrito;
        int Categoria_idCategoria;
        int inventario_idinventario;

        System.out.println("Por favor digite el código del producto");
        Codigo = Leer.next();
        miproducto.setCodigo(Codigo);

        System.out.println("Por favor digite el precio del producto");
        Precio = Leer.next();
        miproducto.setPrecio(Precio);

        System.out.println("Por favor digite el nombre del producto");
        Nombre = Leer.next();
        miproducto.setNombre(Nombre);

        System.out.println("Selecciona tipo de dato(idCarrito)");
        Carrito_idCarrito = Leer.nextInt();
        miproducto.setCarrito_idCarrito(Carrito_idCarrito);

        System.out.println("Selecciona tipo de categoría (idCategoria)");
        Categoria_idCategoria = Leer.nextInt();
        miproducto.setCategoria_idCategoria(Categoria_idCategoria);

        System.out.println("Selecciona tipo de inventario (idinventario)");
        inventario_idinventario = Leer.nextInt();
        miproducto.setInventario_idinventario(inventario_idinventario);
        String respuesta0 = PRODUCTOdao.adicionarProducto(miproducto);

        if (respuesta0.length() == 0) {
            System.out.println("Producto registrado");
        } else {
            System.out.println("Error" + respuesta0);

        }

    }
}
