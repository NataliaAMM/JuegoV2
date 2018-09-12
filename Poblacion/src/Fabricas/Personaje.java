package Fabricas;
import Productos.Arma;
import Productos.Escudo;
import Productos.Cuerpo;


/**
 *
 * @author Estudiantes
 */
public interface Personaje {
    public Cuerpo crearCuerpo();

    public Arma crearArma();

    public Escudo crearEscudo();
    
}
