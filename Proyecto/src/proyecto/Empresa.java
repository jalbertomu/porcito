/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
enum RazonSocial{SA, SL, SLU, UNIPERSONAL};
public class Empresa {
    String nombre;
    String direccion;
    String usuario;
    String contraseña;
    Enum RazonSocial;
    String ciudad;
    String telefono;
    String provincia;
    
    public Empresa (String usuario, String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Empresa(String nombre, String direccion, String usuario, String contraseña, Enum RazonSocial, String ciudad, String telefono, String provincia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.RazonSocial = RazonSocial;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.provincia = provincia;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
