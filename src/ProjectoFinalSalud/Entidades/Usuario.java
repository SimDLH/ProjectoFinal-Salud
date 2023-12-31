
package ProjectoFinalSalud.Entidades;

import java.time.LocalDate;

public class Usuario {
    
    private int IdUsuario;
    private String Nombre;
    private String Apellido;
    private int Dni;
    private LocalDate FechaDeNac;
    private String Nacionalidad;
    private String Email;
    private String Password;
    private boolean Activo;
    
    public Usuario () {
    }

    public Usuario(int IdUsuario, String Nombre, String Apellido, int Dni, LocalDate FechaDeNac, String Nacionalidad, String Email, String Password, boolean Activo) {
        
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dni = Dni;
        this.FechaDeNac = FechaDeNac;
        this.Nacionalidad = Nacionalidad;
        this.Email = Email;
        this.Password = Password;
        this.Activo = Activo;
    }
    
    public Usuario(String Nombre, String Apellido, int Dni, LocalDate FechaDeNac, String Nacionalidad, String Email, String Password, boolean Activo) {
        
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dni = Dni;
        this.FechaDeNac = FechaDeNac;
        this.Nacionalidad = Nacionalidad;
        this.Email = Email;
        this.Password = Password;
        this.Activo = Activo;
    }

    public int getIdUsuario() {
        
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        
        return Nombre;
    }

    public void setNombre(String Nombre) {
        
        this.Nombre = Nombre;
    }

    public String getApellido() {
        
        return Apellido;
    }

    public void setApellido(String Apellido) {
        
        this.Apellido = Apellido;
    }

    public int getDni() {
        
        return Dni;
    }

    public void setDni(int Dni) {
        
        this.Dni = Dni;
    }

    public LocalDate getFechaDeNac() {
        
        return FechaDeNac;
    }

    public void setFechaDeNac(LocalDate FechaDeNac) {
        
        this.FechaDeNac = FechaDeNac;
    }

    public String getNacionalidad() {
        
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        
        this.Nacionalidad = Nacionalidad;
    }

    public String getEmail() {
        
        return Email;
    }

    public void setEmail(String Email) {
        
        this.Email = Email;
    }

    public String getPassword() {
        
        return Password;
    }

    public void setPassword(String Password) {
        
        this.Password = Password;
    }

    public boolean isActivo() {
        
        return Activo;
    }

    public void setActivo(boolean Activo) {
        
        this.Activo = Activo;
    }
        
    @Override
    public String toString() {
        
        return "Usuario{" + " Nombre=" + Nombre + '}';
    }
}