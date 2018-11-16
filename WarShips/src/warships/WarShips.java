
package warships;

import javax.swing.*;


public class WarShips {

    public static void makeMenu(){
        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(1000, 600);
        window.setContentPane(new Menu());
        
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(WarShips::makeMenu);
    }
    
}
