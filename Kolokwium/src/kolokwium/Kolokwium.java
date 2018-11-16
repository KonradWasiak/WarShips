/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolokwium;
import java.lang.reflect.InvocationTargetException;
import javax.swing.*;
/**
 *
 * @author wolsk
 */
public class Kolokwium {
    public static void makeWindow(){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        window.setBounds(20,20,400,400);
        window.setLocation(100, 100);
        window.setVisible(true);
        window.setContentPane(new ObslugaKlawiatury());
    }
    public static void makePallete(){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        window.setBounds(20,20,400,400);
        window.setLocation(100, 100);
        window.setVisible(true);
        window.setContentPane(new palletePicker());
    }
    
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        
        javax.swing.SwingUtilities.invokeAndWait(Kolokwium::makeWindow);
        javax.swing.SwingUtilities.invokeAndWait(Kolokwium::makePallete);
    }
    
}
