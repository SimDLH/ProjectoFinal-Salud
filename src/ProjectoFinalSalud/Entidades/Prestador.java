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
    private String apellido;
    private int dni;
    private boolean activo;
    Especialidad especialidad;

    public Prestador() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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
    
    
}
