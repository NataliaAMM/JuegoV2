/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Canvas;
import Fabricas.*;
import Productos.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import Builder.*;
import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class MiCanvas extends Canvas {
    Graphics miG;
    Image imgBuffer;
    Personaje personaje;
    Arma arma;
    Cuerpo cuerpo;
    Escudo escudo; 
    Director director = new Director();
    int especial = 0;
    
    
    public MiCanvas(int i) {
        switch(i){
            case 1:  
                personaje = new Elfo();
                director.setConstructor(new ConstruirElfo());
                break;
            case 2:
                personaje = new Hada();
                director.setConstructor(new ConstruirHada());
                especial = 1;
                break;
            case 3:
                personaje = new Humano();
                director.setConstructor(new ConstruirHumano());
                break;
            case 4:
                personaje = new Mago();
                director.setConstructor(new ConstruirMago());
                break;
            case 5:
                personaje = new Ogro();
                director.setConstructor(new ConstruirOgro());
                break;
            default: 
                break;            
        }
        
        cuerpo = personaje.crearCuerpo();
        arma = personaje.crearArma();
        escudo = personaje.crearEscudo();
        setBounds(0, 0, 2000, 1000);
        director.construirPersonaje();
        //setBackground(Color.BLACK);
                
        
    }
     
    @Override
    public void paint(Graphics g){
        Posicion posi = director.getPosicion();
        ArrayList<Integer> posCuerpo = posi.getCuerpo();
        ArrayList<Integer> posArma = posi.getArma();
        ArrayList<Integer> posEscudo = posi.getEscudo();
        if(especial == 1){
            escudo.draw(g, posEscudo.get(0), posEscudo.get(1));
            cuerpo.draw(g, posCuerpo.get(0), posCuerpo.get(1));
        }else{
            cuerpo.draw(g, posCuerpo.get(0), posCuerpo.get(1));
            escudo.draw(g, posEscudo.get(0), posEscudo.get(1));
        }
        arma.draw(g, posArma.get(0), posArma.get(1));
        
        
    }
}
