
package projectofinal.salud;

import ProjectoFinalSalud.AccesoDeDatos.AfiliadoData;
import ProjectoFinalSalud.AccesoDeDatos.Conexion;
import ProjectoFinalSalud.AccesoDeDatos.EspecialidadData;
import ProjectoFinalSalud.AccesoDeDatos.OrdenData;
import ProjectoFinalSalud.AccesoDeDatos.PrestadorData;
import ProjectoFinalSalud.Entidades.Afiliado;
import ProjectoFinalSalud.Entidades.Especialidad;
import ProjectoFinalSalud.Entidades.Orden;
import ProjectoFinalSalud.Entidades.Prestador;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


public class ProjectoFinalSalud {

    
    public static void main(String[] args) {
        
        
        Connection con=Conexion.getConnection();
        AfiliadoData ad=new AfiliadoData();
        PrestadorData pd=new PrestadorData();
        EspecialidadData ed=new EspecialidadData();
        OrdenData od=new OrdenData();
      /*  Afiliado a1=new Afiliado("Marcos",222,"San Martin 123",9876478,true);
        Afiliado a2=new Afiliado("Luis",333,"La Rocka 21",2982634,true);
        Afiliado a3=new Afiliado("Vanesa",444,"La Santa 92",1947234,true);
        
        ad.guardarAfiliado(a1);
        ad.guardarAfiliado(a2);
        ad.guardarAfiliado(a3);*/
      
    /*  ArrayList<Afiliado>afiliados;
      afiliados= ad.listarAfiliados();
      for (Afiliado af:afiliados){
          System.out.println("Nombre: "+af.getNombre());
          System.out.println("DNI: "+af.getDni());
          System.out.println("Domicilio: "+af.getDomicilio());
          System.out.println("-------------------------------------------");
      }*/
        
   /* Afiliado af=ad.buscarAfiliados(132);
        System.out.println("Nombre "+af.getNombre());
        System.out.println("Telefono "+af.getTelefono());
        System.out.println("Domiciolia "+af.getDomicilio());
        System.out.println("-------------------------------------");*/
    
   // ad.borrarAfiliado(2);
   //  ad.reinstituirAfliliado(2);
   /*   Afiliado af=new Afiliado("Lusiana",222,"San Juan",12345,true);
      ad.modificarAfiliado(af);*/
    /* Especialidad es1=new Especialidad("Nutrisionista");
     Especialidad es2=new Especialidad("Pediatria");
     Especialidad es3=new Especialidad("Psicologia");
     ed.guardarEspecialidad(es3);
     ed.guardarEspecialidad(es2);
     ed.guardarEspecialidad(es1);*/
    
   //   ed.eliminarEspecialidad(5);
   
  /*   Especialidad esp=ed.buscarEspecialidad(2);
        System.out.println("ID "+esp.getIdEspecialidad());
        System.out.println("Nombre "+esp.getEspecialidad());*/
  
   /*   ArrayList<Especialidad>especialidades=ed.listarEspecialidad();
      for (Especialidad e:especialidades){
          System.out.println("ID "+e.getIdEspecialidad());
          System.out.println("Nombre "+e.getEspecialidad());
          System.out.println("-------------------------------------");
      }*/
     //   Especialidad as=ed.buscarEspecialidad(3);
   
   //  Prestador p1=new Prestador(1,"Melena",9876,"San Martin",1010101010,true,as);
    /*   Prestador p2=new Prestador("Lusila",999,"Santa Fe",213132,true,3);
       Prestador p3=new Prestador("Masa",777,"Vasario",12345123,true,2);
       
       pd.guardarPrestador(p1);
       pd.guardarPrestador(p2);
       pd.guardarPrestador(p3);*/
   
   //  pd.eliminarPrestador(1);
   
   /*  Prestador p=pd.buscarPrestador(2);
        System.out.println("Nombre "+p.getNombre());
        System.out.println("Domicilio "+p.getDomicilio());
        System.out.println("Especialidad "+p.getEspecialidad().getEspecialidad());*/
     
     /* Prestador p=pd.buscarIdEspecialidad(2);
        System.out.println("nombre "+p.getNombre());
        System.out.println("Domicilio "+p.getDomicilio());
        System.out.println("Especialidad "+p.getEspecialidad().getEspecialidad());*/
     
 /*      ArrayList<Prestador>prestadores=pd.listarPrestador();
       for (Prestador p:prestadores){
           System.out.println("Nombre "+p.getNombre());
           System.out.println("Domicilio "+p.getDomicilio());
           System.out.println("Telefono "+p.getTelefono());
           System.out.println("Especialidad "+p.getEspecialidad().getEspecialidad());
           System.out.println("-------------------------------------------"); 
       }*/
 
    /*  Afiliado a1=ad.buscarAfiliados(444);
      Prestador p1=pd.buscarPrestador(2);
 
      Orden o1=new Orden(LocalDate.of(2020, 10, 24),"Cheque",299.99,a1,p1);
      od.guardarOrden(o1);*/
      
   /*  LocalDate local=LocalDate.of(2023, 07, 12);
      ArrayList<Orden>ordenes=new ArrayList<>();
      ordenes=od.listarOrdenesPorFecha(local);
        for (Orden or:ordenes){
            System.out.println("Tipo de paga "+or.getFormaPago());
            System.out.println("Afiliado "+or.getAfiliado().getNombre());
            System.out.println("Prestador "+or.getPrestador().getNombre());
    }*/
         ArrayList<Orden>ordenes=od.OrdenesPorAfiliado(222);
         for (Orden or:ordenes){
             System.out.println("ID "+or.getIdOrden());
             System.out.println("Tipo de paga "+or.getFormaPago());
             System.out.println("Prestador "+or.getPrestador().getNombre());
             System.out.println("-------------------------------------");
   
   
        }
   
    }
    
    
    
}
