/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Kevin Ladino
 */
public class Factura {
 private int idFactura;
 private int F_pedido;
 private int F_entrega;
 private int N_factura;
 private int codigo_de_factura;
 private int Cantidad_del_producto;
 private String Producto;
 
 public int getidFactura(){
    return idFactura;
}
public void setidFactura(int idFactura){
    this.idFactura = idFactura;
}
public int getF_pedido(){
    return  F_pedido;
}
public void setF_pedido(int  F_pedido){
    this. F_pedido =  F_pedido;
}   
public int getF_entrega(){
    return F_entrega;
}
public void setF_entrega(int F_entrega){
    this.F_entrega = F_entrega;
}
public int getN_factura(){
    return N_factura;
}
public void setN_factura(int N_factura){
    this.N_factura = N_factura;
}
public int getcodigo_de_factura(){
    return codigo_de_factura;
}
public void setcodigo_de_factura(int codigo_de_factura){
    this.codigo_de_factura = codigo_de_factura;
}
public int getCantidad_del_producto(){
    return Cantidad_del_producto;
}
public void setCantidad_del_producto(int Cantidad_del_producto){
    this.Cantidad_del_producto = Cantidad_del_producto;
}
public String getProducto(){
    return Producto;
}
public void setProducto(String Producto){
    this.Producto = Producto;
}
}
