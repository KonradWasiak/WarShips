/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author wolsk
 */
public class shipPart extends JButton {

    int xPolozenie;
    int ypolozenie;
    boolean selected = false;
    boolean destroyed = false;

    public shipPart(){
        super();
        this.xPolozenie=0;
        this.ypolozenie=0;
    }
    public shipPart(int x, int y) {
        super();
        this.xPolozenie = x;
        this.ypolozenie = y;
    }

    //Pobieranie polozenia
    public int getXPolozenie() {
        return xPolozenie;
    }

    public int getYPolozenie() {
        return ypolozenie;
    }

    //Zmiany kolorystyki
    public void focused() {
        if (selected == false) {
            this.setBackground(Color.BLUE);
        }
    }

    public void selectedToFight() {
        this.selected = true;
        this.setEnabled(false);
        this.setBackground(Color.green);
    }

    public void unfocused() {
        if (selected == false) {
            this.setBackground(null);
        }
    }

    public void disableField() {
        this.setEnabled(false);
        this.selected = true;
    }

    public void reset() {
        this.setBackground(null);
        this.setEnabled(true);
        this.selected = false;
    }

    public void enableField() {
       this.setEnabled(true);
       this.selected = false;
       this.setBackground(null);
    }
    public String toString(){
        return "X: " + this.xPolozenie + "Y: " + this.ypolozenie + "State: " + this.selected;
    }
    public void dostalemSzczala(){
        this.setBackground(Color.red);
    }
    public void puste(){
        this.setBackground(Color.lightGray);
        this.setEnabled(false);
    }
}
