/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Core.Order;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author VINH DAT
 */
public class Map extends javax.swing.JFrame {

    private String ban;
    public Map map;

    public String getBan() {
        return ban;
    }

    /**
     * Creates new form Map
     */
    public String getDateTime() {
        String date = "" + java.time.LocalDateTime.now();
        String word[] = date.split("T");
        date = word[0] + " " + word[1].substring(0,8);
        return date;
    }

    public Map() {
        initComponents();
        btnExit.setBackground(Color.RED);
        btnExit.setFont(new Font("arial",Font.BOLD,20));
        if (!new Manager.ManagerOrder().checkTableEmpty("1")) {
            table1.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("2")) {
            table2.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("3")) {
            table3.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("4")) {
            table4.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("5")) {
            table5.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("6")) {
            table6.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("7")) {
            table7.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("8")) {
            table8.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("9")) {
            table9.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("10")) {
            table10.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("11")) {
            table11.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("12")) {
            table12.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("13")) {
            table13.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("14")) {
            table14.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("15")) {
            table15.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("16")) {
            table16.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("17")) {
            table17.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("18")) {
            table18.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("19")) {
            table19.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("20")) {
            table20.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("21")) {
            table21.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("22")) {
            table22.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("23")) {
            table23.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("24")) {
            table24.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("25")) {
            table25.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("26")) {
            table26.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("27")) {
            table27.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("28")) {
            table28.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("29")) {
            table29.setBackground(Color.RED);
        }
        if (!new Manager.ManagerOrder().checkTableEmpty("30")) {
            table30.setBackground(Color.RED);
        }
    }

    public void writeTable(String name) {
        try {
            String fileName = "C:\\Users\\nguye\\Desktop\\tempTable.dat";
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            try {
                FileWriter fw = new FileWriter(fileName);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(name);
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        table1 = new javax.swing.JButton();
        table2 = new javax.swing.JButton();
        table3 = new javax.swing.JButton();
        table4 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        table5 = new javax.swing.JButton();
        table6 = new javax.swing.JButton();
        table7 = new javax.swing.JButton();
        table8 = new javax.swing.JButton();
        table9 = new javax.swing.JButton();
        table10 = new javax.swing.JButton();
        table11 = new javax.swing.JButton();
        table12 = new javax.swing.JButton();
        table13 = new javax.swing.JButton();
        table14 = new javax.swing.JButton();
        table15 = new javax.swing.JButton();
        table16 = new javax.swing.JButton();
        table17 = new javax.swing.JButton();
        table18 = new javax.swing.JButton();
        table19 = new javax.swing.JButton();
        table20 = new javax.swing.JButton();
        table21 = new javax.swing.JButton();
        table22 = new javax.swing.JButton();
        table23 = new javax.swing.JButton();
        table24 = new javax.swing.JButton();
        table25 = new javax.swing.JButton();
        table26 = new javax.swing.JButton();
        table27 = new javax.swing.JButton();
        table28 = new javax.swing.JButton();
        table29 = new javax.swing.JButton();
        table30 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table1.setText("Bàn 1");
        table1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table1ActionPerformed(evt);
            }
        });

        table2.setText("Bàn 2");
        table2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table2ActionPerformed(evt);
            }
        });

        table3.setText("Bàn 3");
        table3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table3ActionPerformed(evt);
            }
        });

        table4.setText("Bàn 4");
        table4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table4ActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        table5.setText("Bàn 5");
        table5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table5ActionPerformed(evt);
            }
        });

        table6.setText("Bàn 6");
        table6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table6ActionPerformed(evt);
            }
        });

        table7.setText("Bàn 7");
        table7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table7ActionPerformed(evt);
            }
        });

        table8.setText("Bàn 8");
        table8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table8ActionPerformed(evt);
            }
        });

        table9.setText("Bàn 9");
        table9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table9ActionPerformed(evt);
            }
        });

        table10.setText("Bàn 10");
        table10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table10ActionPerformed(evt);
            }
        });

        table11.setText("Bàn 11");
        table11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table11ActionPerformed(evt);
            }
        });

        table12.setText("Bàn 12");
        table12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table12ActionPerformed(evt);
            }
        });

        table13.setText("Bàn 13");
        table13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table13ActionPerformed(evt);
            }
        });

        table14.setText("Bàn 14");
        table14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table14ActionPerformed(evt);
            }
        });

        table15.setText("Bàn 15");
        table15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table15ActionPerformed(evt);
            }
        });

        table16.setText("Bàn 16");
        table16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table16ActionPerformed(evt);
            }
        });

        table17.setText("Bàn 17");
        table17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table17ActionPerformed(evt);
            }
        });

        table18.setText("Bàn 18");
        table18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table18ActionPerformed(evt);
            }
        });

        table19.setText("Bàn 19");
        table19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table19ActionPerformed(evt);
            }
        });

        table20.setText("Bàn 20");
        table20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table20ActionPerformed(evt);
            }
        });

        table21.setText("Bàn 21");
        table21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table21ActionPerformed(evt);
            }
        });

        table22.setText("Bàn 22");
        table22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table22ActionPerformed(evt);
            }
        });

        table23.setText("Bàn 23");
        table23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table23ActionPerformed(evt);
            }
        });

        table24.setText("Bàn 24");
        table24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table24ActionPerformed(evt);
            }
        });

        table25.setText("Bàn 25");
        table25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table25ActionPerformed(evt);
            }
        });

        table26.setText("Bàn 26");
        table26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table26ActionPerformed(evt);
            }
        });

        table27.setText("Bàn 27");
        table27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table27ActionPerformed(evt);
            }
        });

        table28.setText("Bàn 28");
        table28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table28ActionPerformed(evt);
            }
        });

        table29.setText("Bàn 29");
        table29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table29ActionPerformed(evt);
            }
        });

        table30.setText("Bàn 30");
        table30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(table1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(table7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                    .addComponent(table13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(table2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addComponent(table8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(table14)
                    .addComponent(table20)
                    .addComponent(table26))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(table3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(table9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(table15)
                    .addComponent(table21)
                    .addComponent(table27))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table22)
                    .addComponent(table16)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(table10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(table4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(table11)
                                        .addComponent(table5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(table17)
                                            .addComponent(table23)
                                            .addComponent(table29)))))
                            .addComponent(table28))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(table12)
                            .addComponent(table6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table30)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(table18)
                                    .addComponent(table24))
                                .addGap(68, 68, 68)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(83, 114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(table6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(table5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(table1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(table2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(table3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(table4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(table12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(table10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(table9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(table8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(table7, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(table11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(table13, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(table17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(table18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(table14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(table22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(table21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(table20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(table23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(table24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(table19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(table28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table25, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(table29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table1ActionPerformed
        // TODO add your handling code here:
        writeTable("1");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table1ActionPerformed

    private void table2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table2ActionPerformed
        // TODO add your handling code here:
        writeTable("2");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table2ActionPerformed

    private void table3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table3ActionPerformed
        // TODO add your handling code here:
        writeTable("3");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table3ActionPerformed

    private void table4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table4ActionPerformed
        // TODO add your handling code here:
        writeTable("4");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table4ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void table5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table5ActionPerformed
        // TODO add your handling code here:
        writeTable("5");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table5ActionPerformed

    private void table6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table6ActionPerformed
        // TODO add your handling code here:
        writeTable("6");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table6ActionPerformed

    private void table7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table7ActionPerformed
        // TODO add your handling code here:
        writeTable("7");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table7ActionPerformed

    private void table8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table8ActionPerformed
        // TODO add your handling code here:
        writeTable("8");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table8ActionPerformed

    private void table9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table9ActionPerformed
        // TODO add your handling code here:
        writeTable("9");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table9ActionPerformed

    private void table10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table10ActionPerformed
        // TODO add your handling code here:
        writeTable("10");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table10ActionPerformed

    private void table11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table11ActionPerformed
        // TODO add your handling code here:
        writeTable("11");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table11ActionPerformed

    private void table12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table12ActionPerformed
        // TODO add your handling code here:
        writeTable("12");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table12ActionPerformed

    private void table13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table13ActionPerformed
        // TODO add your handling code here:
        writeTable("13");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table13ActionPerformed

    private void table14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table14ActionPerformed
        // TODO add your handling code here:
        writeTable("14");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table14ActionPerformed

    private void table15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table15ActionPerformed
        // TODO add your handling code here:
        writeTable("15");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table15ActionPerformed

    private void table16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table16ActionPerformed
        // TODO add your handling code here:
        writeTable("16");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table16ActionPerformed

    private void table17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table17ActionPerformed
        // TODO add your handling code here:
        writeTable("17");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table17ActionPerformed

    private void table18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table18ActionPerformed
        // TODO add your handling code here:
        writeTable("18");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table18ActionPerformed

    private void table19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table19ActionPerformed
        // TODO add your handling code here:
        writeTable("19");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table19ActionPerformed

    private void table20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table20ActionPerformed
        // TODO add your handling code here:
        writeTable("20");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table20ActionPerformed

    private void table21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table21ActionPerformed
        // TODO add your handling code here:
        writeTable("21");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table21ActionPerformed

    private void table22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table22ActionPerformed
        // TODO add your handling code here:
        writeTable("22");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table22ActionPerformed

    private void table23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table23ActionPerformed
        // TODO add your handling code here:
        writeTable("23");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table23ActionPerformed

    private void table24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table24ActionPerformed
        // TODO add your handling code here:
        writeTable("24");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table24ActionPerformed

    private void table25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table25ActionPerformed
        // TODO add your handling code here:
        writeTable("25");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table25ActionPerformed

    private void table26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table26ActionPerformed
        // TODO add your handling code here:
        writeTable("26");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table26ActionPerformed

    private void table27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table27ActionPerformed
        // TODO add your handling code here:
        writeTable("27");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table27ActionPerformed

    private void table28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table28ActionPerformed
        // TODO add your handling code here:
        writeTable("28");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table28ActionPerformed

    private void table29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table29ActionPerformed
        // TODO add your handling code here:
        writeTable("29");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table29ActionPerformed

    private void table30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table30ActionPerformed
        // TODO add your handling code here:
        writeTable("30");
        OrderUI a = new OrderUI();
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        a.setVisible(true);
        this.hide();
    }//GEN-LAST:event_table30ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            Map m=new Map();
            public void run() {
                m.setTitle("Sơ đồ bàn");
                m.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton table1;
    private javax.swing.JButton table10;
    private javax.swing.JButton table11;
    private javax.swing.JButton table12;
    private javax.swing.JButton table13;
    private javax.swing.JButton table14;
    private javax.swing.JButton table15;
    private javax.swing.JButton table16;
    private javax.swing.JButton table17;
    private javax.swing.JButton table18;
    private javax.swing.JButton table19;
    private javax.swing.JButton table2;
    private javax.swing.JButton table20;
    private javax.swing.JButton table21;
    private javax.swing.JButton table22;
    private javax.swing.JButton table23;
    private javax.swing.JButton table24;
    private javax.swing.JButton table25;
    private javax.swing.JButton table26;
    private javax.swing.JButton table27;
    private javax.swing.JButton table28;
    private javax.swing.JButton table29;
    private javax.swing.JButton table3;
    private javax.swing.JButton table30;
    private javax.swing.JButton table4;
    private javax.swing.JButton table5;
    private javax.swing.JButton table6;
    private javax.swing.JButton table7;
    private javax.swing.JButton table8;
    private javax.swing.JButton table9;
    // End of variables declaration//GEN-END:variables
}
