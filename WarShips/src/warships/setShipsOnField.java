/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warships;

import game.battleField;
import game.ship;
import game.shipPart;
import java.awt.Color;
import static java.awt.SystemColor.window;
import java.awt.event.MouseEvent;
import java.io.Console;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import warships.obslugaSieciowa.obiektSieciowy;

/**
 *
 * @author wolsk
 */
public class setShipsOnField extends javax.swing.JPanel implements MouseInputListener {

    //lICZNIKI dodanych statków
    int counter1 = 4;
    int counter2 = 3;
    int counter3 = 2;
    int counter4 = 1;
    int shipCounter = 0;
    ButtonGroup wyborStatku = new ButtonGroup();
    shipPart[] poleBitwy = new shipPart[144];
    ship[] statki = new ship[12];
    shipPart[] ostatni;
    boolean horOrver = true;
    obiektSieciowy socket;
    
    public setShipsOnField(obiektSieciowy o) {
        initComponents();
        socket = o;
        wyborStatku.add(jRadioButton1);
        wyborStatku.add(jRadioButton2);
        wyborStatku.add(jRadioButton3);
        wyborStatku.add(jRadioButton4);
        jRadioButton1.setSelected(true);
        jButton2.setEnabled(false);
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Pionowo");
        jComboBox1.addItem("Poziomo");
        
        //Rozmieszczenie pól na planszy
        int y = 0;
        for (int i = 0; i < poleBitwy.length; i++) {
            int x = i - y * 12;
            if (x == 12) {
                y++;
                x = i - y * 12;
            }
            poleBitwy[i] = new shipPart(x, y);
            poleBitwy[i].setBounds(500 + x * 50, 12 + y * 50, 50, 50);
            poleBitwy[i].setEnabled(true);
            poleBitwy[i].setVisible(true);
            poleBitwy[i].addMouseListener(this);
            add(poleBitwy[i]);
        }

        for (int i = 0; i < 12; i++) {
            poleBitwy[i].setEnabled(false);
            poleBitwy[i].setFocusable(false);
            poleBitwy[i].setVisible(false);
            poleBitwy[i].disableField();
        }
        for (int i = 131; i < 143; i++) {
            poleBitwy[i].setEnabled(false);
            poleBitwy[i].setVisible(false);
            poleBitwy[i].disableField();
            poleBitwy[i].setFocusable(false);

        }
        for (int i = 0; i < 144; i++) {
            if ((i % 12 == 0) || ((i + 1) % 12 == 0)) {
                poleBitwy[i].setEnabled(false);
                poleBitwy[i].setFocusable(false);
                poleBitwy[i].setVisible(false);
                poleBitwy[i].disableField();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1100, 600));
        setMinimumSize(new java.awt.Dimension(1100, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jRadioButton1.setText("Statek pojedyńczy");

        jRadioButton2.setText("Statek podwójny");

        jRadioButton3.setText("Statek potrójny");

        jRadioButton4.setText("Statek poczwórny");

        jLabel1.setText("Pozostało : 4");

        jLabel2.setText("Pozostało : 3");

        jLabel3.setText("Pozostało : 2");

        jLabel4.setText("Pozostało : 1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jButton1.setText("Gotowy");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cofnij");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Resetuj");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(244, 244, 244)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(694, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        for (int i = 0; i < poleBitwy.length; i++) {
            poleBitwy[i].reset();
        }
        shipCounter = 0;
        counter1 = 4;
        counter2 = 3;
        counter3 = 2;
        counter4 = 1;
        jLabel1.setText("Pozostało : " + Integer.toString(counter1));
        jLabel2.setText("Pozostało : " + Integer.toString(counter2));
        jLabel3.setText("Pozostało : " + Integer.toString(counter3));
        jLabel4.setText("Pozostało : " + Integer.toString(counter4));


    }//GEN-LAST:event_jButton3MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        String pos = (String) evt.getItem();
        if (pos.equals("Pionowo")) {
            horOrver = true;
        } else {
            horOrver = false;
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    
    //Cofanie ostatniego ruchu
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        System.out.println("Przed usunieciem: " + shipCounter);
        for (shipPart p : ostatni) {
            odblokujPole(p.getXPolozenie(), p.getYPolozenie());
        }
        for (int i =0;i<poleBitwy.length;i++){
            if (poleBitwy[i].getBackground() == Color.green){
                zablokujSasiedniePola(poleBitwy[i].getXPolozenie(), poleBitwy[i].getYPolozenie());
            }
        }
        if (ostatni.length == 1) {
            counter1++;
            jLabel1.setText("Pozostało : " + Integer.toString(counter1));
        } else if (ostatni.length == 2) {
            counter2++;
            jLabel2.setText("Pozostało : " + Integer.toString(counter2));
        } else if (ostatni.length == 3) {
            counter3++;
            jLabel3.setText("Pozostało : " + Integer.toString(counter3));
        } else if (ostatni.length == 4) {
            counter4++;
            jLabel4.setText("Pozostało : " + Integer.toString(counter4));
        }
        ostatni =null;
        JButton temp = (JButton) evt.getComponent();
        temp.setEnabled(false);
        shipCounter--;
    }//GEN-LAST:event_jButton2MouseClicked

    
    //Obsługa kliknięcia przycisku "gotowy"
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (shipCounter == 10){
            for(shipPart p : poleBitwy){
                p.removeMouseListener(this);
            }
        JFrame window = (JFrame) evt.getComponent().getParent().getParent().getParent().getParent().getParent();
            try {
                window.setContentPane(new battleField(poleBitwy, socket));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(setShipsOnField.class.getName()).log(Level.SEVERE, null, ex);
            }
        window.invalidate();
        window.revalidate();
        } else {
            JOptionPane.showMessageDialog(null,"Alert", "Nie dodano wszystkich statków",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables

    
    //Ustawienie statku na planszy
    @Override
    public void mouseClicked(MouseEvent e) {
        shipPart temp = (shipPart) e.getComponent();
        int tempX = temp.getXPolozenie();
        int tempY = temp.getYPolozenie();

        if (!horOrver && temp.isEnabled()) {
            if (jRadioButton1.isSelected() && counter1 > 0) {
                temp.selectedToFight();

                shipPart[] statekPojedynczyTab = new shipPart[1];
                statekPojedynczyTab[0] = temp;
                ship statekPojedynczy = new ship(statekPojedynczyTab);
                statki[shipCounter] = statekPojedynczy;
                ostatni = statekPojedynczyTab;
                for (shipPart p : statekPojedynczyTab) {
                    zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                }
                counter1--;
                jLabel1.setText("Pozostało : " + Integer.toString(counter1));
                shipCounter++;
                jButton2.setEnabled(true);
            } else if (jRadioButton2.isSelected() && counter2 > 0) {

                shipPart[] podwojnyStatekTab = new shipPart[2];

                if (poleBitwy[(tempX + tempY * 12)].getXPolozenie() >= 5 && poleBitwy[tempX + (tempY * 12) - 1].isEnabled()) {
                    temp.selectedToFight();
                    poleBitwy[tempX + (tempY * 12) - 1].selectedToFight();

                    podwojnyStatekTab[0] = temp;
                    podwojnyStatekTab[1] = poleBitwy[tempX + (tempY * 12) - 1];
                    statki[shipCounter] = new ship(podwojnyStatekTab);
                    ostatni = podwojnyStatekTab;
                    for (shipPart p : podwojnyStatekTab) {
                        zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                    }
                    counter2--;
                    jLabel2.setText("Pozostało : " + Integer.toString(counter2));
                    shipCounter++;
                    jButton2.setEnabled(true);

                } else if (poleBitwy[(tempX + tempY * 12)].getXPolozenie() < 5 && poleBitwy[tempX + (tempY * 12) + 1].isEnabled()) {
                    temp.selectedToFight();
                    poleBitwy[tempX + (tempY * 12) + 1].selectedToFight();

                    podwojnyStatekTab[0] = temp;
                    podwojnyStatekTab[1] = poleBitwy[tempX + (tempY * 12) + 1];
                    statki[shipCounter] = new ship(podwojnyStatekTab);
                    ostatni = podwojnyStatekTab;
                    for (shipPart p : podwojnyStatekTab) {
                        zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                    }
                    counter2--;
                    jLabel2.setText("Pozostało : " + Integer.toString(counter2));
                    shipCounter++;
                    jButton2.setEnabled(true);

                }
            } else if (jRadioButton3.isSelected() && counter3 > 0) {
                shipPart[] potrojnyStatekTab = new shipPart[3];
                if (poleBitwy[(tempX + tempY * 12)].getXPolozenie() >= 5 && poleBitwy[tempX + (tempY * 12) - 1].isEnabled()
                        && poleBitwy[tempX + (tempY * 12) - 2].isEnabled()) {
                    temp.selectedToFight();
                    poleBitwy[tempX + (tempY * 12) - 1].selectedToFight();
                    poleBitwy[tempX + (tempY * 12) - 2].selectedToFight();
                    statki[shipCounter] = new ship(potrojnyStatekTab);
                    ostatni = potrojnyStatekTab;
                    potrojnyStatekTab[0] = temp;
                    potrojnyStatekTab[1] = poleBitwy[tempX + (tempY * 12) - 1];
                    potrojnyStatekTab[2] = poleBitwy[tempX + (tempY * 12) - 2];

                    for (shipPart p : potrojnyStatekTab) {
                        zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                    }
                    counter3--;
                    jLabel3.setText("Pozostało : " + Integer.toString(counter3));
                    shipCounter++;
                    jButton2.setEnabled(true);

                } else if (poleBitwy[(tempX + tempY * 12)].getXPolozenie() < 5 && poleBitwy[tempX + (tempY * 12) + 1].isEnabled()
                        && poleBitwy[tempX + (tempY * 12) + 2].isEnabled()) {
                    temp.selectedToFight();
                    poleBitwy[tempX + (tempY * 12) + 1].selectedToFight();
                    poleBitwy[tempX + (tempY * 12) + 2].selectedToFight();

                    potrojnyStatekTab[0] = temp;
                    potrojnyStatekTab[1] = poleBitwy[tempX + (tempY * 12) + 1];
                    potrojnyStatekTab[2] = poleBitwy[tempX + (tempY * 12) + 2];
                    statki[shipCounter] = new ship(potrojnyStatekTab);
                    ostatni = potrojnyStatekTab;
                    for (shipPart p : potrojnyStatekTab) {
                        zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                    }
                    counter3--;
                    jLabel3.setText("Pozostało : " + Integer.toString(counter3));
                    shipCounter++;
                    jButton2.setEnabled(true);

                }
            } else if (jRadioButton4.isSelected() && counter4 > 0) {
                shipPart[] poczwornyStatekTab = new shipPart[4];
                if (poleBitwy[(tempX + tempY * 12)].getXPolozenie() >= 5 && poleBitwy[tempX + (tempY * 12) - 1].isEnabled()
                        && poleBitwy[tempX + (tempY * 12) - 2].isEnabled() && poleBitwy[tempX + (tempY * 12) - 3].isEnabled()) {
                    temp.selectedToFight();
                    poleBitwy[tempX + (tempY * 12) - 1].selectedToFight();
                    poleBitwy[tempX + (tempY * 12) - 2].selectedToFight();
                    poleBitwy[tempX + (tempY * 12) - 3].selectedToFight();
                    poczwornyStatekTab[0] = temp;
                    poczwornyStatekTab[1] = poleBitwy[tempX + (tempY * 12) - 1];
                    poczwornyStatekTab[2] = poleBitwy[tempX + (tempY * 12) - 2];
                    poczwornyStatekTab[3] = poleBitwy[tempX + (tempY * 12) - 3];
                    statki[shipCounter] = new ship(poczwornyStatekTab);
                    ostatni = poczwornyStatekTab;
                    for (shipPart p : poczwornyStatekTab) {
                        zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                    }
                    counter4--;
                    jLabel4.setText("Pozostało : " + Integer.toString(counter4));
                    shipCounter++;
                    jButton2.setEnabled(true);

                } else if (poleBitwy[(tempX + tempY * 12)].getXPolozenie() < 5 && poleBitwy[tempX + (tempY * 12)+ 1].isEnabled()
                        && poleBitwy[tempX + (tempY * 12) + 2].isEnabled() && poleBitwy[tempX + (tempY* 12)  + 3].isEnabled()) {
                    temp.selectedToFight();
                    poleBitwy[tempX + (tempY * 12) + 1].selectedToFight();
                    poleBitwy[tempX + (tempY * 12) + 2].selectedToFight();
                    poleBitwy[tempX + (tempY * 12) + 3].selectedToFight();
                    poczwornyStatekTab[0] = temp;
                    poczwornyStatekTab[1] = poleBitwy[tempX + (tempY * 12) + 1];
                    poczwornyStatekTab[2] = poleBitwy[tempX + (tempY * 12) + 2];
                    poczwornyStatekTab[3] = poleBitwy[tempX + (tempY * 12) + 3];
                    statki[shipCounter] = new ship(poczwornyStatekTab);
                    ostatni = poczwornyStatekTab;
                    for (shipPart p : poczwornyStatekTab) {
                        zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                    }
                    counter4--;
                    jLabel4.setText("Pozostało : " + Integer.toString(counter4));
                    shipCounter++;
                    jButton2.setEnabled(true);

                }
            }
        } else if (horOrver && temp.isEnabled()) {
            if (jRadioButton1.isSelected() && counter1 > 0) {
                jLabel1.setText("Pozostało : " + Integer.toString(counter1));
                temp.selectedToFight();

                shipPart[] statekPojedynczyTab = new shipPart[1];
                statekPojedynczyTab[0] = temp;
                ship statekPojedynczy = new ship(statekPojedynczyTab);
                statki[shipCounter] = statekPojedynczy;
                ostatni = statekPojedynczyTab;
                for (shipPart p : statekPojedynczyTab) {
                    zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                }
                counter1--;
                jLabel1.setText("Pozostało : " + Integer.toString(counter1));
                shipCounter++;
                jButton2.setEnabled(true);

            } else if (jRadioButton2.isSelected() && counter2 > 0) {

                shipPart[] podwojnyStatekTab = new shipPart[2];

                if (poleBitwy[(tempX + tempY * 12)].getYPolozenie() >= 5 && poleBitwy[tempX + (tempY - 1) * 12].isEnabled()) {
                    temp.selectedToFight();
                    poleBitwy[tempX + (tempY - 1) * 12].selectedToFight();

                    podwojnyStatekTab[0] = temp;
                    podwojnyStatekTab[1] = poleBitwy[tempX + (tempY - 1) * 12];
                    statki[shipCounter] = new ship(podwojnyStatekTab);
                    ostatni = podwojnyStatekTab;
                    for (shipPart p : podwojnyStatekTab) {
                        zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                    }
                    counter2--;
                    jLabel2.setText("Pozostało : " + Integer.toString(counter2));
                    shipCounter++;
                    jButton2.setEnabled(true);

                } else if (poleBitwy[(tempX + tempY * 12)].getYPolozenie() < 5 && poleBitwy[tempX + (tempY + 1) * 12].isEnabled()) {
                    temp.selectedToFight();
                    poleBitwy[tempX + (tempY + 1) * 12].selectedToFight();

                    podwojnyStatekTab[0] = temp;
                    podwojnyStatekTab[1] = poleBitwy[tempX + (tempY + 1) * 12];
                    statki[shipCounter] = new ship(podwojnyStatekTab);
                    ostatni = podwojnyStatekTab;
                    for (shipPart p : podwojnyStatekTab) {
                        zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                    }
                    counter2--;
                    jLabel2.setText("Pozostało : " + Integer.toString(counter2));
                    shipCounter++;
                    jButton2.setEnabled(true);

                }
            } else if (jRadioButton3.isSelected() && counter3 > 0) {
                shipPart[] potrojnyStatekTab = new shipPart[3];
                if (poleBitwy[(tempX + tempY * 12)].getYPolozenie() >= 5 && poleBitwy[tempX + (tempY - 1) * 12].isEnabled()
                        && poleBitwy[tempX + (tempY - 2) * 12].isEnabled()) {
                    temp.selectedToFight();
                    poleBitwy[tempX + (tempY - 1) * 12].selectedToFight();
                    poleBitwy[tempX + (tempY - 2) * 12].selectedToFight();

                    potrojnyStatekTab[0] = temp;
                    potrojnyStatekTab[1] = poleBitwy[tempX + (tempY - 1) * 12];
                    potrojnyStatekTab[2] = poleBitwy[tempX + (tempY - 2) * 12];
                    statki[shipCounter] = new ship(potrojnyStatekTab);
                    ostatni = potrojnyStatekTab;
                    for (shipPart p : potrojnyStatekTab) {
                        zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                    }
                    counter3--;
                    jLabel3.setText("Pozostało : " + Integer.toString(counter3));
                    shipCounter++;
                    jButton2.setEnabled(true);

                } else if (poleBitwy[(tempX + tempY * 12)].getYPolozenie() < 5 && poleBitwy[tempX + (tempY + 1) * 12].isEnabled()
                        && poleBitwy[tempX + (tempY + 2) * 12].isEnabled()) {
                    temp.selectedToFight();
                    poleBitwy[tempX + (tempY + 1) * 12].selectedToFight();
                    poleBitwy[tempX + (tempY + 2) * 12].selectedToFight();

                    potrojnyStatekTab[0] = temp;
                    potrojnyStatekTab[1] = poleBitwy[tempX + (tempY + 1) * 12];
                    potrojnyStatekTab[2] = poleBitwy[tempX + (tempY + 2) * 12];
                    statki[shipCounter] = new ship(potrojnyStatekTab);
                    ostatni = potrojnyStatekTab;
                    for (shipPart p : potrojnyStatekTab) {
                        zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                    }
                    counter3--;
                    jLabel3.setText("Pozostało : " + Integer.toString(counter3));
                    shipCounter++;
                    jButton2.setEnabled(true);

                }
            } else if (jRadioButton4.isSelected() && counter4 > 0) {
                shipPart[] poczwornyStatekTab = new shipPart[4];
                if (poleBitwy[(tempX + tempY * 12)].getYPolozenie() >= 5 && poleBitwy[tempX + (tempY - 1) * 12].isEnabled()
                        && poleBitwy[tempX + (tempY - 2) * 12].isEnabled() && poleBitwy[tempX + (tempY - 3) * 12].isEnabled()) {
                    temp.selectedToFight();
                    poleBitwy[tempX + (tempY - 1) * 12].selectedToFight();
                    poleBitwy[tempX + (tempY - 2) * 12].selectedToFight();
                    poleBitwy[tempX + (tempY - 3) * 12].selectedToFight();
                    poczwornyStatekTab[0] = temp;
                    poczwornyStatekTab[1] = poleBitwy[tempX + (tempY - 1) * 12];
                    poczwornyStatekTab[2] = poleBitwy[tempX + (tempY - 2) * 12];
                    poczwornyStatekTab[3] = poleBitwy[tempX + (tempY - 3) * 12];
                    statki[shipCounter] = new ship(poczwornyStatekTab);
                    ostatni = poczwornyStatekTab;
                    for (shipPart p : poczwornyStatekTab) {
                        zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                    }
                    counter4--;
                    jLabel4.setText("Pozostało : " + Integer.toString(counter4));
                    shipCounter++;
                    jButton2.setEnabled(true);

                } else if (poleBitwy[(tempX + tempY * 12)].getYPolozenie() < 5 && poleBitwy[tempX + (tempY + 1) * 12].isEnabled()
                        && poleBitwy[tempX + (tempY + 2) * 12].isEnabled() && poleBitwy[tempX + (tempY + 3) * 12].isEnabled()) {
                    temp.selectedToFight();
                    poleBitwy[tempX + (tempY + 1) * 12].selectedToFight();
                    poleBitwy[tempX + (tempY + 2) * 12].selectedToFight();
                    poleBitwy[tempX + (tempY + 3) * 12].selectedToFight();
                    poczwornyStatekTab[0] = temp;
                    poczwornyStatekTab[1] = poleBitwy[tempX + (tempY + 1) * 12];
                    poczwornyStatekTab[2] = poleBitwy[tempX + (tempY + 2) * 12];
                    poczwornyStatekTab[3] = poleBitwy[tempX + (tempY + 3) * 12];
                    statki[shipCounter] = new ship(poczwornyStatekTab);
                    ostatni = poczwornyStatekTab;
                    for (shipPart p : poczwornyStatekTab) {
                        zablokujSasiedniePola(p.getXPolozenie(), p.getYPolozenie());
                    }
                    counter4--;
                    jLabel4.setText("Pozostało : " + Integer.toString(counter4));
                    shipCounter++;
                    jButton2.setEnabled(true);

                }
            }
        }

    }

    //Metoda wyłączająca możliwość użycia sąsiednich pól wokół statku
    private void zablokujSasiedniePola(int x, int y) {
        poleBitwy[(x + (y - 1) * 12)].disableField();
        poleBitwy[(x - 1) + (y - 1) * 12].disableField();
        poleBitwy[(x - 1) + y * 12].disableField();
        poleBitwy[(x - 1) + (y + 1) * 12].disableField();
        poleBitwy[x + (y + 1) * 12].disableField();
        poleBitwy[(x + 1) + (y - 1) * 12].disableField();
        poleBitwy[(x + 1) + y * 12].disableField();
        poleBitwy[(x + 1) + (y + 1) * 12].disableField();
    }

    //Metoda włączająca możliwość używania pola o danych współrzędnych
    public void odblokujPole(int x, int y) {
        poleBitwy[(x + (y - 1) * 12)].enableField();
        poleBitwy[(x - 1) + (y - 1) * 12].enableField();
        poleBitwy[(x - 1) + y * 12].enableField();
        poleBitwy[(x - 1) + (y + 1) * 12].enableField();
        poleBitwy[x + (y + 1) * 12].enableField();
        poleBitwy[(x + 1) + (y - 1) * 12].enableField();
        poleBitwy[(x + 1) + y * 12].enableField();
        poleBitwy[(x + 1) + (y + 1) * 12].enableField();
        poleBitwy[x + y * 12].enableField();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    //Podświetlanie przyszłego położenia statku na niebiesko po najechaniu myszą na dane pole
    @Override
    public void mouseEntered(MouseEvent e) {
        shipPart temp = (shipPart) e.getComponent();
        int tempX = temp.getXPolozenie();
        int tempY = temp.getYPolozenie();
        temp.focused();

        if (!horOrver) {
            if (jRadioButton2.isSelected()) {
                if (poleBitwy[(tempX + tempY * 12)].getXPolozenie() >= 5) {
                    poleBitwy[(tempX + tempY * 12) - 1].focused();
                } else {
                    poleBitwy[(tempX + tempY * 12) + 1].focused();
                }

            } else if (jRadioButton3.isSelected()) {
                if (poleBitwy[(tempX + tempY * 12)].getXPolozenie() >= 5) {
                    poleBitwy[(tempX + tempY * 12) - 1].focused();
                    poleBitwy[(tempX + tempY * 12) - 2].focused();
                } else {
                    poleBitwy[(tempX + tempY * 12) + 1].focused();
                    poleBitwy[(tempX + tempY * 12) + 2].focused();
                }
            } else if (jRadioButton4.isSelected()) {
                if (poleBitwy[(tempX + tempY * 12)].getXPolozenie() >= 5) {
                    poleBitwy[(tempX + tempY * 12) - 1].focused();
                    poleBitwy[(tempX + tempY * 12) - 2].focused();
                    poleBitwy[(tempX + tempY * 12) - 3].focused();
                } else {
                    poleBitwy[(tempX + tempY * 12) + 3].focused();
                    poleBitwy[(tempX + tempY * 12) + 2].focused();
                    poleBitwy[(tempX + tempY * 12) + 1].focused();
                }
            }
        } else {
            if (jRadioButton2.isSelected()) {
                if (poleBitwy[(tempX + tempY * 12)].getYPolozenie() >= 5) {
                    poleBitwy[tempX + (tempY - 1) * 12].focused();
                } else {
                    poleBitwy[tempX + (tempY + 1) * 12].focused();
                }

            } else if (jRadioButton3.isSelected()) {
                if (poleBitwy[(tempX + tempY * 12)].getYPolozenie() >= 5) {
                    poleBitwy[tempX + (tempY - 1) * 12].focused();
                    poleBitwy[tempX + (tempY - 2) * 12].focused();

                } else {
                    poleBitwy[tempX + (tempY + 1) * 12].focused();
                    poleBitwy[tempX + (tempY + 2) * 12].focused();
                }
            } else if (jRadioButton4.isSelected()) {
                if (poleBitwy[(tempX + tempY * 12)].getYPolozenie() >= 5) {
                    poleBitwy[tempX + (tempY - 1) * 12].focused();
                    poleBitwy[tempX + (tempY - 2) * 12].focused();
                    poleBitwy[tempX + (tempY - 3) * 12].focused();
                } else {
                    poleBitwy[tempX + (tempY + 1) * 12].focused();
                    poleBitwy[tempX + (tempY + 2) * 12].focused();
                    poleBitwy[tempX + (tempY + 3) * 12].focused();
                }
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        for (shipPart poleBitwy1 : poleBitwy) {
            poleBitwy1.unfocused();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e
    ) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e
    ) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
