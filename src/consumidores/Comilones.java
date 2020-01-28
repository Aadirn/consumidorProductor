package consumidores;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.CommsComilones;
import modelo.Pasteles;

public class Comilones extends Thread {

    private final String idComilon;
    private int tiempoConsumicion;
    private int consumidas;
    private CommsComilones listener;
    private Pasteles pastel;

    public Comilones(String idComilon, CommsComilones listener) {
        this.idComilon = idComilon;
        this.listener = listener;
    }

    @Override
    public void run() {
        aComer();
    }

    public String getIdComilon() {
        return idComilon;
    }

    public int getTiempoConsumicion() {
        return tiempoConsumicion;
    }

    public int getConsumidas() {
        return consumidas;
    }

    private synchronized void aComer() {
        consumidas = 0;
        do {
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Comilones.class.getName()).log(Level.SEVERE, null, ex);
//            }
            //System.out.println(pastel);
            pastel = listener.quitaDeCinta();
            if (pastel != null) {
                tiempoConsumicion = pastel.getPeso();
                try {
                    Thread.sleep(tiempoConsumicion);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Comilones.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Me he comido esta tarta en " + tiempoConsumicion + "ms y soy " + idComilon + "\n");
                consumidas++;
            } else {
                //System.out.println("Lista vacia");
            }
        } while (consumidas != 20);
    }

}
