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
    
    private long idTarta;
    private int peso;

    public Tarta(long idTarta, int peso) {
        this.idTarta = idTarta;
        this.peso = peso;
    }

    public long getIdTarta() {
        return idTarta;
    }

    public void setIdTarta(long idTarta) {
        this.idTarta = idTarta;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
}
