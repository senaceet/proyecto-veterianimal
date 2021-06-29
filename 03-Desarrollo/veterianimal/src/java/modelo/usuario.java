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
public class usuario {
    
    private int idUsuario;
    private String nombres;
    private int identificacion;
    private String direccion;
    private String username;
    private String clave;
    private int Tipo_de_documento_idTipo_de_documento;
    private int Tipos_de_usuario_idTipos_de_usuario;

  
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        
    }
    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
      public int getTipos_de_usuario_idTipos_de_usuario() {
        return Tipos_de_usuario_idTipos_de_usuario;
    }

    public void setTipos_de_usuario_idTipos_de_usuario(int Tipos_de_usuario_idTipos_de_usuario) {
        this.Tipos_de_usuario_idTipos_de_usuario = Tipos_de_usuario_idTipos_de_usuario;
    }

    public int getTipo_de_documento_idTipo_de_documento() {
        return Tipo_de_documento_idTipo_de_documento;
    }

    public void setTipo_de_documento_idTipo_de_documento(int Tipo_de_documento_idTipo_de_documento) {
        this.Tipo_de_documento_idTipo_de_documento = Tipo_de_documento_idTipo_de_documento;
    }
    

}
