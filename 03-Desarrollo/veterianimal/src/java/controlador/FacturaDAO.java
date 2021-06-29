/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelos.Factura;
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
public class FacturaDAO {
    
    public String adicionarFactura(Factura factu) throws SQLException{
    String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
    
     PreparedStatement sentencia;
     try{
       String Query = "INSERT INTO Factura (F_pedido,F_entrega,N_factura,codigo_de_factura,Cantidad_del_producto,Producto)" +"VALUES (?,?);";
       sentencia = nuevaCon.prepareStatement(Query);
       sentencia.setInt(1, factu.getF_pedido());
       sentencia.setInt(2, factu.getF_entrega());
       sentencia.setInt(3, factu.getN_factura());
       sentencia.setInt(4, factu.getcodigo_de_factura());
       sentencia.setInt(5, factu.getCantidad_del_producto());
       sentencia.setString(6, factu.getProducto());
       sentencia.execute();
       miRespuesta = "";
     }catch (Exception ex){
        miRespuesta = ex.getMessage();
         System.err.println("Error FacturaDAO/n" + ex.getMessage());
     }
       return miRespuesta;
    }
    
    public Factura consultarFactura(int idFactura) throws SQLException{
      Factura factu = null;
      
      String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
      
    try {
    Statement sentencia = nuevaCon.createStatement();
    
    String querySQL = "select idFactura,F_pedido,F_entrega,N_factura,Cantidad_del_producto,Producto"
                    + "from Perfiles where idFactura = '" + idFactura + "';";
            ResultSet ft = sentencia.executeQuery(querySQL);
            while (ft.next()) {
                //Asignamos los resultados de la busqueda al objeto que retorna
                factu = new Factura();
                factu.setidFactura(ft.getInt(1));
                factu.setF_pedido(ft.getInt(2));
                factu.setF_entrega(ft.getInt(3));
                factu.setN_factura(ft.getInt(4));
                factu.setCantidad_del_producto(ft.getInt(5));
                factu.setProducto(ft.getString(6));
    }
      return factu;
    }catch (Exception ex){
       System.out.println("Error FacturaConsultaDAO :" + ex.getMessage());
       return factu;
    }
    
}
    
    public String ActualizarFactura(Factura factu){
    String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        //Preparacion de la colsulta a ejecutar
        PreparedStatement sentencia;
        try{
           String Query = "update perfiles set F_pedido = ?, F_entrega= ?, N_factura = ?, codigo_de_factura = ?, Cantidad_del_producto = ?, Producto= ?"
                         +"where idFactura= ?;";
           sentencia = nuevaCon.prepareStatement(Query);
           sentencia.setInt(1, factu.getF_pedido());
           sentencia.setInt(2, factu.getF_entrega());
           sentencia.setInt(3, factu.getN_factura());
           sentencia.setInt(4, factu.getcodigo_de_factura());
           sentencia.setInt(5, factu.getCantidad_del_producto());
           sentencia.setString(6, factu.getProducto());
           sentencia.setInt(7, factu.getidFactura());
           sentencia.executeUpdate();
           miRespuesta = "";
        }catch (Exception ex) {
           miRespuesta = ex.getMessage();
            System.out.println("Error en FacturasActualizarDAO." + ex.getMessage());
        }
        return miRespuesta;
    }
public ArrayList<Factura> ConsultarListadoFactura (int idFactura, int F_pedido , int F_entrega,int N_factura,int codigo_de_factura,int Cantidad_del_producto,String Producto ){
    ArrayList<Factura>misListadosFactura = new ArrayList<Factura> ();
    Factura factu;    
        
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
       
        // Recibir los criterios de consulta idPerfiles recuperar la informacion
        
        try{
           Statement sentencia = nuevaCon.createStatement();
           //Definir Orden Busquedas
           String querySQL = "select idFactura,F_pedido,F_entrega,N_factura,codigo_de_factura,Cantidad_del_producto,Producto" +
                          "from Perfiles where idFactura like '%" + idFactura + "%'"+
                           "or (F_pedido) like  ('%" + F_pedido + "%')" +
                           "or (F_entrega) like  ('%" + F_entrega + "%')" +
                           "or (N_factura) like  ('%" + N_factura + "%')" +
                           "or (codigo_de_factura) like  ('%" + codigo_de_factura + "%')" +
                           "or (Cantidad_del_producto) like  ('%" + Cantidad_del_producto + "%')" +
                           "or (Producto) like  ('%" + Producto + "%')ORDER BY idFactura;";
            ResultSet rs = sentencia.executeQuery(querySQL);
           while (rs.next()) {
                //Asignamos los resultados de la busqueda al objeto que retorna
                factu = new Factura();
                factu .setidFactura(rs.getInt(1));
                factu .setF_pedido(rs.getInt(2));
                factu .setF_entrega(rs.getInt(3));
                factu .setN_factura(rs.getInt(4));
                factu .setcodigo_de_factura(rs.getInt(5));
                factu .setCantidad_del_producto(rs.getInt(6));
                factu .setProducto(rs.getString(7));
                misListadosFactura.add(factu);
            }
           return misListadosFactura;
           
        }catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en FacturaDAO.ConsultarListadoFactura" + ex.getMessage());
        }
        return misListadosFactura;
    }
    

public String DeleteFactura (Factura factu) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
    PreparedStatement sentencia;
    try{
        String Query = " delete from Factura where F_pedido = ?, F_entrega = ?, N_factura=?,codigo_de_factura=?,Cantidad_del_producto=?; Producto =? an idFacturas= ? ;";
        sentencia= nuevaCon.prepareStatement(Query);
        sentencia.setInt(1, factu.getF_pedido());
        sentencia.setInt(2, factu.getF_entrega());
        sentencia.setInt(3, factu.getN_factura());
        sentencia.setInt(4, factu.getcodigo_de_factura());
        sentencia.setInt(5, factu.getCantidad_del_producto());
        sentencia.setString(6, factu.getProducto());
        sentencia.setInt(7, factu.getidFactura());
        sentencia.execute();
        miRespuesta = "";
    }catch(Exception ex){
    miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en FacturaDAO.DELETEFactura" + ex.getMessage());
    }
    return miRespuesta;
    }
}
