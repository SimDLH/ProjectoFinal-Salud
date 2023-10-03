
package projectofinal.salud;

import ProjectoFinalSalud.AccesoDeDatos.AfiliadoData;
import ProjectoFinalSalud.AccesoDeDatos.Conexion;
import ProjectoFinalSalud.Entidades.Afiliado;
import ProjectoFinalSalud.Vistas.Inicio;
import java.sql.Connection;
import java.util.ArrayList;


public class ProjectoFinalSalud {

    
    public static void main(String[] args) {
        
        new Inicio().setVisible(true);
        
        Connection con=Conexion.getConnection();
        AfiliadoData ad=new AfiliadoData();
      /*  Afiliado a1=new Afiliado("Marcos",222,"San Martin 123",9876478,true);
        Afiliado a2=new Afiliado("Luis",333,"La Rocka 21",2982634,true);
        Afiliado a3=new Afiliado("Vanesa",444,"La Santa 92",1947234,true);
        
        ad.guardarAfiliado(a1);
        ad.guardarAfiliado(a2);
        ad.guardarAfiliado(a3);*/
      
      ArrayList<Afiliado>afiliados;
      afiliados= ad.listarAfiliados();
      for (Afiliado af:afiliados){
          System.out.println("Nombre: "+af.getNombre());
          System.out.println("DNI: "+af.getDni());
          System.out.println("Domicilio: "+af.getDomicilio());
          System.out.println("-------------------------------------------");
      }
        
    }
    
}
