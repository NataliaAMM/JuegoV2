package Fabricas;
import Productos.Arma;
import Productos.ArmaHumano;
import Productos.Cuerpo;
import Productos.CuerpoHumano;
import Productos.Escudo;
import Productos.EscudoHumano;
/**
 *
 * @author Estudiantes
 */
public class Humano implements Personaje{
    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoHumano();
    }

    @Override
    public Arma crearArma() {
        return new ArmaHumano();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoHumano();
    }
    
}
