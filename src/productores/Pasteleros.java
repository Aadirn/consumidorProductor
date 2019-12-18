/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productores;

/**
 *
 * @author Castealo
 */
public class Pasteleros extends Thread {

    private long idPasteleros;
    private int tartasProducidas;
    private double tiempoProduccion;

    public Pasteleros(long idPasteleros, double tiempoProduccion) {
        this.idPasteleros = idPasteleros;
        this.tiempoProduccion = tiempoProduccion;
    }

    

    @Override
    public void run() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public long getIdPasteleros() {
        return idPasteleros;
    }

    public int getTartasProducidas() {
        return tartasProducidas;
    }

    public double getTiempoProduccion() {
        return tiempoProduccion;
    }

}
