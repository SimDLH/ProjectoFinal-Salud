
package ProjectoFinalSalud.Vistas;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Secuencias {

    static int contador = 0;
    
    public static void main(String[] args) {

        int velocidad = 2;
       
        Timer timer;
        TimerTask tarea;
       
        int velo1 = velocidad*1000;
       
        Inicio secuencia = new Inicio();
        secuencia.setVisible(true);
        
        tarea = new TimerTask() {
            
            @Override
            public void run() {
                
                Icon propag;
                
                switch (contador){
                    case 0:
                        contador = 1;
                        propag = new ImageIcon(getClass().getResource("/ImagenesDelProyecto/TableroDePropaganda1.png"));
                        secuencia.etiquetaPropaganda.setIcon(propag);
                        break;
                    case 1:
                        contador = 2;
                        propag = new ImageIcon(getClass().getResource("/ImagenesDelProyecto/TableroDePropaganda2.png"));
                        secuencia.etiquetaPropaganda.setIcon(propag);
                        break;
                    case 2:
                        contador = 3;
                        propag = new ImageIcon(getClass().getResource("/ImagenesDelProyecto/TableroDePropaganda3.png"));
                        secuencia.etiquetaPropaganda.setIcon(propag);
                        break;
                    case 3:
                        contador = 0;
                        propag = new ImageIcon(getClass().getResource("/ImagenesDelProyecto/TableroDePropaganda4.png"));
                        secuencia.etiquetaPropaganda.setIcon(propag);
                        break;
                }
            }
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velo1, velo1);
    }
}