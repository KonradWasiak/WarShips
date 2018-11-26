/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warships;

import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author wolsk
 */
public class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        startGameButton = new javax.swing.JButton();
        showRulesButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        showAboutButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1100, 600));
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1100, 600));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 2, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WarShips - Ships battle via LAN");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 41, 41), 1, true));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.SW_RESIZE_CURSOR));

        startGameButton.setText("START");
        startGameButton.setMaximumSize(new java.awt.Dimension(80, 50));
        startGameButton.setMinimumSize(new java.awt.Dimension(80, 50));
        startGameButton.setPreferredSize(new java.awt.Dimension(80, 50));
        startGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startGameButtonMouseClicked(evt);
            }
        });

        showRulesButton.setText("ZASADY GRY");
        showRulesButton.setMaximumSize(new java.awt.Dimension(80, 50));
        showRulesButton.setMinimumSize(new java.awt.Dimension(80, 50));
        showRulesButton.setPreferredSize(new java.awt.Dimension(80, 50));
        showRulesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showRulesButtonMouseClicked(evt);
            }
        });

        exitButton.setText("WYJSCIE");
        exitButton.setMaximumSize(new java.awt.Dimension(80, 50));
        exitButton.setMinimumSize(new java.awt.Dimension(80, 50));
        exitButton.setPreferredSize(new java.awt.Dimension(80, 50));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        showAboutButton.setText("O GRZE");
        showAboutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showAboutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showRulesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(showAboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(381, 381, 381)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(startGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showRulesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(showAboutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startGameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startGameButtonMouseClicked
        
        evt.getComponent().getParent().getParent().getParent().getParent().setVisible(false);
        JFrame mainWindow = new JFrame();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setMinimumSize(new Dimension(1100,650));
        mainWindow.setVisible(true);
        mainWindow.setResizable(false);
        mainWindow.setContentPane(new clientOrServer());
    }//GEN-LAST:event_startGameButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void showRulesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showRulesButtonMouseClicked
        
        int X = evt.getComponent().getHeight()/2;
        int Y = evt.getComponent().getWidth()/2;
        
        JFrame mainWindow = new JFrame();
        mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainWindow.setMinimumSize(new Dimension(800,600));
        mainWindow.setBounds(X,Y,800,600);
        mainWindow.setVisible(true);
        mainWindow.setResizable(false);
        mainWindow.setContentPane(new rules());
    }//GEN-LAST:event_showRulesButtonMouseClicked

    private void showAboutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showAboutButtonMouseClicked
        JOptionPane.showMessageDialog(exitButton,"Autorski projekt implementacji gry w statki w Javie. Wykonał Wolski MAteusz i Wasiak Konrad",
                                        "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_showAboutButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton showAboutButton;
    private javax.swing.JButton showRulesButton;
    private javax.swing.JButton startGameButton;
    // End of variables declaration//GEN-END:variables
}
