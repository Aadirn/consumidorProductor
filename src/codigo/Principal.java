/*
3 pasteleros
2 comilones
20 pasteles a crear/consumir
Comilones = id unico, tiempo de consumicion == peso tarta, tartasconsumidas
Pasteleros = id unico, tiempo de produccion == peso tarta, tartasProducidas
Tarta = id unico, peso(es aleatorio entre), 
*/
package codigo;

import hq.Pasteleria;

/**
 *
 * @author Castealo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasteleria p = new Pasteleria();
        p.abrirPasteleria();
        //System.out.println("hola");
    }
    
}
