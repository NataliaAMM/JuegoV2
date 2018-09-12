/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Fabricas.Personaje;

/**
 *
 * @author Estudiantes
 */
public class Director {
     private Construir constructor;
     
     public void setConstructor(Construir constructor) {
        this.constructor = constructor;
    }
    
     public Personaje getTour(){
        return constructor.getTour();
    }
    
    public void construirTour(){
        constructor.ContruirCuerpo();
        constructor.ContruirArma();
        constructor.ContruirEscudo();
    }
}
