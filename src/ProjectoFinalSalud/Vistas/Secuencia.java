
package ProjectoFinalSalud.Vistas;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Secuencia {
    
    static int contador = 0;
    
    public static void main(String[] args) {
        
        Inicio reprod = Inicio();
        reprod.setVisible(true);
        int velocidad = 2;
       
        Timer timer;
        TimerTask tarea;
       
        int velo1 = velocidad*1000;
       
        Inicio secue = new Inicio();
        secue.setVisible(true);
        
        tarea = new TimerTask() {
            
            @Override
            public void run() {
                
                Icon icono1;
                
                switch (contador){
                    case 0:
                        contador = 1;
                        icono1 = new ImageIcon(getClass().getResource("/ImagenesDelProyecto/MarcoPropaganda0.png"));
                        secue.etiquetaPropaganda.setIcon(icono1);
                        break;
                    case 1:
                        contador = 2;
                        icono1 = new ImageIcon(getClass().getResource("/ImagenesDelProyecto/MarcoPropaganda1.png"));
                        secue.etiquetaPropaganda.setIcon(icono1);
                        break;
                    case 2:
                        contador = 3;
                        icono1 = new ImageIcon(getClass().getResource("/ImagenesDelProyecto/MarcoPropaganda2.png"));
                        secue.etiquetaPropaganda.setIcon(icono1);
                        break;
                    case 3:
                        contador = 0;
                        icono1 = new ImageIcon(getClass().getResource("/ImagenesDelProyecto/MarcoPropaganda3.png"));
                        secue.etiquetaPropaganda.setIcon(icono1);
                        break;
                }
            }
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velo1, velo1);
    }

    private static Inicio Inicio() {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
}