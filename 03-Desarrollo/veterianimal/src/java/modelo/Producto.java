/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Julián Cepeda
 */
public class Producto {

   
    
    private int idProducto;
    private String Codigo;
    private String Precio;
    private String Nombre;
    private int Carrito_idCarrito;
    private int Categoria_idCategoria;
    private int inventario_idinventario;

    public int getCarrito_idCarrito() {
        return Carrito_idCarrito;
    }

    public void setCarrito_idCarrito(int Carrito_idCarrito) {
        this.Carrito_idCarrito = Carrito_idCarrito;
    }

    public int getCategoria_idCategoria() {
        return Categoria_idCategoria;
    }

    public void setCategoria_idCategoria(int Categoria_idCategoria) {
        this.Categoria_idCategoria = Categoria_idCategoria;
    }

    public int getInventario_idinventario() {
        return inventario_idinventario;
    }

    public void setInventario_idinventario(int inventario_idinventario) {
        this.inventario_idinventario = inventario_idinventario;
    }
    
    
    
    public int getIdProducto (){
        return idProducto;
    }
    
    public void setIdProducto (int idProducto){
        this.idProducto = idProducto;
    }
    
    public String getCodigo (){
        return Codigo;
    }
    
    public void setCodigo (String Codigo){
        this.Codigo = Codigo;
    }
    
    public String getPrecio (){
        return Precio;
    }
    
    public void setPrecio (String Precio){
        this.Precio = Precio;
    }
    
    public String getNombre (){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
}
