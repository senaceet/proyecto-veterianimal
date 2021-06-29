/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Kevin Ladino
 */
public class metodos_de_pago {
private int idMetodo_de_pago;
private String descripcion;


public int getidMetodo_de_pago(){
    return idMetodo_de_pago;
}
public void setidMetodo_de_pago(int idMetodo_de_pago){
    this.idMetodo_de_pago = idMetodo_de_pago;
}
public String getdescripcion (){
    return descripcion;
}
public void setdescripcion (String descripcion){
    this.descripcion = descripcion;
}
}
