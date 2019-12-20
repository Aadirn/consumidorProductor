/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hq;

import consumidores.Comilones;
import java.util.ArrayList;
import java.util.Queue;
import productores.Pasteleros;

public class Pasteleria {

    private Queue cinta;
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
            p = new Pasteleros("Pastelero" + i);
            pasteleros.add(p);
        }
        for (int i = 0; i < COMILONES; i++) {
            c = new Comilones("Comilon" + i);
            comilones.add(c);
        }

    }

    public void abrirPasteleria() {
        iniciaPasteleros();
        iniciaComilones();
    }

    private void iniciaPasteleros() {

    }

    private void iniciaComilones() {

    }

}
