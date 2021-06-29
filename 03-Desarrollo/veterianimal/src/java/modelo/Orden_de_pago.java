/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Jonh Ladino
 */
public class Orden_de_pago {
private int idOrden_de_pago;
private int cantidad;  
private int precio;
private String descripcion;
private String producto;


public int getidOrden_de_pago(){
    return idOrden_de_pago;
}
public void setidOrden_de_pago(int idOrden_de_pago){
    this.idOrden_de_pago = idOrden_de_pago ;
}
public int getcantidad(){
    return cantidad;
}
public void setcantidad(int cantidad){
    this.cantidad = cantidad ;
}
public void setprecio(int precio){
    this.precio = precio ;
}
public int getprecio(){
    return precio;
}
public void setdescripcion(String descripcion){
    this.descripcion = descripcion;
}
public String getdescripcion(){
    return descripcion;
}
public String getproducto(){
    return producto;
}
public void setproducto(String producto){
    this.producto= producto ;
}
}
