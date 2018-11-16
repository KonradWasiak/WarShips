package warships;

import javax.swing.*;
import sun.awt.im.InputMethodJFrame;

public class Menu extends JPanel {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        gameRules = new javax.swing.JButton();
        gameStart = new javax.swing.JButton();
        gameExit = new javax.swing.JButton();
        gameAbout = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel1.setText("WarShips - Ships Fight Field");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        gameRules.setFont(new java.awt.Font("Nirmala UI Semilight", 2, 36)); // NOI18N
        gameRules.setText("ZASADY GRY");

        gameStart.setFont(new java.awt.Font("Nirmala UI Semilight", 2, 36)); // NOI18N
        gameStart.setText("START GRY");
        gameStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameStartActionPerformed(evt);
            }
        });

        gameExit.setFont(new java.awt.Font("Nirmala UI Semilight", 2, 36)); // NOI18N
        gameExit.setText("WYJSCIE");

        gameAbout.setText("O GRZE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addComponent(gameStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameRules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(300, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gameAbout)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(gameStart, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameRules, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameExit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(gameAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gameStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameStartActionPerformed
        JFrame w = new JFrame();
        super.setVisible(false);
        w.setSize(1000,650);
        w.setVisible(true);
        w.setContentPane(new setShipsOnField());
        
    }//GEN-LAST:event_gameStartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gameAbout;
    private javax.swing.JButton gameExit;
    private javax.swing.JButton gameRules;
    private javax.swing.JButton gameStart;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
