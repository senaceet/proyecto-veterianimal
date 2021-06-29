package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.usuario;

public class UsuarioDAO {

    public String adicionarTipoUsuario(usuario cliente) {

        String mirespuesta;
        Conexion miconexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miconexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into usuario (nombres, identificacion, direccion, username, clave, Tipo_de_documento_idTipo_de_documento, Tipos_de_usuario_idTipos_de_usuario)" + "value (?, ?, ?, ?, ?, ?,?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, cliente.getNombres());
            sentencia.setInt(2, cliente.getIdentificacion());
            sentencia.setString(3, cliente.getDireccion());
            sentencia.setString(4, cliente.getUsername());
            sentencia.setString(5, cliente.getClave());
            sentencia.setInt(6, cliente.getTipo_de_documento_idTipo_de_documento());
            sentencia.setInt(7, cliente.getTipos_de_usuario_idTipos_de_usuario());
            sentencia.execute();
            mirespuesta = " ";
        } catch (Exception ex) {
            mirespuesta = ex.getMessage();
            System.err.println(" Ocurrio error en UsuarioDAO\n" + ex.getMessage());
        }
        return mirespuesta;

    }

    public usuario consultarTipoUsuario(int idusuario) throws SQLException {
        usuario mireferencia = null;

        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();
            //Definimo el orden de busqueda
            String querySQL = "SELECT idUsuario, nombres, identificacion, direccion, username, clave,Tipo_de_documento_idTipo_de_documento, Tipos_de_usuario_idTipos_de_usuario"
                    + " FROM usuario WHERE idUsuario = " + idusuario + ";";
            ResultSet rs = sentencia.executeQuery(querySQL);
            while (rs.next()) {
                //ASIGNAMOS LOS RESULTADOS DE LA BUSQUEDE AL OBJETO QUE RETORNA
                mireferencia = new usuario();
                mireferencia.setIdUsuario(rs.getInt(1));
                mireferencia.setNombres(rs.getString(2));
                mireferencia.setIdentificacion(rs.getInt(3));
                mireferencia.setDireccion(rs.getString(4));
                mireferencia.setUsername(rs.getString(5));
                mireferencia.setClave(rs.getString(6));
                mireferencia.setTipo_de_documento_idTipo_de_documento(rs.getInt(7));
                mireferencia.setTipos_de_usuario_idTipos_de_usuario(rs.getInt(8));
            }
            return mireferencia;

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("ocurrio un error CategoriasDao consultarcategorias :" + ex.getMessage());
        }
        return mireferencia;
    }

    public usuario consultarLogin(String username) throws SQLException {
        usuario mireferencia = null;

        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();
            //Definimo el orden de busqueda
            String querySQL = "SELECT idUsuario, nombres, identificacion, direccion, username, clave,Tipo_de_documento_idTipo_de_documento, Tipos_de_usuario_idTipos_de_usuario"
                    + " FROM usuario WHERE username = "+ '"' + username + '"';
            ResultSet rs = sentencia.executeQuery(querySQL);
            while (rs.next()) {
                //ASIGNAMOS LOS RESULTADOS DE LA BUSQUEDE AL OBJETO QUE RETORNA
                mireferencia = new usuario();
                mireferencia.setIdUsuario(rs.getInt(1));
                mireferencia.setNombres(rs.getString(2));
                mireferencia.setIdentificacion(rs.getInt(3));
                mireferencia.setDireccion(rs.getString(4));
                mireferencia.setUsername(rs.getString(5));
                mireferencia.setClave(rs.getString(6));
                mireferencia.setTipo_de_documento_idTipo_de_documento(rs.getInt(7));
                mireferencia.setTipos_de_usuario_idTipos_de_usuario(rs.getInt(8));
            }
            return mireferencia;

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("ocurrio un error CategoriasDao consultarcategorias :" + ex.getMessage());
        }
        return mireferencia;
    }
    
    public String Actualizarusuario(usuario referencia) {
        String respuesta;
        Conexion nconexion = new Conexion();
        Connection nuevoconexion;
        nuevoconexion = nconexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update usuario set nombres = ?, identificacion = ?, direccion = ?, username = ?, clave = ?,Tipo_de_documento_idTipo_de_documento = ?, Tipos_de_usuario_idTipos_de_usuario = ?"
                    + " where idUsuario = ?;";
            sentencia = nuevoconexion.prepareStatement(Query);
            sentencia.setString(1, referencia.getNombres());
            sentencia.setInt(2, referencia.getIdentificacion());
            sentencia.setString(3, referencia.getDireccion());
            sentencia.setString(4, referencia.getUsername());
            sentencia.setString(5, referencia.getClave());
            sentencia.setInt(6, referencia.getTipo_de_documento_idTipo_de_documento());
            sentencia.setInt(7, referencia.getTipos_de_usuario_idTipos_de_usuario());
            sentencia.setInt(8, referencia.getIdUsuario());
            sentencia.executeUpdate();
            respuesta = "";
        } catch (Exception ex) {
            respuesta = ex.getMessage();
            System.err.println("ocurrio un error CategoriasDao consultarcategorias :" + ex.getMessage());
        }

        return respuesta;
    }

    public ArrayList<usuario> consultarlistausuario(int idusuario, String nombres, int identificacion, String direccion, String username,String clave ,int Tipo_de_documento_idTipo_de_documento, int Tipos_de_usuario_idTipos_de_usuario) {

        ArrayList<usuario> miusuario = new ArrayList<usuario>();
        usuario referencia;

        String respuesta;
        Conexion nconexion = new Conexion();
        Connection nuevoconexion;
        nuevoconexion = nconexion.getConn();

        // Recibir los criterios de consulta de idCategoria recupera la informacion
        try {

            Statement sentencia = nuevoconexion.createStatement();
            //Definir Orden de busqueda ORDER BY idUsuario
            String querySQL = "select idUsuario,nombres,identificacion,direccion,username,clave,Tipo_de_documento_idTipo_de_documento,Tipos_de_usuario_idTipos_de_usuario "
                    + "from usuario where idUsuario like '%" + idusuario + "%'"
                    + " or (nombres) like ('%" + nombres + "%')"
                    + " or (identificacion) like ('%" + identificacion + "%')"
                    + " or (direccion) like ('%" + direccion + "%')"
                    + " or (username) like ('%" + username + "%')"
                    + " or (clave) like ('%" + clave + "%')"
                    + " or (Tipo_de_documento_idTipo_de_documento) like ('%" + Tipo_de_documento_idTipo_de_documento + "%')"
                    + " or (Tipos_de_usuario_idTipos_de_usuario) like ('%" + Tipos_de_usuario_idTipos_de_usuario + "%') ORDER BY idUsuario";
            ResultSet rs = sentencia.executeQuery(querySQL);
            while (rs.next()) {
                referencia = new usuario();
                referencia.setIdUsuario(rs.getInt(1));
                referencia.setNombres(rs.getString(2));
                referencia.setIdentificacion(rs.getInt(3));
                referencia.setDireccion(rs.getString(4));
                referencia.setUsername(rs.getString(5));
                referencia.setClave(rs.getString(6));
                referencia.setTipo_de_documento_idTipo_de_documento(rs.getInt(7));
                referencia.setTipos_de_usuario_idTipos_de_usuario(rs.getInt(8));
                miusuario.add(referencia);
            }
            return miusuario;

        } catch (Exception ex) {
            respuesta = ex.getMessage();
            System.err.println("ocurrio un error tiposUsuariosDao consultarlistatipo_de_usuario :" + ex.getMessage());

        }
        return miusuario;

    }

    public String DeleteUsuario(usuario referencia) {
        String mirespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try {
            String Query = "delete from usuario where nombres = ?, identificacion = ?, direccion = ?, username = ?, contraseña = ?,Tipo_de_documento_idTipo_de_documento = ?, Tipos_de_usuario_idTipos_de_usuario = ? and idUsuario= ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, referencia.getNombres());
            sentencia.setInt(2, referencia.getIdentificacion());
            sentencia.setString(3, referencia.getDireccion());
            sentencia.setString(4, referencia.getUsername());
            sentencia.setString(5, referencia.getClave());
            sentencia.setInt(6, referencia.getTipo_de_documento_idTipo_de_documento());
            sentencia.setInt(7, referencia.getTipos_de_usuario_idTipos_de_usuario());
            sentencia.setInt(8, referencia.getIdUsuario());
            sentencia.execute();
            mirespuesta = "";

        } catch (Exception ex) {
            mirespuesta = ex.getMessage();
            System.err.println("Ocurrió un error en CategoriaDAO.DeleteCategoria" + ex.getMessage());

        }
        return mirespuesta;
    }

}
