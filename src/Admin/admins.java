/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin;

import Config.Session;
import LoginPage.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author Raven
 */
public class admins extends javax.swing.JFrame {

    /** Creates new form User */
    public admins() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        header14 = new javax.swing.JPanel();
        Acc_lname = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Acc_fname = new javax.swing.JLabel();
        AUsers = new javax.swing.JLabel();
        header6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 0, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(51, 255, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 102)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Clinic Management Admin Dashboard");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 610, 40));

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("X");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 40, 40));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 60));

        jPanel11.setBackground(new java.awt.Color(255, 255, 102));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, -1));

        header14.setBackground(new java.awt.Color(0,0,0,60));
        header14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Acc_lname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Acc_lname.setForeground(new java.awt.Color(255, 255, 255));
        Acc_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Acc_lname.setText("FirstName");
        Acc_lname.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header14.add(Acc_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 140, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gwwapo-removebg-preview.png"))); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 80));

        Acc_fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Acc_fname.setForeground(new java.awt.Color(255, 255, 255));
        Acc_fname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Acc_fname.setText("Lname");
        Acc_fname.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header14.add(Acc_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 30));

        jPanel11.add(header14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 130));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 330));

        AUsers.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AUsers.setForeground(new java.awt.Color(255, 255, 255));
        AUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AUsers.setText("Users");
        AUsers.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        AUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AUsersMouseClicked(evt);
            }
        });
        jPanel9.add(AUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 140, 60));

        header6.setBackground(new java.awt.Color(102, 102, 255));
        header6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gwwapo-removebg-preview_1.png"))); // NOI18N
        header6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 90));

        jPanel9.add(header6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 140, 110));

        getContentPane().add(jPanel9);
        jPanel9.setBounds(0, 0, 670, 390);

        setSize(new java.awt.Dimension(690, 431));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
           Session ses = Session.getInstance();
       
        
        if (ses.getId()==0){
           JOptionPane.showMessageDialog(null,"No account verefied, Login first!");
           Login lg = new Login();
           lg.setVisible(true);
           this.dispose();
           
        }else{
       Acc_fname.setText(""+ses.getFname());
        Acc_lname.setText(""+ses.getLnmae());
       
        }
        
        
        
    }//GEN-LAST:event_formWindowActivated

    private void AUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AUsersMouseClicked

        usersTable lg = new usersTable();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AUsersMouseClicked

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
            java.util.logging.Logger.getLogger(admins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AUsers;
    private javax.swing.JLabel Acc_fname;
    private javax.swing.JLabel Acc_lname;
    private javax.swing.JPanel header14;
    private javax.swing.JPanel header6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

}
