package ProjectoFinalSalud.Entidades;

public class Especialidad {

    private int IdEspecialidad;
    private String Especialidad;

    public Especialidad() {
    }

    public Especialidad(int IdEspecialidad, String Especialidad) {
        this.IdEspecialidad = IdEspecialidad;
        this.Especialidad = Especialidad;
    }

    public Especialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public int getIdEspecialidad() {
        return IdEspecialidad;
    }

    public void setIdEspecialidad(int IdEspecialidad) {
        this.IdEspecialidad = IdEspecialidad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    @Override
    public String toString() {
        return "" + Especialidad;
    }
}
