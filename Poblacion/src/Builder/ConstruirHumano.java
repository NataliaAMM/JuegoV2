/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Fabricas.Humano;

/**
 *
 * @author Estudiantes
 */
public class ConstruirHumano extends Construir {

    @Override
    public void ContruirCuerpo() {
        pers = new Humano();
    }

    @Override
    public void ContruirArma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ContruirEscudo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
