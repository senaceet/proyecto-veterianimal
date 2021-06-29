package Controlador;

import modelo.marcas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MarcasDAO {

    public String adicionarCategoria(marcas referencia) {

        String miRespuesta;
        controlador.Conexion miConexion = new controlador.Conexion();
        Connection NuevaCon;
        NuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "INSERT INTO marcas (Descripcion)" + "VALUES (?)";
            sentencia = NuevaCon.prepareStatement(Query);
            sentencia.setString(1, referencia.getDescripcion());
            sentencia.execute();

            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio error MarcasDAO\n" + ex.getMessage());
        }
        return miRespuesta;
    }

    public marcas consultarMarcas(int idMarcas) throws SQLException {
        marcas mimarcas = null;

        String mirespuesta;
        controlador.Conexion miConexion = new controlador.Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String quierySQL = "select idMarcas,descripcion"
                    + " from Marcas where idMarcas =" + idMarcas + "; ";

            ResultSet res = sentencia.executeQuery(quierySQL);
            while (res.next()) {
                // asignamos resultados de la busqueda al objeto que retorna
                mimarcas = new marcas();
                mimarcas.setIdMarcas(res.getInt(1));
                mimarcas.setDescripcion(res.getString(2));

            }
            return mimarcas;

        } catch (Exception ex) {

            System.out.println("ocurrio un error MarcasDAOconsultardescripcion:" + ex.getMessage());
            return mimarcas;

        }
    }

    public String ActualizarMarcas(marcas referencia) {
        String miRespuesta;
        controlador.Conexion miConexion = new controlador.Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        //preparacion de la consulta a ejecutar

        PreparedStatement sentencia;

        try {
            String Query = "update marcas set descripcion = ?"
                    + " where idMarcas = ?;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, referencia.getDescripcion());
            sentencia.setInt(2, referencia.getIdMarcas());
            sentencia.executeUpdate();
            miRespuesta = "";
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ocurrió un error en MarcasDAO.ActualizarMarcas" + ex.getMessage());

        }
        return miRespuesta;

    }

    public ArrayList<marcas> ConsultarListadoMarcas(int idMarcas, String descripcion) {
        ArrayList<marcas> miListadoMarcas = new ArrayList<marcas>();
        marcas mimarcas;

        String miRespuesta;
        controlador.Conexion miConexion = new controlador.Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String querySQL = "select idMarcas,descripcion "
                    + "from marcas where idMarcas like '%" + idMarcas + "%'"
                    + " or (descripcion) like ('%" + descripcion + "%') ORDER BY idMarcas;";
            ResultSet rs = sentencia.executeQuery(querySQL);
            while (rs.next()) {

                mimarcas = new marcas();
                mimarcas.setIdMarcas(rs.getInt(1));
                mimarcas.setDescripcion(rs.getString(2));
                miListadoMarcas.add(mimarcas);
            }
            return miListadoMarcas;
        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.out.println("Ocurrió un error en MarcasDAO.ActualizarMarcas" + ex.getMessage());

        }
        return miListadoMarcas;
    }
    
    public String DeleteMarcas (marcas marcas){
        String mirespuesta;
        controlador.Conexion miConexion = new controlador.Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try{
            String Query = "delete from marcas where descripcion = ? and idMarcas = ?;"; 
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString (1, marcas.getDescripcion());
            sentencia.setInt(2, marcas.getIdMarcas());
            sentencia.execute();
            mirespuesta = "";

        }catch (Exception ex){
            mirespuesta = ex.getMessage();
            System.err.println("Ocurrió un error en MarcasDAO.DeleteMarcas" + ex.getMessage());

        }
         return mirespuesta;
    }
}
