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
public class ConstruirHumano extends Construir {

    @Override
    public void ContruirPosicion() {
        pos = new Posicion();
    }

    @Override
    public void ContruirCuerpo() {
        pos.addCuerpo(0);
        pos.addCuerpo(0);
    }

    @Override
    public void ContruirArma() {
        pos.addArma(0);
        pos.addArma(0);
    }

    @Override
    public void ContruirEscudo() {
        pos.addEscudo(0);
        pos.addEscudo(0);
    }
    
}
