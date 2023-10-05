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
   
   
}
