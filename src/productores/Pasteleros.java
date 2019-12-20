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

    private int tiempoPreparacion;
    private final String idPastelero;
    private int produccion;

    public Pasteleros(String idPastelero) {
        this.idPastelero = idPastelero;
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
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
