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
    private String Nombre;
    private int Dni;
    private String Domicilio;
    private int Telefono;
    private boolean activo;
    private int IdEspecialidad;

    public Prestador() {
    }

    public Prestador(int IdPrestador, String Nombre, int Dni, String Domicilio, int Telefono, boolean activo, int IdEspecialidad) {
        this.IdPrestador = IdPrestador;
        this.Nombre = Nombre;
        this.Dni = Dni;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.activo = activo;
        this.IdEspecialidad = IdEspecialidad;
    }

    public Prestador(String Nombre, int Dni, String Domicilio, int Telefono, boolean activo, int IdEspecialidad) {
        this.Nombre = Nombre;
        this.Dni = Dni;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.activo = activo;
        this.IdEspecialidad = IdEspecialidad;
    }

    public int getIdPrestador() {
        return IdPrestador;
    }

    public void setIdPrestador(int IdPrestador) {
        this.IdPrestador = IdPrestador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getIdEspecialidad() {
        return IdEspecialidad;
    }

    public void setIdEspecialidad(int IdEspecialidad) {
        this.IdEspecialidad = IdEspecialidad;
    }

    @Override
    public String toString() {
        return "Prestador{" + "IdPrestador=" + IdPrestador + ", Nombre=" + Nombre + ", Dni=" + Dni + ", Domicilio=" + Domicilio + ", Telefono=" + Telefono + ", activo=" + activo + ", IdEspecialidad=" + IdEspecialidad + '}';
    }
}