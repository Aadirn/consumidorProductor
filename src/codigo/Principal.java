/*
PASTELERIA:
-Pasteleros (Producen tartas): El numero de pasteleros es una constante que tiene la pasteleria(Principal){Tiene: idPastelero y producidas y tiempo} 
-Tartas: Las tartas se producen con un id unico para cada tarta y ademas tienen un peso entre 500 y 1000 g, se producen de forma aleatoria. El tiempo de produccion es == a el peso (ms).
El tiempo de consumo (ms) es igual al peso de la tarta.
Hay una cinta (Lista FIFO) en la cual los pasteleros ponen tartas y los comilones las van sacando.
-Comilones (Comen las tartas): el numero de comilones es constante:{Tiene: idComilon y consumidas y tiempo} 
-Cinta(única):
Valor de tartas a producir 20
producidas(hasta 20), consumidas(hasta 20);

PARA ESPERAR USA UN WHILE CON UN SLEEP PARA QUE NO PETE LA VIDA
EQUALS O COMPARADORES O CLASE COMPARATOR
COLECCIONES DE PASTELEROS Y DE COMILONES
 */
package codigo;

import consumidores.Comilones;
import java.util.ArrayList;
import java.util.Random;
import productores.Pasteleros;

public class Principal {

    private static final int TARTAS_A_PRODUCIR = 20;
    private static final int MAX_PESO = 1000;
    private static final int MIN_PESO = 500;
    private static final int NUM_PASTELEROS = 3;
    private static final int NUM_COMILONES = 2;

    private static final ArrayList productores = new ArrayList();
    private static ArrayList consumidores = new ArrayList();
    
    private static Random rnd = new Random(System.currentTimeMillis());

    public static void main(String[] args) {

        iniciarPasteleros();
        iniciarComilones();

    }

    private static void iniciarPasteleros() {
        long id;
        int tiempo;
        for (int i = 0; i < NUM_PASTELEROS; i++) {
            id = System.currentTimeMillis();
            tiempo=pesoRand();
            Pasteleros p = new Pasteleros(id,tiempo);
            productores.add(p);
            p.run();

        }
    }

    private static void iniciarComilones() {
        long id;
        int tiempo;
        for (int i = 0; i < NUM_COMILONES; i++) {
            id = System.currentTimeMillis();
            tiempo=pesoRand();
            Comilones c = new Comilones(id,tiempo);
            consumidores.add(c);
            c.run();

        }
    }
    
    private static int pesoRand(){
        return rnd.nextInt(MAX_PESO - MIN_PESO + 1) + MIN_PESO;
    }

}
