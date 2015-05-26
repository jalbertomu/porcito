/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

enum EstadoCivil{CASADO, SOLTERO, DIVORCIADO, VIUDO};
enum EstadoEmpresa{DEALTA, DEBAJA, DESPEDIDO};
public class Trabajador {
    String dni;
    String nombre;
    String apellidos;
    String direccion;
    String categoria;
    String puesto;
    String fechaNacimiento;
    Enum EstadoCivil;
    int sueldo;
    int horasExtra;
    int telefono;
    Enum EstadoEmpresa;
    long numeroSeguridadSocial;
    double IRPF;

    public Trabajador() {
    }

    public Trabajador(String dni, String nombre, String apellidos, String direccion, String categoria, String puesto, String fechaNacimiento, 
            Enum EstadoCivil, int sueldo, int horasExtra, int telefono, Enum EstadoEmpresa, long numeroSeguridadSocial, double IRPF) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.categoria = categoria;
        this.puesto = puesto;
        this.fechaNacimiento = fechaNacimiento;
        this.EstadoCivil = EstadoCivil;
        this.sueldo = sueldo;
        this.horasExtra = horasExtra;
        this.telefono = telefono;
        this.EstadoEmpresa = EstadoEmpresa;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.IRPF = IRPF;
    }

    public double getIRPF() {
        return IRPF;
    }

    public void setIRPF(double IRPF) {
        this.IRPF = IRPF;
    }

    public String getDni() {
        return dni;
    }

    public long getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(long numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Enum getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(Enum EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Enum getEstadoEmpresa() {
        return EstadoEmpresa;
    }

    public void setEstadoEmpresa(Enum EstadoEmpresa) {
        this.EstadoEmpresa = EstadoEmpresa;
    }

}