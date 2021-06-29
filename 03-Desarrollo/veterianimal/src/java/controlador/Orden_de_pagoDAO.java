/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelos.Orden_de_pago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Jonh Ladino
 */
public class Orden_de_pagoDAO {
    
    public String adicionarOrden_de_pago(Orden_de_pago mipago){
    
         String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
       try{
         String Query = "INSERT INTO Orden_de_pago (cantidad,precio,descripcion,producto)" + "VALUES (?,?,?,?);";
         sentencia = nuevaCon.prepareStatement(Query);
         sentencia.setInt(1, mipago.getcantidad());
         sentencia.setInt(2, mipago.getprecio());
         sentencia.setString(3, mipago.getdescripcion());
         sentencia.setString(4, mipago.getproducto());
         sentencia.execute();
         miRespuesta ="";
        } catch (Exception ex){
           miRespuesta = ex.getMessage();
           System.err.println("Error Orden_de_pagoDAO/n" + ex.getMessage());
        }
       return miRespuesta;
    }
    public Orden_de_pago consultarOrden_de_pago(int idOrden_de_pago) throws SQLException {
        Orden_de_pago mipago = null;

        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String querySQL = "select idOrden_de_pago,cantidad,precio,descripcion,producto"
                    + "from Orden_de_pago where idOrden_de_pago = '" + idOrden_de_pago + "';";
            ResultSet pa = sentencia.executeQuery(querySQL);
            while (pa.next()) {
                mipago = new Orden_de_pago();
                mipago.setidOrden_de_pago(pa.getInt(1));
            }
            return mipago;
        } catch (Exception ex) {
            System.out.println("Error Orden_de_pago consultasDAO: " + ex.getMessage());
            return mipago;
        }
    }
    
    public String ActualizarOrden_de_pago(Orden_de_pago mipago){
    String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        //Preparacion de la colsulta a ejecutar
        PreparedStatement sentencia;
        try{
           String Query = "update perfiles set  cantidad= ?, precio= ?, descripcion= ?,producto= ? "
                         +"where idOrden_de_pago= ?;";
           sentencia = nuevaCon.prepareStatement(Query);
           sentencia.setInt(1, mipago.getcantidad());
           sentencia.setInt(2, mipago.getprecio());
           sentencia.setString(3, mipago.getdescripcion());
           sentencia.setString(4, mipago.getproducto());
           sentencia.setInt(5, mipago.getidOrden_de_pago());
           sentencia.executeUpdate();
           miRespuesta = "";
        }catch (Exception ex) {
           miRespuesta = ex.getMessage();
            System.out.println("Error en Orden_de_pagoActualizarDAO." + ex.getMessage());
        }
        return miRespuesta;
    }
    public ArrayList<Orden_de_pago> ConsultarListadoOrden_de_pago (int idOrden_de_pago,int cantidad, int precio,String descripcion, String producto){
    ArrayList<Orden_de_pago>misListadosOrden_de_pago = new ArrayList<Orden_de_pago> ();
    Orden_de_pago mipago;    
        
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
       
        // Recibir los criterios de consulta idPerfiles recuperar la informacion
        
        try{
           Statement sentencia = nuevaCon.createStatement();
           //Definir Orden Busquedas
           String querySQL = "select idOrden_de_pago,cantidad,precio,descripcion,producto" +
                          "from Perfiles where idOrden_de_pago like '%" + idOrden_de_pago + "%'"+
                           "or (cantidad) like  ('%" + cantidad + "%')" +
                           "or (precio) like  ('%" + precio + "%')" +
                           "or (descripcion) like  ('%" + descripcion + "%')" +
                           "or (producto) like  ('%" + producto + "%')ORDER BY idOrden_de_pago;";
            ResultSet rs = sentencia.executeQuery(querySQL);
           while (rs.next()) {
                //Asignamos los resultados de la busqueda al objeto que retorna
                mipago = new Orden_de_pago();
                mipago.setidOrden_de_pago(rs.getInt(1));
                mipago.setcantidad(rs.getInt(2));
                mipago.setprecio(rs.getInt(3));
                mipago.setdescripcion(rs.getString(4));
                mipago.setproducto(rs.getString(5));
                misListadosOrden_de_pago.add(mipago);
            }
           return misListadosOrden_de_pago;
           
        }catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en PerfilesDAO.ConsultarlistadoOrden_de_pago" + ex.getMessage());
        }
        return misListadosOrden_de_pago;
    }
    public String DeleteOrden_de_pago  (Orden_de_pago pago) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
    PreparedStatement sentencia;
    try{
        String Query = " delete from Orden_de_pago  where cantidad = ?, precio = ?, descripcion = ?, producto=?  an idPerfiles= ? ;";
        sentencia= nuevaCon.prepareStatement(Query);
        sentencia.setInt(1, pago.getcantidad());
        sentencia.setInt(2, pago.getprecio());
        sentencia.setString(3, pago.getdescripcion());
        sentencia.setString(4, pago.getproducto());
        sentencia.setInt(5, pago.getidOrden_de_pago());
        sentencia.execute();
        miRespuesta = "";
    }catch(Exception ex){
    miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en Orden_de_pago DAO.DELETEOrden_de_pago " + ex.getMessage());
    }
    return miRespuesta;
    }
}


