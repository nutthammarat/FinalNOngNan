/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 59161088
 */
public class GamePage1 extends javax.swing.JFrame {

    /**
     * Creates new form GamePage
     */
    public GamePage1() {
        initComponents();
        userchoose.setVisible(false);
        comchoose.setVisible(false);
    }

    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        funtion1 = new javax.swing.JButton();
        funtion2 = new javax.swing.JButton();
        funtion3 = new javax.swing.JButton();
        userchoose = new javax.swing.JTextField();
        comchoose = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(591, 416));
        getContentPane().setLayout(null);

        jLabel1.setText("เลือกเพื่อเดาใจคอม");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 30, 140, 40);

        jLabel2.setText("ด่านแรก");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 50, 80, 40);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 330, 73, 23);

        funtion1.setBackground(new java.awt.Color(204, 0, 0));
        funtion1.setForeground(new java.awt.Color(204, 0, 0));
        funtion1.setText("Red");
        funtion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funtion1ActionPerformed(evt);
            }
        });
        getContentPane().add(funtion1);
        funtion1.setBounds(100, 150, 130, 70);

        funtion2.setBackground(new java.awt.Color(0, 0, 255));
        funtion2.setForeground(new java.awt.Color(0, 0, 255));
        funtion2.setText("Blue");
        funtion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funtion2ActionPerformed(evt);
            }
        });
        getContentPane().add(funtion2);
        funtion2.setBounds(230, 150, 130, 70);

        funtion3.setBackground(new java.awt.Color(255, 255, 0));
        funtion3.setForeground(new java.awt.Color(255, 255, 0));
        funtion3.setText("Yellow");
        funtion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funtion3ActionPerformed(evt);
            }
        });
        getContentPane().add(funtion3);
        funtion3.setBounds(360, 150, 130, 70);

        userchoose.setEditable(false);
        getContentPane().add(userchoose);
        userchoose.setBounds(30, 40, 120, 30);

        comchoose.setEditable(false);
        getContentPane().add(comchoose);
        comchoose.setBounds(430, 20, 110, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StartPage start = new StartPage();
        dispose();
        start.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void funtion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funtion2ActionPerformed
        GamepageService.getBtn(1);
        GamepageService.setAnswer(2);
        GamepageService.getAnswerStateOne();
    }//GEN-LAST:event_funtion2ActionPerformed

    private void funtion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funtion1ActionPerformed
       GamepageService.getBtn(1);
       GamepageService.setAnswer(1);
       GamepageService.getAnswerStateOne();
    }//GEN-LAST:event_funtion1ActionPerformed

    private void funtion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funtion3ActionPerformed
        GamepageService.getBtn(1);
        GamepageService.setAnswer(3);
        GamepageService.getAnswerStateOne();
    }//GEN-LAST:event_funtion3ActionPerformed

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
            java.util.logging.Logger.getLogger(GamePage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePage1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField comchoose;
    public static javax.swing.JButton funtion1;
    public static javax.swing.JButton funtion2;
    public static javax.swing.JButton funtion3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField userchoose;
    // End of variables declaration//GEN-END:variables
}
