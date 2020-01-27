/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumidores;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.CommsComilones;
import modelo.Pasteles;

/**
 *
 * @author Castealo
 */
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
        pastel = listener.quitaDeCinta();
        if(pastel!=null){
        tiempoConsumicion = pastel.getPeso();
        try {
            Thread.sleep(tiempoConsumicion);
        } catch (InterruptedException ex) {
            Logger.getLogger(Comilones.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("Me he comido esta tarta en "+tiempoConsumicion+"ms y soy "+idComilon);
        }else{
            System.out.println("Lista vacia");
        }
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

}
