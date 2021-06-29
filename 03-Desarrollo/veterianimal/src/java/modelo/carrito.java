/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LiLu
 */
public class carrito {

    private int idCarrito;
    public int Metodos_de_pago_idMetodos_de_pago;
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMetodos_de_pago_idMetodos_de_pago() {
        return Metodos_de_pago_idMetodos_de_pago;
    }

    public void setMetodos_de_pago_idMetodos_de_pago(int Metodos_de_pago_idMetodos_de_pago) {
        this.Metodos_de_pago_idMetodos_de_pago = Metodos_de_pago_idMetodos_de_pago;
    }

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }
}
