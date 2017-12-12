/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projui;

/**
 *
 * @author karn
 */
public class PlayInterface extends javax.swing.JFrame {

    private RPS rps = new RPS();

    /**
     * Creates new form PlayInterface
     */
    public PlayInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowWin = new javax.swing.JLabel();
        Health = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        scissorsButt = new javax.swing.JButton();
        rockButt = new javax.swing.JButton();
        paperButt1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ShowWin.setFont(new java.awt.Font("AGBenguiatCyr", 1, 33)); // NOI18N
        ShowWin.setText("WIN : 0");
        ShowWin.setDoubleBuffered(true);
        getContentPane().add(ShowWin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 170, 70));

        Health.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Heart03.png"))); // NOI18N
        getContentPane().add(Health, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, 50));

        BackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Door.png"))); // NOI18N
        BackBtn.setBorderPainted(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 50));

        scissorsButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BtnS.png"))); // NOI18N
        scissorsButt.setBorderPainted(false);
        scissorsButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorsButtActionPerformed(evt);
            }
        });
        getContentPane().add(scissorsButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, 120));

        rockButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnR.png"))); // NOI18N
        rockButt.setBorderPainted(false);
        rockButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockButtActionPerformed(evt);
            }
        });
        getContentPane().add(rockButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 120, 130));

        paperButt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BtnP.png"))); // NOI18N
        paperButt1.setBorderPainted(false);
        paperButt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperButt1ActionPerformed(evt);
            }
        });
        getContentPane().add(paperButt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 130, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PlayInterface.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 420));

        setSize(new java.awt.Dimension(650, 442));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rockButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockButtActionPerformed
        rps.choose = "rock";
        System.out.println("you choosing = " + RPS.choose);
        rps.runChoose();
        ShowWin.setText("WIN : " + String.valueOf(RPS.win));
        checkHealth(RPS.health);
        System.out.print(RPS.health);
    }//GEN-LAST:event_rockButtActionPerformed

    private void scissorsButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorsButtActionPerformed
        rps.choose = "scissors";
        System.out.println("you choosing = " + RPS.choose);
        rps.runChoose();
        ShowWin.setText("WIN : " + String.valueOf(RPS.win));
        checkHealth(RPS.health);
        System.out.print(RPS.health);

    }//GEN-LAST:event_scissorsButtActionPerformed

    private void paperButt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperButt1ActionPerformed
        rps.choose = "paper";
        System.out.println("you choosing = " + RPS.choose);
        rps.runChoose();
        ShowWin.setText("WIN : " + String.valueOf(RPS.win));
        checkHealth(RPS.health);
        System.out.print(RPS.health);
    }//GEN-LAST:event_paperButt1ActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        SelectTwo Selecttwo = new SelectTwo();
        Selecttwo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void checkHealth(int health) {
        switch (health) {
            case 0:
                Health.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Heart00.png")));
                LosePage lose = new LosePage();
                lose.setVisible(true);
                this.dispose();
                break;
            case 1:
                Health.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Heart01 .png")));
                break;
            case 2:
                Health.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Heart02.png")));
                break;
            case 3:
                Health.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Heart03.png")));
                break;
        }
    }

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
            java.util.logging.Logger.getLogger(PlayInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel Health;
    private javax.swing.JLabel ShowWin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton paperButt1;
    private javax.swing.JButton rockButt;
    private javax.swing.JButton scissorsButt;
    // End of variables declaration//GEN-END:variables
}
