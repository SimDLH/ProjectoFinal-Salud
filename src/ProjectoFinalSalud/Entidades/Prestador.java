
package ProjectoFinalSalud.Entidades;

public class Prestador {

    private int IdPrestador;
    private String Nombre;
    private int Dni;
    private String Domicilio;
    private int Telefono;
    private boolean activo;
    private Especialidad Especialidad;

    public Prestador() {
    }

    public Prestador(int IdPrestador, String Nombre, int Dni, String Domicilio, int Telefono, boolean activo, Especialidad Especialidad) {
        this.IdPrestador = IdPrestador;
        this.Nombre = Nombre;
        this.Dni = Dni;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.activo = activo;
        this.Especialidad = Especialidad;
    }

    public Prestador(String Nombre, int Dni, String Domicilio, int Telefono, boolean activo, Especialidad Especialidad) {
        this.Nombre = Nombre;
        this.Dni = Dni;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.activo = activo;
        this.Especialidad = Especialidad;
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

    public Especialidad getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(Especialidad Especialidad) {
        this.Especialidad = Especialidad;
    }

    @Override
    public String toString() {
        return " Nombre:" + Nombre + " " + Especialidad.toString();
    }
}