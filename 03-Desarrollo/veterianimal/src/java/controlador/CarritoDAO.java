/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.carrito;

/**
 *
 * @author Julián Cepeda
 */
public class CarritoDAO {
    public String adicionarCarrito (carrito Metodos) {
    
    String miRespuesta;
    controlador.Conexion miConexion = new controlador.Conexion();
    Connection NuevaCon;
    NuevaCon =  miConexion.getConn();
    
    
    PreparedStatement sentencia1;
    try{
        String Query = "INSERT INTO Carrito (Metodos_de_pago_idMetodos_de_pago)"+ "VALUES (?)";
        sentencia1 = NuevaCon.prepareStatement(Query);
        
        sentencia1.setInt(1, Metodos.getMetodos_de_pago_idMetodos_de_pago());
        
        sentencia1.execute();
        miRespuesta = "";
        
    }catch (Exception exe){
        miRespuesta = exe.getMessage();
        System.out.println("Ocurrió un error en CarritoDAO\n"+exe.getMessage());
    }
    return miRespuesta;
            
    }
}
