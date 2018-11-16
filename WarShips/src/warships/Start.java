package warships;

import java.awt.*;
import javax.swing.*;

public class Start {
     
    public static void startMenu(){
        JFrame mainWindow = new JFrame();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setMinimumSize(new Dimension(1100,650));
        mainWindow.setVisible(true);
        mainWindow.setResizable(true);
        mainWindow.setContentPane(new MainMenu());
        
    }
    
    public static void main (String[] args){
        SwingUtilities.invokeLater(Start::startMenu);
    }
}
