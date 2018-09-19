/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Fabricas.*;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Estudiantes
 */
public class Menu extends JFrame {
    Personaje personaje;
    int per;
    public JButton btnHumano = new JButton("Humano");
    public JButton btnOgro = new JButton("Ogro");
    public JButton btnHada = new JButton("Hada");
    public JButton btnMago = new JButton("Mago");
    public JButton btnElfo = new JButton("Elfo");
    public JLabel desicion = new JLabel("Escoga el personaje a mostrar") ;

    public Menu() {
        Container c= getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c.setLayout(null);
        
        c.add(desicion);
        desicion.setBounds(150, 15, 200, 50);
        
        c.add(btnElfo);
        btnElfo.setBounds(70, 80, 100, 20);
        btnElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElfoActionPerformed(evt);
            }
        });
        
        c.add(btnHada);
        btnHada.setBounds(250, 80, 100, 20);
        btnHada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHadaActionPerformed(evt);
            }
        });
        
        c.add(btnHumano);
        btnHumano.setBounds(70, 110, 100, 20);
        btnHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHumanoActionPerformed(evt);
            }
        });
        
        c.add(btnMago);
        btnMago.setBounds(250, 110, 100, 20);
        btnMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagoActionPerformed(evt);
            }
        });
        
        c.add(btnOgro);
        btnOgro.setBounds(165, 140, 100, 20);
        btnOgro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOgroActionPerformed(evt);
            }
        });
    }
    public void mostrar (){
        setSize(500,300);
        setVisible(true);
    }
    public void btnElfoActionPerformed(java.awt.event.ActionEvent evt) { 
        per = 1;
        Interfaz interfaz = new Interfaz(per);
        
    }                                        

    public void btnHadaActionPerformed(java.awt.event.ActionEvent evt) {  
        per = 2;
        Interfaz interfaz = new Interfaz(per);
        
    }                                        

    public void btnHumanoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        per = 3;
        Interfaz interfaz = new Interfaz(per);
    } 
    
    public void btnMagoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        per = 4;
        Interfaz interfaz = new Interfaz(per);        
    }
    
    public void btnOgroActionPerformed(java.awt.event.ActionEvent evt) {                                         
        per = 5;
        Interfaz interfaz = new Interfaz(per);
        
    } 
    
    
    
}
