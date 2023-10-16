
package ProjectoFinalSalud.Entidades;

public class IniciarSesion {
    
    private int IdUsuario;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Password;

    public IniciarSesion() {
    }
    
    public IniciarSesion(int IdUsuario, String Nombre, String Apellido, String Email, String Password) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Password = Password;
    }
    
    public IniciarSesion(String Nombre, String Apellido, String Email, String Password) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Password = Password;
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
    
    @Override
    public String toString() {
        return "IniciarSesion{" + "IdUsuario=" + IdUsuario + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Email=" + Email + ", Password=" + Password + '}';
    }
}
