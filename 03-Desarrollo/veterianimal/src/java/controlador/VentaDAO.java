/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelos.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jonh Ladino
 */
public class VentaDAO {
    
    public String adicionarVenta(Venta ventas){
    
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
    
   PreparedStatement sentencia;
   try{
      String Query = "INSERT INTO Venta (Producto,Numero_de_productos,Valor_de_productos)"+ "VALUES (?,?)";
      sentencia = nuevaCon.prepareStatement(Query);
      sentencia.setString(1, ventas.getProducto());
      sentencia.setString(2, ventas.getCliente());
      sentencia.execute();
      miRespuesta = "";
   }catch (Exception ex){
        miRespuesta = ex.getMessage();
        System.err.println("Ocurrio error VentaDAO/n" + ex.getMessage());
   }
   return miRespuesta;
   }
    
   public Venta consultarVenta(int idVenta){
     Venta ventas = null;
       
       String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
   
        
   try {
      Statement sentencia = nuevaCon.createStatement();
      
      String querySQL ="select idventa,Producto,Numero_de_productos,Valor_de_productos"
                       +"from Venta where idventa = '" + idVenta + "';";
      ResultSet vt = sentencia.executeQuery(querySQL);
      while (vt.next()){
         ventas = new Venta();
         ventas.setidVenta(vt.getInt(1));
         ventas.setProducto(vt.getString(2));
         ventas.setCliente(vt.getString(3));
        
      }
      return ventas;
   }catch (Exception ex){
       System.out.println("Error en VentaDAO consulta : " + ex.getMessage());
       return ventas;
   }
   }     
   
   public String ActualizarVenta(Venta ventas){
    String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        //Preparacion de la colsulta a ejecutar
        PreparedStatement sentencia;
        try{
           String Query = "update perfiles set Producto = ?, Producto = ?, Cliente = ?; "
                   + "where idVenta = ?;";
           sentencia = nuevaCon.prepareStatement(Query);
           sentencia.setString(1, ventas.getProducto());
           sentencia.setString(2, ventas.getCliente());
           sentencia.setInt(3,ventas.getidVenta());
           miRespuesta = "";
        }catch (Exception ex) {
           miRespuesta = ex.getMessage();
            System.out.println("Error en VentaActualizarDAO." + ex.getMessage());
        }
        return miRespuesta;
    }
   public ArrayList<Venta> ConsultarListadoVenta (int idVenta, String Producto, String Cliente){
    ArrayList<Venta>misListadosVenta = new ArrayList<Venta> ();
    Venta miventa;    
        
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
       
        // Recibir los criterios de consulta idPerfiles recuperar la informacion
        
        try{
           Statement sentencia = nuevaCon.createStatement();
           //Definir Orden Busquedas
           String querySQL = "select idVenta,Producto,Cliente" +
                          "from Perfiles where idVenta like '%" + idVenta + "%'"+
                           "or (Producto) like  ('%" + Producto + "%')" +
                          "or (Cliente) like  ('%" + Cliente + "%')ORDER BY idVenta;";
            ResultSet rs = sentencia.executeQuery(querySQL);
           while (rs.next()) {
                //Asignamos los resultados de la busqueda al objeto que retorna
                miventa = new Venta();
                miventa.setidVenta(rs.getInt(1));
                miventa.setProducto(rs.getString(2));
                miventa.setCliente(rs.getString(3));
                misListadosVenta.add(miventa);
            }
           return misListadosVenta;
           
        }catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en VentaDAO.ConsultarlistadoVenta" + ex.getMessage());
        }
        return misListadosVenta;
    }
   public String DeleteVenta (Venta venta) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
    PreparedStatement sentencia;
    try{
        String Query = " delete from Venta where Producto = ?,Cliente =? an idPerfiles= ? ;";
        sentencia= nuevaCon.prepareStatement(Query);
        sentencia.setString(1, venta.getProducto());
        sentencia.setString(2, venta.getCliente());
        sentencia.setInt(3, venta.getidVenta());
        sentencia.execute();
        miRespuesta = "";
    }catch(Exception ex){
    miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en VentaDAO.DELETEVenta" + ex.getMessage());
    }
    return miRespuesta;
    }
}



