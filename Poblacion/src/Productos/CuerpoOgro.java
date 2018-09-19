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
public class CuerpoOgro implements Cuerpo{
    Image imagen = new ImageIcon(getClass().getResource("/Imagenes/Ogro.jpg")).getImage();
    Image descripcion = new ImageIcon(getClass().getResource("/Imagenes/DesCuerpoOgro.png")).getImage();

    public CuerpoOgro() {
    }

    @Override
    public void draw(Graphics g, int x, int y) {
        g.drawImage(imagen, x, y, null);
        g.drawImage(descripcion, 400, 0, null);
    }
}
