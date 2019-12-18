/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumidores;

public class Comilones extends Thread {

    private long idComilones;
    private int tartasConsumidas;
    private double tiempoConsumicion;

    public Comilones(long idComilones, double tiempoConsumicion) {
        this.idComilones = idComilones;
        this.tiempoConsumicion = tiempoConsumicion;
    }

    

    @Override
    public void run() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public long getIdComilones() {
        return idComilones;
    }

    public int getTartasConsumidas() {
        return tartasConsumidas;
    }

    public double getTiempoConsumicion() {
        return tiempoConsumicion;
    }

}
