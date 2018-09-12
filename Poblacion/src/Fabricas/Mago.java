package Fabricas;
import Productos.Arma;
import Productos.ArmaMago;
import Productos.Cuerpo;
import Productos.CuerpoMago;
import Productos.Escudo;
import Productos.EscudoMago;
/**
 *
 * @author Estudiantes
 */
public class Mago implements Personaje{
    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoMago();
    }

    @Override
    public Arma crearArma() {
        return new ArmaMago();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoMago();
    }
    
    
}
