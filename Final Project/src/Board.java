
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Name: Gavin Hazlett and Samuel Hazlett
 */
public class Board extends javax.swing.JFrame {

    /**
     * Creates new form Board
     */
    private String gameStart = "x"; //X starts
    
    public Board() {
        initComponents();
    }
    
    public void resetBoard() { //Resets board clearnig all inputs
    Tic1.setText("");
    Tic2.setText("");
    Tic3.setText("");
    Tic4.setText("");
    Tic5.setText("");
    Tic6.setText("");
    Tic7.setText("");
    Tic8.setText("");
    Tic9.setText("");

   
}

    
    private void choosePlayer() { //Determines whose turn it is and who ever losses goes first next time
    if (gameStart.equals("x")) {
        gameStart = "o";
    } else {
        gameStart = "x";
    }
}
    public boolean drawChecker() {
    return !Tic1.getText().equals("") && 
           !Tic2.getText().equals("") && 
           !Tic3.getText().equals("") && 
           !Tic4.getText().equals("") && 
           !Tic5.getText().equals("") && 
           !Tic6.getText().equals("") && 
           !Tic7.getText().equals("") && 
           !Tic8.getText().equals("") && 
           !Tic9.getText().equals("");
    }

    
    

    private void gameWin() { //The logic on which a win is determined
 String b1 = Tic1.getText();
 String b2 = Tic2.getText();
 String b3 = Tic3.getText();
 String b4 = Tic4.getText();
 String b5 = Tic5.getText();
 String b6 = Tic6.getText();
 String b7 = Tic7.getText();
 String b8 = Tic8.getText();
 String b9 = Tic9.getText();
 
 
// Win Conditions for X
if (b1.equals("x") && b2.equals("x") && b3.equals("x")) {
    JOptionPane.showMessageDialog(null, "Player X Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b4.equals("x") && b5.equals("x") && b6.equals("x")) {
    JOptionPane.showMessageDialog(null, "Player X Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b7.equals("x") && b8.equals("x") && b9.equals("x")) {
    JOptionPane.showMessageDialog(null, "Player X Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b1.equals("x") && b4.equals("x") && b7.equals("x")) {
    JOptionPane.showMessageDialog(null, "Player X Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b2.equals("x") && b5.equals("x") && b8.equals("x")) {
    JOptionPane.showMessageDialog(null, "Player X Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b3.equals("x") && b6.equals("x") && b9.equals("x")) {
    JOptionPane.showMessageDialog(null, "Player X Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b1.equals("x") && b5.equals("x") && b9.equals("x")) {
    JOptionPane.showMessageDialog(null, "Player X Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b3.equals("x") && b5.equals("x") && b7.equals("x")) {
    JOptionPane.showMessageDialog(null, "Player X Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
}

// Win Conditions for O
else if (b1.equals("o") && b2.equals("o") && b3.equals("o")) {
    JOptionPane.showMessageDialog(null, "Player O Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b4.equals("o") && b5.equals("o") && b6.equals("o")) {
    JOptionPane.showMessageDialog(null, "Player O Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b7.equals("o") && b8.equals("o") && b9.equals("o")) {
    JOptionPane.showMessageDialog(null, "Player O Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b1.equals("o") && b4.equals("o") && b7.equals("o")) {
    JOptionPane.showMessageDialog(null, "Player O Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b2.equals("o") && b5.equals("o") && b8.equals("o")) {
    JOptionPane.showMessageDialog(null, "Player O Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b3.equals("o") && b6.equals("o") && b9.equals("o")) {
    JOptionPane.showMessageDialog(null, "Player O Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b1.equals("o") && b5.equals("o") && b9.equals("o")) {
    JOptionPane.showMessageDialog(null, "Player O Wins!", "Winner", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
} else if (b3.equals("o") && b5.equals("o") && b7.equals("o")) {
    JOptionPane.showMessageDialog(null, "Player O Wins!", "Winner!", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
}

// Draw Checker
else if (drawChecker()) {
    JOptionPane.showMessageDialog(null, "It's a Draw!", "Info", JOptionPane.INFORMATION_MESSAGE);
    resetBoard(); // Invoking resetBoard Method
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Tic8 = new javax.swing.JButton();
        Tic6 = new javax.swing.JButton();
        Tic2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Tic5 = new javax.swing.JButton();
        Tic1 = new javax.swing.JButton();
        Tic4 = new javax.swing.JButton();
        Tic7 = new javax.swing.JButton();
        Tic9 = new javax.swing.JButton();
        Tic3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(95, 158, 240));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setPreferredSize(new java.awt.Dimension(820, 570));

        Tic8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Tic8.setMaximumSize(new java.awt.Dimension(250, 158));
        Tic8.setMinimumSize(new java.awt.Dimension(250, 158));
        Tic8.setOpaque(false);
        Tic8.setPreferredSize(new java.awt.Dimension(250, 158));
        Tic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic8ActionPerformed(evt);
            }
        });

        Tic6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Tic6.setMaximumSize(new java.awt.Dimension(250, 158));
        Tic6.setMinimumSize(new java.awt.Dimension(250, 158));
        Tic6.setOpaque(false);
        Tic6.setPreferredSize(new java.awt.Dimension(250, 158));
        Tic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic6ActionPerformed(evt);
            }
        });

        Tic2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Tic2.setMaximumSize(new java.awt.Dimension(250, 158));
        Tic2.setMinimumSize(new java.awt.Dimension(250, 158));
        Tic2.setOpaque(false);
        Tic2.setPreferredSize(new java.awt.Dimension(250, 158));
        Tic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(95, 158, 240));
        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(95, 158, 240));
        jLabel1.setText("Tic-Tac-Toe");

        Tic5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Tic5.setMaximumSize(new java.awt.Dimension(250, 158));
        Tic5.setMinimumSize(new java.awt.Dimension(250, 158));
        Tic5.setOpaque(false);
        Tic5.setPreferredSize(new java.awt.Dimension(250, 158));
        Tic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic5ActionPerformed(evt);
            }
        });

        Tic1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Tic1.setMaximumSize(new java.awt.Dimension(250, 158));
        Tic1.setMinimumSize(new java.awt.Dimension(250, 158));
        Tic1.setOpaque(false);
        Tic1.setPreferredSize(new java.awt.Dimension(250, 158));
        Tic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic1ActionPerformed(evt);
            }
        });

        Tic4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Tic4.setMaximumSize(new java.awt.Dimension(250, 158));
        Tic4.setMinimumSize(new java.awt.Dimension(250, 158));
        Tic4.setOpaque(false);
        Tic4.setPreferredSize(new java.awt.Dimension(250, 158));
        Tic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic4ActionPerformed(evt);
            }
        });

        Tic7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Tic7.setMaximumSize(new java.awt.Dimension(250, 158));
        Tic7.setMinimumSize(new java.awt.Dimension(250, 158));
        Tic7.setOpaque(false);
        Tic7.setPreferredSize(new java.awt.Dimension(250, 158));
        Tic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic7ActionPerformed(evt);
            }
        });

        Tic9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Tic9.setMaximumSize(new java.awt.Dimension(250, 158));
        Tic9.setMinimumSize(new java.awt.Dimension(250, 158));
        Tic9.setOpaque(false);
        Tic9.setPreferredSize(new java.awt.Dimension(250, 158));
        Tic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic9ActionPerformed(evt);
            }
        });

        Tic3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Tic3.setMaximumSize(new java.awt.Dimension(250, 158));
        Tic3.setMinimumSize(new java.awt.Dimension(250, 158));
        Tic3.setOpaque(false);
        Tic3.setPreferredSize(new java.awt.Dimension(250, 158));
        Tic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tic3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tic4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tic7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Tic8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tic9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Tic2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tic3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Tic5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tic6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Tic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Tic4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tic2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tic3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tic5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tic6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tic7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tic8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tic9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic8ActionPerformed
if (Tic8.getText().equals("")) {
Tic8.setText(gameStart);
choosePlayer();  // Switch to the next player
gameWin();       // Check for a win
}
    }//GEN-LAST:event_Tic8ActionPerformed

    private void Tic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic6ActionPerformed
if (Tic6.getText().equals("")) {
Tic6.setText(gameStart);
choosePlayer();  // Switch to the next player
gameWin();       // Check for a win
}
    }//GEN-LAST:event_Tic6ActionPerformed

    private void Tic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic2ActionPerformed
if (Tic2.getText().equals("")) {
Tic2.setText(gameStart);
choosePlayer();  // Switch to the next player
gameWin();       // Check for a win
}
    }//GEN-LAST:event_Tic2ActionPerformed

    private void Tic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic5ActionPerformed
if (Tic5.getText().equals("")) {
Tic5.setText(gameStart);
choosePlayer();  // Switch to the next player
gameWin();       // Check for a win
}
    }//GEN-LAST:event_Tic5ActionPerformed

    private void Tic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic1ActionPerformed
if (Tic1.getText().equals("")) {
Tic1.setText(gameStart);
choosePlayer();  // Switch to the next player
gameWin();       // Check for a win
}
    }//GEN-LAST:event_Tic1ActionPerformed

    private void Tic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic4ActionPerformed
if (Tic4.getText().equals("")) {
Tic4.setText(gameStart);
choosePlayer();  // Switch to the next player
gameWin();       // Check for a win
}
    }//GEN-LAST:event_Tic4ActionPerformed

    private void Tic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic7ActionPerformed
if (Tic7.getText().equals("")) {
Tic7.setText(gameStart);
choosePlayer();  // Switch to the next player
gameWin();       // Check for a win
}
    }//GEN-LAST:event_Tic7ActionPerformed

    private void Tic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic9ActionPerformed
if (Tic9.getText().equals("")) {
Tic9.setText(gameStart);
choosePlayer();  // Switch to the next player
gameWin();       // Check for a win
}
    }//GEN-LAST:event_Tic9ActionPerformed

    private void Tic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tic3ActionPerformed
if (Tic3.getText().equals("")) {
Tic3.setText(gameStart);
choosePlayer();  // Switch to the next player
gameWin();       // Check for a win
}
    }//GEN-LAST:event_Tic3ActionPerformed

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
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tic1;
    private javax.swing.JButton Tic2;
    private javax.swing.JButton Tic3;
    private javax.swing.JButton Tic4;
    private javax.swing.JButton Tic5;
    private javax.swing.JButton Tic6;
    private javax.swing.JButton Tic7;
    private javax.swing.JButton Tic8;
    private javax.swing.JButton Tic9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
