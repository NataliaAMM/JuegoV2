/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;


/**
 *
 * @author Estudiantes
 */
public class Director {
     private Construir constructor;
     
     public void setConstructor(Construir constructor) {
        this.constructor = constructor;
    }
    
     public Posicion getPosicion(){
        return constructor.getPosicion();
    }
    
    public void construirPersonaje(){
        constructor.ContruirPosicion();
        constructor.ContruirCuerpo();
        constructor.ContruirArma();
        constructor.ContruirEscudo();
    }
}
