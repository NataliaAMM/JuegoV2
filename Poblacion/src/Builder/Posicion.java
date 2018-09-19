/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.ArrayList;

/**
 *
 * @author NATA
 */
public class Posicion {
    private ArrayList<Integer> cuerpo = new ArrayList<Integer>();
    private ArrayList<Integer> arma = new ArrayList<Integer>();
    private ArrayList<Integer> escudo = new ArrayList<Integer>();
    
    public void addCuerpo(int h){
        cuerpo.add(h);
    }
    
    public void addArma(int t){
        arma.add(t);
    }
    
    public void addEscudo(int t){
        escudo.add(t);
    }

    public ArrayList<Integer> getCuerpo() {
        return cuerpo;
    }

    public ArrayList<Integer> getArma() {
        return arma;
    }
    
    public ArrayList<Integer> getEscudo() {
        return escudo;
    }
}
