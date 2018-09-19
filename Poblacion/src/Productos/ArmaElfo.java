/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Productos.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author Estudiantes
 */
public class ArmaElfo implements Arma{
    Image descripcion = new ImageIcon(getClass().getResource("/Imagenes/DesArmaHada.png")).getImage();
    Image imagen = new ImageIcon(getClass().getResource("/Imagenes/ArmaElfo.png")).getImage();
    

    public ArmaElfo() {
    }

    
    @Override
    public void draw(Graphics g, int x, int y) {
        g.drawImage(imagen, x, y, null);
        g.drawImage(descripcion, 300, 150, null);
    }
     
}
