
package ProjectoFinalSalud.Entidades;

public class Afiliado {
   
    private int IdAfiliado;
    private String nombre;
    private int dni;
    private String domicilio;
    private int telefono;
    private boolean activo;
    
    public Afiliado(){
    }

    public Afiliado(int IdAfiliado, String nombre, int dni, String domicilio, int telefono, boolean activo) {
        
        this.IdAfiliado = IdAfiliado;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.activo = activo;
    }

    public Afiliado(String nombre, int dni, String domicilio, int telefono, boolean activo) {
        
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.activo = activo;
    }

    public int getIdAfiliado() {
        
        return IdAfiliado;
    }

    public void setIdAfiliado(int IdAfiliado) {
        
        this.IdAfiliado = IdAfiliado;
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

    @Override
    public String toString() {
        
        return "Afiliado{" + "IdAfiliado=" + IdAfiliado + ", nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", telefono=" + telefono + ", activo=" + activo + '}';
    }
}