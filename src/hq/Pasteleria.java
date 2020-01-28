package hq;

import consumidores.Comilones;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import modelo.CommsComilones;
import modelo.Pasteles;
import productores.Pasteleros;
import modelo.CommsPasteleros;

public class Pasteleria {

    private Queue cinta = new ConcurrentLinkedQueue();
    private Pasteleros p;
    private Comilones c;
    private static final int PASTELES_A_GENERAR = 20;
    private static final int PASTELEROS = 3;
    private static final int COMILONES = 2;
    private final ArrayList<Pasteleros> pasteleros;
    private final ArrayList<Comilones> comilones;

    public Pasteleria() {
        this.comilones = new ArrayList<>();
        this.pasteleros = new ArrayList<>();

        for (int i = 0; i < PASTELEROS; i++) {
            p = new Pasteleros("Pastelero" + i, PASTELES_A_GENERAR, new CommsPasteleros() {
                @Override
                public void pastelACinta(Pasteles pastel) {
                    cinta.add(pastel);
                }
            });
            pasteleros.add(p);
        }
        for (int i = 0; i < COMILONES; i++) {
            c = new Comilones("Comilon" + i, new CommsComilones() {
                @Override
                public Pasteles quitaDeCinta() {
                    return (Pasteles) cinta.poll();

                }
            });
            comilones.add(c);
        }

    }

    public void abrirPasteleria() {
        iniciaPasteleros();
        iniciaComilones();

    }

    private void iniciaPasteleros() {
        //Pasteleros hacen tartas
        //Inicio 1 pastelero
        for (int i = 0; i < PASTELEROS; i++) {
            pasteleros.get(i).start();
        }

    }

    private void iniciaComilones() {
        //Comilones comen tartas
        //Inicio 1 comilon
        for (int i = 0; i < COMILONES; i++) {
            comilones.get(i).start();
        }
    }

}
