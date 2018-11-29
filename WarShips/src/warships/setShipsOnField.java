/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warships;

import game.ship;
import game.shipPart;
import java.awt.event.MouseEvent;
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

    ButtonGroup wyborStatku = new ButtonGroup();
    shipPart[] poleBitwy = new shipPart[100];
    ship[] statki = new ship[8];
    boolean horOrver = true;

    public setShipsOnField(obiektSieciowy o) {
        initComponents();
        wyborStatku.add(jRadioButton1);
        wyborStatku.add(jRadioButton2);
        wyborStatku.add(jRadioButton3);
        wyborStatku.add(jRadioButton4);
        jRadioButton1.setSelected(true);
        jComboBox1.removeAllItems();
        jComboBox1.addItem("Pionowo");
        jComboBox1.addItem("Poziomo");
        int y = 0;
        for (int i = 0; i < poleBitwy.length; i++) {
            int x = i - y * 10;
            if (x == 10) {
                y++;
                x = i - y * 10;
            }
            System.out.print("Dodaje: x = " + x + " y= " + y);
            poleBitwy[i] = new shipPart(x, y);
            poleBitwy[i].setBounds(500 + x * 50, 10 + y * 50, 50, 50);
            poleBitwy[i].setEnabled(true);
            poleBitwy[i].setVisible(true);
            poleBitwy[i].addMouseListener(this);
            add(poleBitwy[i]);
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

        jButton2.setText("Usuń");

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

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        String pos = (String) evt.getItem();
        if (pos.equals("Pionowo")) {
            horOrver = true;
            System.out.println(horOrver);
        } else {
            horOrver = false;
            System.out.println(horOrver);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        for (int i = 0; i < poleBitwy.length; i++) {
            poleBitwy[i].reset();
        }
    }//GEN-LAST:event_jButton3MouseClicked


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

    @Override
    public void mouseClicked(MouseEvent e) {
        shipPart temp = (shipPart) e.getComponent();
        int tempX = temp.getXPolozenie();
        int tempY = temp.getYPolozenie();
        if (counter1 > 0 && jRadioButton1.isSelected()) {
            if (jRadioButton1.isSelected()) {
                counter1--;
                temp.selectedToFight();
                System.out.println(counter1);
            }
        }

        if (jRadioButton2.isSelected() && counter2 > 0) {
            temp.selectedToFight();
            if (((tempX + tempY * 10) + 1) == 100 || poleBitwy[(tempX + tempY * 10) + 1].getYPolozenie() > temp.getYPolozenie()) {
                poleBitwy[(tempX + tempY * 10) - 1].selectedToFight();
            } else {
                poleBitwy[(tempX + tempY * 10) + 1].selectedToFight();
            }
            counter2--;
        } else if (jRadioButton3.isSelected() && counter3 > 0) {
            temp.selectedToFight();
            if (((tempX + tempY * 10) + 2) >= 100 || poleBitwy[(tempX + tempY * 10) + 2].getYPolozenie() > temp.getYPolozenie()) {
                poleBitwy[(tempX + tempY * 10) - 1].selectedToFight();
                if (((tempX + tempY * 10) + 1) >= 100 || poleBitwy[(tempX + tempY * 10) + 1].getYPolozenie() > temp.getYPolozenie()) {
                    poleBitwy[(tempX + tempY * 10) - 2].selectedToFight();
                } else {
                    poleBitwy[(tempX + tempY * 10) + 1].selectedToFight();
                }
            } else {
                poleBitwy[(tempX + tempY * 10) + 1].selectedToFight();
                poleBitwy[(tempX + tempY * 10) + 2].selectedToFight();
            }
            counter3--;
        } else if (jRadioButton4.isSelected() && counter4 > 0) {
            temp.selectedToFight();
            if (((tempX + tempY * 10) + 3) >= 100 || poleBitwy[(tempX + tempY * 10) + 3].getYPolozenie() > temp.getYPolozenie()) {
                poleBitwy[(tempX + tempY * 10) - 1].selectedToFight();
                if (((tempX + tempY * 10) + 2) >= 100 || poleBitwy[(tempX + tempY * 10) + 2].getYPolozenie() > temp.getYPolozenie()) {
                    poleBitwy[(tempX + tempY * 10) - 2].selectedToFight();
                    if (((tempX + tempY * 10) + 1) >= 100 || poleBitwy[(tempX + tempY * 10) + 1].getYPolozenie() > temp.getYPolozenie()) {
                        poleBitwy[(tempX + tempY * 10) - 3].selectedToFight();
                    } else {
                        poleBitwy[(tempX + tempY * 10) + 1].selectedToFight();
                    }
                } else {
                    poleBitwy[(tempX + tempY * 10) + 1].selectedToFight();
                    poleBitwy[(tempX + tempY * 10) + 2].selectedToFight();
                }
            } else {
                poleBitwy[(tempX + tempY * 10) + 3].selectedToFight();
                poleBitwy[(tempX + tempY * 10) + 2].selectedToFight();
                poleBitwy[(tempX + tempY * 10) + 1].selectedToFight();
            }
            counter4--;
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        shipPart temp = (shipPart) e.getComponent();
        int tempX = temp.getXPolozenie();
        int tempY = temp.getYPolozenie();
        temp.focused();

        if (jRadioButton2.isSelected()) {
            if (((tempX + tempY * 10) + 1) >= 100 || poleBitwy[(tempX + tempY * 10) + 1].getYPolozenie() > temp.getYPolozenie()) {
                poleBitwy[(tempX + tempY * 10) - 1].focused();
            } else {
                poleBitwy[(tempX + tempY * 10) + 1].focused();
            }

        } else if (jRadioButton3.isSelected()) {
            if (((tempX + tempY * 10) + 2) >= 100 || poleBitwy[(tempX + tempY * 10) + 2].getYPolozenie() > temp.getYPolozenie()) {
                poleBitwy[(tempX + tempY * 10) - 1].focused();
                if (((tempX + tempY * 10) + 1) >= 100 || poleBitwy[(tempX + tempY * 10) + 1].getYPolozenie() > temp.getYPolozenie()) {
                    poleBitwy[(tempX + tempY * 10) - 2].focused();
                } else {
                    poleBitwy[(tempX + tempY * 10) + 1].focused();
                }
            } else {
                poleBitwy[(tempX + tempY * 10) + 1].focused();
                poleBitwy[(tempX + tempY * 10) + 2].focused();
            }
        } else if (jRadioButton4.isSelected()) {
            if (((tempX + tempY * 10) + 3) >= 100 || poleBitwy[(tempX + tempY * 10) + 3].getYPolozenie() > temp.getYPolozenie()) {
                poleBitwy[(tempX + tempY * 10) - 1].focused();
                if (((tempX + tempY * 10) + 2) >= 100 || poleBitwy[(tempX + tempY * 10) + 2].getYPolozenie() > temp.getYPolozenie()) {
                    poleBitwy[(tempX + tempY * 10) - 2].focused();
                    if (((tempX + tempY * 10) + 1) >= 100 || poleBitwy[(tempX + tempY * 10) + 1].getYPolozenie() > temp.getYPolozenie()) {
                        poleBitwy[(tempX + tempY * 10) - 3].focused();
                    } else {
                        poleBitwy[(tempX + tempY * 10) + 1].focused();
                    }
                } else {
                    poleBitwy[(tempX + tempY * 10) + 1].focused();
                    poleBitwy[(tempX + tempY * 10) + 2].focused();
                }
            } else {
                poleBitwy[(tempX + tempY * 10) + 3].focused();
                poleBitwy[(tempX + tempY * 10) + 2].focused();
                poleBitwy[(tempX + tempY * 10) + 1].focused();
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        shipPart temp = (shipPart) e.getComponent();
        int tempX = temp.getXPolozenie();
        int tempY = temp.getYPolozenie();
        temp.unfocused();

        if (jRadioButton2.isSelected()) {
            if (((tempX + tempY * 10) + 1) == 100 || poleBitwy[(tempX + tempY * 10) + 1].getYPolozenie() > temp.getYPolozenie()) {
                poleBitwy[(tempX + tempY * 10) - 1].unfocused();
            } else {
                poleBitwy[(tempX + tempY * 10) + 1].unfocused();
            }
        } else if (jRadioButton3.isSelected()) {
            if (((tempX + tempY * 10) + 2) >= 100 || poleBitwy[(tempX + tempY * 10) + 2].getYPolozenie() > temp.getYPolozenie()) {
                poleBitwy[(tempX + tempY * 10) - 1].unfocused();
                if (((tempX + tempY * 10) + 1) >= 100 || poleBitwy[(tempX + tempY * 10) + 1].getYPolozenie() > temp.getYPolozenie()) {
                    poleBitwy[(tempX + tempY * 10) - 2].unfocused();
                } else {
                    poleBitwy[(tempX + tempY * 10) + 1].unfocused();
                }
            } else {
                poleBitwy[(tempX + tempY * 10) + 1].unfocused();
                poleBitwy[(tempX + tempY * 10) + 2].unfocused();
            }
        } else if (jRadioButton4.isSelected()) {
            if (((tempX + tempY * 10) + 3) >= 100 || poleBitwy[(tempX + tempY * 10) + 3].getYPolozenie() > temp.getYPolozenie()) {
                poleBitwy[(tempX + tempY * 10) - 1].unfocused();
                if (((tempX + tempY * 10) + 2) >= 100 || poleBitwy[(tempX + tempY * 10) + 2].getYPolozenie() > temp.getYPolozenie()) {
                    poleBitwy[(tempX + tempY * 10) - 2].unfocused();
                    if (((tempX + tempY * 10) + 1) >= 100 || poleBitwy[(tempX + tempY * 10) + 1].getYPolozenie() > temp.getYPolozenie()) {
                        poleBitwy[(tempX + tempY * 10) - 3].unfocused();
                    } else {
                        poleBitwy[(tempX + tempY * 10) + 1].unfocused();
                    }
                } else {
                    poleBitwy[(tempX + tempY * 10) + 1].unfocused();
                    poleBitwy[(tempX + tempY * 10) + 2].unfocused();
                }
            } else {
                poleBitwy[(tempX + tempY * 10) + 3].unfocused();
                poleBitwy[(tempX + tempY * 10) + 2].unfocused();
                poleBitwy[(tempX + tempY * 10) + 1].unfocused();
            }
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
