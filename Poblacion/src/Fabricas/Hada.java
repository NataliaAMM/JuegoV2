package Fabricas;
import Productos.Arma;
import Productos.ArmaHada;
import Productos.Cuerpo;
import Productos.CuerpoHada;
import Productos.Escudo;
import Productos.EscudoHada;
/**
 *
 * @author Estudiantes
 */
public class Hada implements Personaje{
    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoHada();
    }

    @Override
    public Arma crearArma() {
        return new ArmaHada();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoHada();
    }
    
    
}
