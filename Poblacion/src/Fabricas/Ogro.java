package Fabricas;
import Productos.Arma;
import Productos.ArmaOgro;
import Productos.Cuerpo;
import Productos.CuerpoOgro;
import Productos.Escudo;
import Productos.EscudoOgro;
/**
 *
 * @author Estudiantes
 */
public class Ogro implements Personaje{
    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoOgro();
    }

    @Override
    public Arma crearArma() {
        return new ArmaOgro();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoOgro();
    }
    
    
}
