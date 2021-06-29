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
public class Mensajero {
private int idMensajero;
private int direccion;
private int identificacion;
private int telefono;
private String nombres;


public int getidMensajero(){
    return idMensajero;
}
public void setidMensajero(int idMensajero){
    this.idMensajero = idMensajero;
}
public int getdireccion(){
    return direccion;
}
public void setdireccion(int direccion){
    this.direccion= direccion;
}
public int getidentificacion(){
    return identificacion;
}
public void setidentificacion(int identificacion){
    this.identificacion = identificacion;
}
public int gettelefono(){
    return telefono;
}
public void settelefono(int telefono){
    this.telefono = telefono;
}
public String getnombres(){
    return nombres;
}
public void setnombres(String nombres){
    this.nombres = nombres;
}
}

