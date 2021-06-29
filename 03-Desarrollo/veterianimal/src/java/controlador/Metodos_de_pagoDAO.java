/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.metodos_de_pago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Kevin Ladino
 */
public class Metodos_de_pagoDAO {
    
    public String adicionarMetododepago(metodos_de_pago pago){
    
    String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
    try{
       String Query = "INSERT INTO Metodosdepago(descripcion)" + "Values (?);";
       sentencia = nuevaCon.prepareStatement(Query);
       sentencia.setString(1, pago.getdescripcion());
       sentencia.execute();
       miRespuesta = "";
    }catch (Exception ex){
       miRespuesta = ex.getMessage();
        System.err.println("Error MetodosdepagoDAO/n" + ex.getMessage());
    }
    return miRespuesta;
    }
    
    public metodos_de_pago consultarMetododepago(int idMetodo_de_pago) {
     metodos_de_pago pago = null;
        
    String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
     try{
        Statement sentencia = nuevaCon.createStatement();
         
        String querySQL = "select idMetodo_de_pago,descripcion"
                        + "from Metodosdepago where idMetodo_de_pago = '" + idMetodo_de_pago + "';";
        ResultSet pa = sentencia.executeQuery(querySQL);
        while (pa.next()){
        pago = new metodos_de_pago();
        pago.setidMetodo_de_pago(pa.getInt(1));
        pago.setdescripcion(pa.getString(2));
        }
        return pago;
     }catch (Exception ex) {
         System.out.println("Error MetodosdepagoDAO Consulta : " + ex.getMessage());
         return pago;
     }  
    }
    
    public String ActualizarMetodosdepago(metodos_de_pago pago){
    String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        //Preparacion de la colsulta a ejecutar
        PreparedStatement sentencia;
        try{
           String Query = "update perfiles set descripcion= ?, "
                         +"where idMetodo_de_pago= ?;";
           sentencia = nuevaCon.prepareStatement(Query);
           sentencia.setString(1, pago.getdescripcion());
           sentencia.setInt(2, pago.getidMetodo_de_pago());
           sentencia.executeUpdate();
           miRespuesta = "";
        }catch (Exception ex) {
           miRespuesta = ex.getMessage();
            System.out.println("Error en MetodosdepagoActualizarDAO." + ex.getMessage());
        }
        return miRespuesta;
    }
    public ArrayList<metodos_de_pago> ConsultarListadometodos_de_pago (int idMetodo_de_pago, String descripcion){
     
      ArrayList<metodos_de_pago>misListadosmetodos_de_pago = new ArrayList<metodos_de_pago> ();
      metodos_de_pago pago;    
        
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
       
        // Recibir los criterios de consulta idPerfiles recuperar la informacion
        
        try{
           Statement sentencia = nuevaCon.createStatement();
           //Definir Orden Busquedas
           String querySQL = "select idMetodo_de_pago,descripcion," +
                          "from Perfiles where idMetodo_de_pago like '%" + idMetodo_de_pago + "%'"+
                           "or (descripcion) like  ('%" + descripcion + "%')ORDER BY idMetodo_de_pago";
            ResultSet rs = sentencia.executeQuery(querySQL);
           while (rs.next()) {
                //Asignamos los resultados de la busqueda al objeto que retorna
                pago = new metodos_de_pago();
                pago.setidMetodo_de_pago(rs.getInt(1));
                pago.setdescripcion(rs.getString(2));
                misListadosmetodos_de_pago.add(pago);
            }
           return misListadosmetodos_de_pago;
           
        }catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en Metodos_de_pagoDAO.ConsultarListadometodos_de_pago" + ex.getMessage());
        }
        return misListadosmetodos_de_pago;
    }
    public String Deletemetodos_de_pago(metodos_de_pago  mipago) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
    PreparedStatement sentencia;
    try{
        String Query = " delete from metodos_de_pago  where descripcion = ? an idMetodo_de_pago= ? ;";
        sentencia= nuevaCon.prepareStatement(Query);
        sentencia.setString(1, mipago.getdescripcion());
        sentencia.setInt(2, mipago.getidMetodo_de_pago());
        sentencia.execute();
        miRespuesta = "";
    }catch(Exception ex){
    miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en MetodosdepagoDAO.DELETEmetodos_de_pago " + ex.getMessage());
    }
    return miRespuesta;
    }
}


