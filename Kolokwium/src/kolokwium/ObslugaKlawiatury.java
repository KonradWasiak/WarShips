/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolokwium;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static javafx.scene.paint.Color.color;
import javax.swing.*;

/**
 *
 * @author wolsk
 */
public class ObslugaKlawiatury extends JPanel {

    final int sred = 30;
    int X=super.getX()/2;
    int Y=super.getY()/2;
    public Color kolor;
    
    public ObslugaKlawiatury() {
        setBackground(Color.RED);
        addMouseListener(new Klawiatura());
    }

    @Override
    public void paintComponent(Graphics g){ 
        super.paintComponents(g);
        g.setColor(kolor);
        g.fillOval(X, Y, sred, sred);
        
    }
    
    class Klawiatura implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            X = e.getX()-sred/2;
            Y = e.getY()-sred/2;
            repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            X = e.getX()-sred/2;
            Y = e.getY()-sred/2;
            repaint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           X = e.getX()-sred/2;
            Y = e.getY()-sred/2;
            repaint();  }

        @Override
        public void mouseEntered(MouseEvent e) {
            }

        @Override
        public void mouseExited(MouseEvent e) {
             }

        
    }
}
