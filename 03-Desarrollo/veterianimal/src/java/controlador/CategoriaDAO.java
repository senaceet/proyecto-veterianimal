package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.categoria;

public class CategoriaDAO {

    public String adicionarCategoria(categoria cliente) {

        String mirespuesta;
        Conexion miconexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miconexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into categoria (descripcion)" + "value (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, cliente.getDescripcion());
            sentencia.execute();
            mirespuesta = " ";
        } catch (Exception ex) {
            mirespuesta = ex.getMessage();
            System.err.println(" Ocurrio error en CAtegoriaDAO\n" + ex.getMessage());
        }
        return mirespuesta;

    }

    public categoria consultarCategoria(int idCategoria) throws SQLException {
        categoria referencia = null;

        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();
            //Definimo el orden de busqueda
            String querySQL = "SELECT idCategoria,descripcion"
                    + " FROM categoria WHERE idCategoria = " + idCategoria + ";";
            ResultSet rs = sentencia.executeQuery(querySQL);
            while (rs.next()) {
                //ASIGNAMOS LOS RESULTADOS DE LA BUSQUEDE AL OBJETO QUE RETORNA
                referencia = new categoria();
                referencia.setIdCategoria(rs.getInt(1));
                referencia.setDescripcion(rs.getString(2));
            }
            return referencia;

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("ocurrio un error CategoriasDao consultarcategorias :" + ex.getMessage());
        }
        return referencia;
    }

    public String Actualizarcategoria(categoria referencia) {
        String respuesta;
        Conexion nconexion = new Conexion();
        Connection nuevoconexion;
        nuevoconexion = nconexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update categoria set descripcion = ?"
                    + " where idCategoria = ?;";
            sentencia = nuevoconexion.prepareStatement(Query);
            sentencia.setString(1, referencia.getDescripcion());
            sentencia.setInt(2, referencia.getIdCategoria());
            sentencia.executeUpdate();
            respuesta = "";
        } catch (Exception ex) {
            respuesta = ex.getMessage();
            System.err.println("ocurrio un error CategoriasDao actualizarcategorias :" + ex.getMessage());
        }

        return respuesta;
    }

    public ArrayList<categoria> consultarlistacategoria(int idCategoria, String descripcion) {

        ArrayList<categoria> miusuario = new ArrayList<categoria>();
        categoria referencia;

        String respuesta;
        Conexion nconexion = new Conexion();
        Connection nuevoconexion;
        nuevoconexion = nconexion.getConn();

        // Recibir los criterios de consulta de idCategoria recupera la informacion
        try {

            Statement sentencia = nuevoconexion.createStatement();
            //Definir Orden de busqueda ORDER BY idUsuario
            String querySQL = "select idCategoria,descripcion "
                    + "from categoria where idCategoria like '%" + idCategoria + "%'"
                    + " or (descripcion) like ('%" + descripcion + "%') ORDER BY idCategoria";
            ResultSet rs = sentencia.executeQuery(querySQL);
            while (rs.next()) {
                referencia = new categoria();
                referencia.setIdCategoria(rs.getInt(1));
                referencia.setDescripcion(rs.getString(2));
                miusuario.add(referencia);
            }
            return miusuario;

        } catch (Exception ex) {
            respuesta = ex.getMessage();
            System.err.println("ocurrio un error tiposUsuariosDao consultarlistatipo_de_usuario :" + ex.getMessage());

        }
        return miusuario;

    }
    
    public String DeleteCategoria (categoria referencia){
        String mirespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try{
            String Query = "delete from categoria where descripcion = ? and idCategoria = ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, referencia.getDescripcion());
            sentencia.setInt(2, referencia.getIdCategoria());
            sentencia.execute();
            mirespuesta = "";

        }catch (Exception ex){
            mirespuesta = ex.getMessage();
            System.err.println("Ocurrió un error en CategoriaDAO.DeleteCategoria" + ex.getMessage());

        }
         return mirespuesta;
    }

}
