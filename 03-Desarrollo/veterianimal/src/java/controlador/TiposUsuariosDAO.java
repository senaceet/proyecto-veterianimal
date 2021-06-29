package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.tipos_de_usuario;

public class TiposUsuariosDAO {

    public String adicionarTiposUsuarios(tipos_de_usuario cliente) {

        String mirespuesta;
        Conexion miconexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miconexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into tipos_de_usuario (descripcion)" + "value (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, cliente.getDescripcion());
            sentencia.execute();
            mirespuesta = " ";
        } catch (Exception ex) {
            mirespuesta = ex.getMessage();
            System.err.println(" Ocurrio error en TiposUsuariosDAO\n" + ex.getMessage());
        }
        return mirespuesta;

    }

    public tipos_de_usuario consultarTiposUsuarios(int idTipos_de_usuario) throws SQLException {
        tipos_de_usuario referencia = null;

        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();
            //Definimo el orden de busqueda
            String querySQL = "SELECT idTipos_de_usuario,descripcion"
                    + " FROM tipos_de_usuario WHERE idTipos_de_usuario = " + idTipos_de_usuario + ";";
            ResultSet rs = sentencia.executeQuery(querySQL);
            while (rs.next()) {
                //ASIGNAMOS LOS RESULTADOS DE LA BUSQUEDE AL OBJETO QUE RETORNA
                referencia = new tipos_de_usuario();
                referencia.setIdTipos_de_usuario(rs.getInt(1));
                referencia.setDescripcion(rs.getString(2));
            }
            return referencia;

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("ocurrio un error TiposUsuariosDao consultarTiposUsuarios:" + ex.getMessage());
        }
        return referencia;
    }

    public String ActualizarTiposUsuarios(tipos_de_usuario referencia) {
        String respuesta;
        Conexion nconexion = new Conexion();
        Connection nuevoconexion;
        nuevoconexion = nconexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update tipos_de_usuario set descripcion = ?"
                    + " where idTipos_de_usuario = ?;";
            sentencia = nuevoconexion.prepareStatement(Query);
            sentencia.setString(1, referencia.getDescripcion());
            sentencia.setInt(2, referencia.getIdTipos_de_usuario());
            sentencia.executeUpdate();
            respuesta = "";
        } catch (Exception ex) {
            respuesta = ex.getMessage();
            System.err.println("ocurrio un error TiposUsuariosDao actualizarTiposUsuarios :" + ex.getMessage());
        }

        return respuesta;
    }

    public ArrayList<tipos_de_usuario> consultarlistaTiposUsuarios(int idTipos_de_usuario, String descripcion) {

        ArrayList<tipos_de_usuario> miusuario = new ArrayList<tipos_de_usuario>();
        tipos_de_usuario referencia;

        String respuesta;
        Conexion nconexion = new Conexion();
        Connection nuevoconexion;
        nuevoconexion = nconexion.getConn();

        // Recibir los criterios de consulta de idCategoria recupera la informacion
        try {

            Statement sentencia = nuevoconexion.createStatement();
            //Definir Orden de busqueda ORDER BY idUsuario
            String querySQL = "select idTipos_de_usuario,descripcion "
                    + "from tipos_de_usuario where idTipos_de_usuario like '%" + idTipos_de_usuario + "%'"
                    + " or (descripcion) like ('%" + descripcion + "%') ORDER BY idTipos_de_usuario";
            ResultSet rs = sentencia.executeQuery(querySQL);
            while (rs.next()) {
                referencia = new tipos_de_usuario();
                referencia.setIdTipos_de_usuario(rs.getInt(1));
                referencia.setDescripcion(rs.getString(2));
                miusuario.add(referencia);
            }
            return miusuario;

        } catch (Exception ex) {
            respuesta = ex.getMessage();
            System.err.println("ocurrio un error TiposUsuariosDao consultarlistaTiposUsuarios :" + ex.getMessage());

        }
        return miusuario;

    }

    public String DeleteTiposUsuarios(tipos_de_usuario referencia) {
        String mirespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try {
            String Query = "delete from tipos_de_usuario where descripcion = ? and idTipos_de_usuario = ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, referencia.getDescripcion());
            sentencia.setInt(2, referencia.getIdTipos_de_usuario());
            sentencia.execute();
            mirespuesta = "";

        } catch (Exception ex) {
            mirespuesta = ex.getMessage();
            System.err.println("Ocurrió un error en CategoriaDAO.DeleteCategoria" + ex.getMessage());

        }
        return mirespuesta;
    }

}
