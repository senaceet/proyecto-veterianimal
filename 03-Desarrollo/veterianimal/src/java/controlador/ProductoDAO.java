package Controlador;

import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Julián Cepeda
 */
public class ProductoDAO {

    public String adicionarProducto(Producto Codigo) {

        String miRespuesta;
        controlador.Conexion miConexion = new controlador.Conexion();
        Connection NuevaCon;
        NuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "INSERT INTO producto (codigo,precio,nombre,Carrito_idCarrito,Categoria_idCategoria,inventario_idinventario)" + "VALUES (?, ?, ?, ?, ?, ?)";
            sentencia = NuevaCon.prepareStatement(Query);
            sentencia.setString(1, Codigo.getCodigo());
            sentencia.setString(2, Codigo.getPrecio());
            sentencia.setString(3, Codigo.getNombre());
            sentencia.setInt(4, Codigo.getCarrito_idCarrito());
            sentencia.setInt(5, Codigo.getCategoria_idCategoria());
            sentencia.setInt(6, Codigo.getInventario_idinventario());
            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio error ProductoDAO\n" + ex.getMessage());
        }
        return miRespuesta;
    }

    public Producto consultarProducto(int idProducto) throws SQLException {
        Producto miproducto = null;

        String mirespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String quierySQL = "select idProduccto,codigo,precio,nombre"
                    + " from Producto where idProducto =" + idProducto + "; ";

            ResultSet res = sentencia.executeQuery(quierySQL);
            while (res.next()) {
                // asignamos resultados de la busqueda al objeto que retorna
                miproducto = new Producto();
                miproducto.setIdProducto(res.getInt(1));
                miproducto.setCodigo(res.getString(2));
                miproducto.setPrecio(res.getString(3));
                miproducto.setNombre(res.getString(4));

            }
            return miproducto;

        } catch (Exception ex) {

            System.out.println("ocurrio un error MarcasDAOconsultardescripcion:" + ex.getMessage());
            return miproducto;

        }
    }

    public String ActualizarMarcas(Producto referencia) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        //preparacion de la consulta a ejecutar

        PreparedStatement sentencia;

        try {
            String Query = "update producto set codigo,precio,nombre = ?,?,?"
                    + " where idMarcas = ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, referencia.getCodigo());
            sentencia.setInt(2, referencia.getIdProducto());
            sentencia.setString(3, referencia.getPrecio());
            sentencia.setString(1, referencia.getNombre());
            sentencia.executeUpdate();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ocurrió un error en MarcasDAO.ActualizarProducto" + ex.getMessage());

        }
        return miRespuesta;

    }
}
