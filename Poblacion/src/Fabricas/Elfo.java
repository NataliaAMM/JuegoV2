package Fabricas;

import Productos.Arma;
import Productos.ArmaElfo;
import Productos.Cuerpo;
import Productos.CuerpoElfo;
import Productos.Escudo;
import Productos.EscudoElfo;

/**
 *
 * @author Estudiantes
 */
public class Elfo implements Personaje{
    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoElfo();
    }

    @Override
    public Arma crearArma() {
        return new ArmaElfo();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoElfo();
    }
    
    
}
