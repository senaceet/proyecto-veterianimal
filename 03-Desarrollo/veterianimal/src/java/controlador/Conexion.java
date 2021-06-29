/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LiLu
 */
public class Conexion {
    private Connection conn;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String basededatos = "veterianimal";
    private String url = "jdbc:mysql://localhost:3306/" + basededatos + "?useTimezone=true&serverTimezone=UTC";

    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn == null){
                System.out.println("No se pudo establecer la conexion"+ "\n" + url);
            }else {
                System.out.println("conexion establecida a la base de datos veterianmal");
            }
            
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        
        } 

    }
    public Connection getConn(){
        return conn;
    }
}
