/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelos.Mensajero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Jonh Ladino
 */
public class MensajeroDAO {
     
    public String adicionarMensajero(Mensajero mensa){
    String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
    PreparedStatement sentencia;
    try{
    String Query ="INSERT INTO Mensajero (direccion,identificacion,telefono,nombres " + "VALUES (?,?,?,?";
    sentencia = nuevaCon.prepareStatement(Query);
    sentencia.setInt(1, mensa.getdireccion());
    sentencia.setInt(2, mensa.getidentificacion());
    sentencia.setInt(3, mensa.gettelefono());
    sentencia.setString(4, mensa.getnombres());
    sentencia.execute();
    miRespuesta = "";
    } catch (Exception ex){
       miRespuesta = ex.getMessage();
        System.err.println("Error MensajeroDAO/n" + ex.getMessage());
    }
    return miRespuesta;
    }
    
    
    public Mensajero consultarMensajero(int idMensajero){
       Mensajero mimensa = null;
    
       String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
       
        try{
          Statement sentencia = nuevaCon.createStatement();
          String querySQL= "select idMensajero,direccion,dentificacion,telefono,nombres"
                         + "from Mensajero where idMensajero= '" + idMensajero + "';";
        ResultSet ms = sentencia.executeQuery(querySQL);
                while (ms.next()){
                mimensa = new Mensajero();
                mimensa.setidMensajero(ms.getInt(1));
                mimensa.setdireccion(ms.getInt(2));
                mimensa.setidentificacion(ms.getInt(3));
                mimensa.settelefono(ms.getInt(4));
                mimensa.setnombres(ms.getString(5));
                }
                return mimensa;

        }catch(Exception ex) {
            System.out.println("Error MensajeroDAO : " + ex.getMessage());
            return mimensa;
        }
    }
            
    public String ActualizarMensajero(Mensajero mimensa){
    String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        //Preparacion de la colsulta a ejecutar
        PreparedStatement sentencia;
        try{
           String Query = "update perfiles set direccion = ?, identificacion= ?, telefono= ?, nombres = ? "
                         +"where idMensajero= ?;";
           sentencia = nuevaCon.prepareStatement(Query);
           sentencia.setInt(1, mimensa.getdireccion());
           sentencia.setInt(2, mimensa.getidentificacion());
           sentencia.setInt(3, mimensa.gettelefono());
           sentencia.setString(4, mimensa.getnombres());
           sentencia.setInt(5, mimensa.getidMensajero());
           sentencia.executeUpdate();
           miRespuesta = "";
        }catch (Exception ex) {
           miRespuesta = ex.getMessage();
            System.out.println("Error en MensajeroActualizarDAO." + ex.getMessage());
        }
        return miRespuesta;
    }
    public ArrayList<Mensajero> ConsultarListadoMensajero (int idMensajero, int direccion, int identificacion,int telefono,String nombres){
    ArrayList<Mensajero>misListadosMensajero = new ArrayList<Mensajero> ();
    Mensajero mimensa;    
        
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
       
        // Recibir los criterios de consulta idPerfiles recuperar la informacion
        
        try{
           Statement sentencia = nuevaCon.createStatement();
           //Definir Orden Busquedas
           String querySQL = "select idMensajero,direccion,identificacion,telefono,nombres" +
                          "from Perfiles where idMensajero like '%" + idMensajero + "%'"+
                           "or (direccion) like  ('%" + direccion + "%')" +
                           "or (identificacion) like  ('%" + identificacion + "%')" +
                           "or (telefono) like  ('%" + telefono + "%')" +
                           "or (nombres) like  ('%" + nombres + "%')ORDER BY idMensajero;";
            ResultSet rs = sentencia.executeQuery(querySQL);
           while (rs.next()) {
                //Asignamos los resultados de la busqueda al objeto que retorna
                mimensa = new Mensajero();
                mimensa.setidMensajero(rs.getInt(1));
                mimensa.setdireccion(rs.getInt(2));
                mimensa.setidentificacion(rs.getInt(3));
                mimensa.settelefono(rs.getInt(4));
                mimensa.setnombres(rs.getString(5));
                misListadosMensajero.add(mimensa);
            }
           return misListadosMensajero;
           
        }catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en MensajeroDAO.ConsultarlistadoMensajero" + ex.getMessage());
        }
        return misListadosMensajero;
    }
    public String DeleteMensajero (Mensajero mensa) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
    PreparedStatement sentencia;
    try{
        String Query = " delete from Mensajero where direccion= ?, identificacion = ?, telefono = ?, nombre = ? an idPerfiles= ? ;";
        sentencia= nuevaCon.prepareStatement(Query);
        sentencia.setInt(1, mensa.getdireccion());
        sentencia.setInt(2, mensa.getidentificacion());
        sentencia.setInt(3, mensa.gettelefono());
        sentencia.setString(4, mensa.getnombres());
        sentencia.setInt(5, mensa.getidMensajero());
        sentencia.execute();
        miRespuesta = "";
    }catch(Exception ex){
    miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en MensajeroDAO.DELETEMensajero" + ex.getMessage());
    }
    return miRespuesta;
    }
   
}



