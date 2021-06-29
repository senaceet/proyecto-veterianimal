package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.tipo_de_documento;

public class TipoDocumentoDAO {

    public String adicionarTipodocumento(tipo_de_documento cliente) {

        String mirespuesta;
        Conexion miconexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miconexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into tipo_de_documento (descripcion)" + "value (?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, cliente.getDescripcion());
            sentencia.execute();
            mirespuesta = " ";
        } catch (Exception ex) {
            mirespuesta = ex.getMessage();
            System.err.println(" Ocurrio error en TipoDocumentoDAO\n" + ex.getMessage());
        }
        return mirespuesta;

    }

    public tipo_de_documento consultarTipodocumento(int idTipo_de_documento) throws SQLException {
        tipo_de_documento referencia = null;

        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();
            //Definimo el orden de busqueda
            String querySQL = "SELECT idTipo_de_documento,descripcion"
                    + " FROM tipo_de_documento WHERE idTipo_de_documento = " + idTipo_de_documento + ";";
            ResultSet rs = sentencia.executeQuery(querySQL);
            while (rs.next()) {
                //ASIGNAMOS LOS RESULTADOS DE LA BUSQUEDE AL OBJETO QUE RETORNA
                referencia = new tipo_de_documento();
                referencia.setIdTipo_de_documento(rs.getInt(1));
                referencia.setDescripcion(rs.getString(2));
            }
            return referencia;

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("ocurrio un error TipoDocumentoDao consultarTipoDocumento :" + ex.getMessage());
        }
        return referencia;
    }

    public String ActualizarTipodocumento(tipo_de_documento referencia) {
        String respuesta;
        Conexion nconexion = new Conexion();
        Connection nuevoconexion;
        nuevoconexion = nconexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update tipo_de_documento set descripcion = ?"
                    + " where idTipo_de_documento = ?;";
            sentencia = nuevoconexion.prepareStatement(Query);
            sentencia.setString(1, referencia.getDescripcion());
            sentencia.setInt(2, referencia.getIdTipo_de_documento());
            sentencia.executeUpdate();
            respuesta = "";
        } catch (Exception ex) {
            respuesta = ex.getMessage();
            System.err.println("ocurrio un error TipoDocumentoDao actualizarTipoDocumento :" + ex.getMessage());
        }

        return respuesta;
    }

    public ArrayList<tipo_de_documento> consultarlistaTipodocumento(int idTipo_de_documento, String descripcion) {

        ArrayList<tipo_de_documento> miusuario = new ArrayList<tipo_de_documento>();
        tipo_de_documento referencia;

        String respuesta;
        Conexion nconexion = new Conexion();
        Connection nuevoconexion;
        nuevoconexion = nconexion.getConn();

        // Recibir los criterios de consulta de idCategoria recupera la informacion
        try {

            Statement sentencia = nuevoconexion.createStatement();
            //Definir Orden de busqueda ORDER BY idUsuario
            String querySQL = "select idTipo_de_documento,descripcion "
                    + "from tipo_de_documento where idTipo_de_documento like '%" + idTipo_de_documento + "%'"
                    + " or (descripcion) like ('%" + descripcion + "%') ORDER BY idTipo_de_documento";
            ResultSet rs = sentencia.executeQuery(querySQL);
            while (rs.next()) {
                referencia = new tipo_de_documento();
                referencia.setIdTipo_de_documento(rs.getInt(1));
                referencia.setDescripcion(rs.getString(2));
                miusuario.add(referencia);
            }
            return miusuario;

        } catch (Exception ex) {
            respuesta = ex.getMessage();
            System.err.println("ocurrio un error TipoDocumentoDao consultarlistaTipoDocumento :" + ex.getMessage());

        }
        return miusuario;

    }

    public String DeleteTipodocumento(tipo_de_documento referencia) {
        String mirespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try {
            String Query = "delete from tipo_de_documento where descripcion = ? and idTipo_de_documento = ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, referencia.getDescripcion());
            sentencia.setInt(2, referencia.getIdTipo_de_documento());
            sentencia.execute();
            mirespuesta = "";

        } catch (Exception ex) {
            mirespuesta = ex.getMessage();
            System.err.println("Ocurrió un error en CategoriaDAO.DeleteCategoria" + ex.getMessage());

        }
        return mirespuesta;
    }

}
