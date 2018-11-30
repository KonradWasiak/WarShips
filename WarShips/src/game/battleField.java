/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import warships.MainMenu;

/**
 *
 * @author wolsk
 */
public class battleField extends javax.swing.JPanel implements MouseListener {

    shipPart[] planszaGracza = new shipPart[144];
    shipPart[] planszaPrzeciwnika = new shipPart[144];

    public battleField(shipPart[] pB) {
        initComponents();
        planszaGracza = pB;
        int y = 0;
        for (int i = 0; i < planszaPrzeciwnika.length; i++) {
            int x = i - y * 12;
            if (x == 12) {
                y++;
                x = i - y * 12;
            }
            planszaPrzeciwnika[i] = new shipPart(x, y);
            planszaPrzeciwnika[i].setBounds(x * 50, y * 50, 50, 50);
            planszaPrzeciwnika[i].setEnabled(true);
            planszaPrzeciwnika[i].setVisible(true);
            planszaPrzeciwnika[i].addMouseListener(this);
            jPanel2.add(planszaPrzeciwnika[i]);

        }
        y = 0;
        for (int i = 0; i < pB.length; i++) {
            int x = i - y * 12;
            if (x == 12) {
                y++;
                x = i - y * 12;
            }
            pB[i].setBounds(-50 + x * 50, -50 + y * 50, 50, 50);
            pB[i].setEnabled(false);

            if (x == 0 || y == 0 || y == 11 || x == 11) {
                pB[i].setVisible(false);
            }
            jPanel1.add(pB[i]);
        }
        for (int i = 0; i < pB.length; i++) {
            System.out.println(pB[i].toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1100, 600));
        setMinimumSize(new java.awt.Dimension(1100, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel2.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel3.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel4.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel5.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("5");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel5.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel5.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel6.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("6");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel6.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel6.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel7.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("7");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel7.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel7.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel7.setPreferredSize(new java.awt.Dimension(50, 50));
        jLabel7.setRequestFocusEnabled(false);

        jLabel8.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("8");
        jLabel8.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel8.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel8.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel9.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("9");
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel9.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel9.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel10.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("10");
        jLabel10.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel10.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel10.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel10.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel11.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("1");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel11.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel11.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel13.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("3");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel13.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel13.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel14.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("4");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel14.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel14.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel15.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("5");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel15.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel15.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel16.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("6");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel16.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel16.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel16.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel17.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("7");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel17.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel17.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel18.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("8");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel18.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel18.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel18.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel19.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("9");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel19.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel19.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel20.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("10");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel20.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel20.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel12.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("2");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel12.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel12.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel21.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("10");
        jLabel21.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel21.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel21.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel21.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel22.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("9");
        jLabel22.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel22.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel22.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel22.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel23.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("8");
        jLabel23.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel23.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel23.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel23.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel24.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("7");
        jLabel24.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel24.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel24.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel24.setPreferredSize(new java.awt.Dimension(50, 50));
        jLabel24.setRequestFocusEnabled(false);

        jLabel25.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("6");
        jLabel25.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel25.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel25.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel25.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel26.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("5");
        jLabel26.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel26.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel26.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel26.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel27.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("4");
        jLabel27.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel27.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel27.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel27.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel28.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("3");
        jLabel28.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel28.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel28.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel28.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel29.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("2");
        jLabel29.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel29.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel29.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel29.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel30.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("1");
        jLabel30.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel30.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel30.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel30.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        shipPart temp = (shipPart) e.getComponent();
        //Tutaj po kliknieciu wyslac wiadomosc do przeciwnika
        //I jesli trafiony to
        if (!temp.isEnabled()) {
            temp.dostalemSzczala();
        }
        //Jesli nie 
        if (temp.isEnabled()) {
            temp.puste();
        }
        //I po kazdym kliknieciu
        temp.setEnabled(false);
        //i jeszcze trzeba odbierac od drugieo gracza info czy koniec juz, i wtedy message box jakis i przenosic do menu
        if (false) {
            JFrame window = (JFrame) e.getComponent().getParent().getParent().getParent().getParent().getParent();
            window.setContentPane(new MainMenu());
            window.invalidate();
            window.revalidate();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        shipPart temp = (shipPart) e.getComponent();
        temp.focused();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        shipPart temp = (shipPart) e.getComponent();
        temp.unfocused();
    }
}
