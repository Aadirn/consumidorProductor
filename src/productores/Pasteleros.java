/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productores;

import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pasteles;
import modelo.CommsPasteleros;

/**
 *
 * @author Castealo
 */
public class Pasteleros extends Thread {

    private int tiempoPreparacion;
    private final String idPastelero;
    private int produccion;
    private int pesoPastel;
    private Random rnd;
    private int totalPasteles;
    private CommsPasteleros listener;

    public Pasteleros(String idPastelero, int totalPasteles, CommsPasteleros listener) {
        this.idPastelero = idPastelero;
        this.totalPasteles = totalPasteles;
        this.listener = listener;
    }

    @Override
    public void run() {
        int id = 0;
        do {
            rnd = new Random(System.currentTimeMillis());
            tiempoPreparacion = rnd.nextInt(1000 - 500 + 1) + 500;
            pesoPastel = tiempoPreparacion;
            Pasteles pastel = new Pasteles(pesoPastel, "Pastel " + id);
            id++;
            listener.pastelACinta(pastel);
            System.out.println("Soy el pastelero "+idPastelero+" y he preparado una tarta de "+pesoPastel+"g");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Pasteleros.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (id != totalPasteles);

    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public String getIdPastelero() {
        return idPastelero;
    }

    public int getProduccion() {
        return produccion;
    }

}
