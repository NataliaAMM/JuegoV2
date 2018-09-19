/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Estudiantes
 */
public class EscudoOgro implements Escudo{
    Image imagen = new ImageIcon(getClass().getResource("/Imagenes/EscudoOgro.png")).getImage();
    Image descripcion = new ImageIcon(getClass().getResource("/Imagenes/DesEscudoOgro.jpg")).getImage(); 

    public EscudoOgro() {
    }

    @Override
    public void draw(Graphics g, int x, int y) {
        g.drawImage(imagen, x, y, null);
        g.drawImage(descripcion, 400, 300, null);
    }
    
}
