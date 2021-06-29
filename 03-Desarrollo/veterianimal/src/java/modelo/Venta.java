/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author  Ladino
 */
public class Venta {
private int idVenta;
private String Producto;
private String Cliente;


public int getidVenta(){
    return idVenta;
}
public void setidVenta(int idVenta){
    this.idVenta = idVenta;
}
public String getProducto(){
    return Producto;
}
public void setProducto(String Producto){
    this.Producto = Producto;
}
public String getCliente(){
    return Cliente;
}
public void setCliente(String Cliente){
    this.Cliente = Cliente;
}
}
