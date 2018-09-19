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
public abstract class Construir {
    
    protected Posicion pos;

    public Posicion getPosicion() {
        return pos;
    }
    
    public abstract void ContruirPosicion();
    public abstract void ContruirCuerpo();
    public abstract void ContruirArma();
    public abstract void ContruirEscudo();
    
}
