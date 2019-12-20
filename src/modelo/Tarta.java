/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Castealo
 */
public class Tarta {
    
    private int peso;
    private String idTarta;

    public Tarta(int peso, String id) {
        this.peso = peso;
        this.idTarta = id;
    }

    public int getPeso() {
        return peso;
    }

    public String getIdTarta() {
        return idTarta;
    }
    
    
    
}
