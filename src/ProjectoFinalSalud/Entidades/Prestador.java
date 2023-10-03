/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectoFinalSalud.Entidades;

/**
 *
 * @author simon
 */
public class Prestador {
    
    private int IdPrestador;
    private String nombre;
    private int dni;
    private String domicilio;
    private int telefono;
    private boolean activo;
    private Especialidad especialidad;

    public Prestador() {
    }

    public Prestador(int IdPrestador, String nombre, int dni, String domicilio, int telefono, boolean activo, Especialidad especialidad) {
        this.IdPrestador = IdPrestador;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.activo = activo;
        this.especialidad = especialidad;
    }

    public Prestador(String nombre, int dni, String domicilio, int telefono, boolean activo, Especialidad especialidad) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.activo = activo;
        this.especialidad = especialidad;
    }

    public int getIdPrestador() {
        return IdPrestador;
    }

    public void setIdPrestador(int IdPrestador) {
        this.IdPrestador = IdPrestador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Prestador{" + "IdPrestador=" + IdPrestador + ", nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", telefono=" + telefono + ", activo=" + activo + ", especialidad=" + especialidad + '}';
    }

    
    
    
}
