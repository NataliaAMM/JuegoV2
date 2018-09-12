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
public abstract class Construir {
    
    protected Personaje pers;

    public Personaje getTour() {
        return pers;
    }
    
    public abstract void ContruirCuerpo();
    public abstract void ContruirArma();
    public abstract void ContruirEscudo();
    
}
