/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



import Modelo.Inventario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Julián Cepeda
 */
public class InventarioDAO {
    
    public String adicionarInventario (Inventario Productos) {
    
    String miRespuesta;
    Conexion miConexion = new Conexion ();
    Connection NuevaCon;
    NuevaCon =  miConexion.getConn();
    
    
    PreparedStatement sentencia;
    try{
        String Query = "INSERT INTO inventario (cantidad,total,productos)"+ "VALUES (?, ?, ?)";
        sentencia = NuevaCon.prepareStatement(Query);
        sentencia.setInt(1, Productos.getCantidad());
        sentencia.setInt(2, Productos.getTotal());
        sentencia.setString(3, Productos.getProductos());
        sentencia.execute();
        miRespuesta = "";
        
    }catch (Exception ex){
    miRespuesta = ex.getMessage();
    System.err.println("Ocurrio error InventarioDAO\n"+ ex.getMessage());
    }
    return miRespuesta;
            
    }


    public Inventario consultarInventario(int idInventario) throws SQLException {
        Inventario miinventario = null;

        String mirespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String quierySQL = "select idInventario,cantidad,total,productos"
                    + " from Inventario where idInventario =" + idInventario + "; ";

            ResultSet res = sentencia.executeQuery(quierySQL);
            while (res.next()) {
                // asignamos resultados de la busqueda al objeto que retorna
                miinventario = new Inventario();
                miinventario.setIdInventario(res.getInt(1));
                miinventario.setCantidad(res.getInt(2));
                miinventario.setTotal(res.getInt(3));
                miinventario.setProductos(res.getString(4));
                
            }
            return miinventario;

        } catch (Exception ex) {

            System.out.println("ocurrio un error MarcasDAOconsultarInventario:" + ex.getMessage());
            return miinventario;

        }
    }

       public String ActualizarInventario (Inventario referencia){
     String miRespuesta;
     Conexion miConexion = new Conexion();
     Connection nuevaCon;
     nuevaCon = miConexion.getConn();
     //preparacion de la consulta a ejecutar
     
     PreparedStatement sentencia;
     
     try{
         String Query = "update inventario set cantidad, total, productos = ?, ?, ?" +
                 " where idInventario = ?;";
         sentencia = nuevaCon.prepareStatement (Query);
         sentencia.setInt(1, referencia.getCantidad());
         sentencia.setInt(2, referencia.getIdInventario());
         sentencia.setInt(3, referencia.getTotal());
         sentencia.setString(2, referencia.getProductos());
         sentencia.executeUpdate();
         miRespuesta = "";
     } catch (Exception ex) {
         miRespuesta = ex.getMessage();
         System.out.println("Ocurrió un error en MarcasDAO.ActualizarInventario"+ ex.getMessage());
         
     }
      return miRespuesta;   
         
         
         
     }  

    





}


