/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPage;

import Config.config;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Raven
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
    }

    public static String emails, usernames;
    
    public boolean duplicateChecker(){
        config conf = new config();
        try{
            String query = "SELECT * FROM users WHERE uname = '"+uname.getText()+"' OR email = '"+email.getText()+"'";
            ResultSet resultSet = conf.getData(query);
            
            if(resultSet.next()){
                emails = resultSet.getString("email");
                if(emails.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already Used!");
                    email.setText(null);
                }
                usernames = resultSet.getString("uname");
                if(usernames.equals(uname.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already Used!");
                    uname.setText(null);
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
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

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        utype = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        lname = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        pconfirm = new javax.swing.JPasswordField();
        pname = new javax.swing.JPasswordField();
        Back = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(51, 255, 51));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 102)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(51, 255, 51));
        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Clinic Management Registration");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 620, 40));

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

        jPanel11.setBackground(new java.awt.Color(255, 0, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mjgwapo.png"))); // NOI18N
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 110, 170));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 110, 320));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Contact #:");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 90, -1));

        jLabel12.setBackground(new java.awt.Color(51, 255, 51));
        jLabel12.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Registration Page");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 560, 70));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Last Name:");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 90, -1));

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Gender:");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 90, -1));

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("User Type:");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 90, -1));
        jPanel9.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 160, -1));
        jPanel9.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 160, -1));

        utype.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        utype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utypeActionPerformed(evt);
            }
        });
        jPanel9.add(utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 160, -1));

        gender.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        gender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel9.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 160, -1));
        jPanel9.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 160, -1));

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("First Name:");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 90, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Username:");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 90, -1));

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Password:");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 90, -1));
        jPanel9.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 160, -1));

        pconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pconfirmActionPerformed(evt);
            }
        });
        jPanel9.add(pconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 160, -1));

        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        jPanel9.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 160, -1));

        Back.setBackground(new java.awt.Color(0, 255, 255));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel9.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 80, -1));

        jButton5.setBackground(new java.awt.Color(0, 255, 255));
        jButton5.setText("Register");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 80, -1));

        jLabel36.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Confirm Pass:");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 90, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Email:");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 90, -1));
        jPanel9.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void utypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utypeActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void pconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pconfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pconfirmActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(fname.getText().isEmpty()
            || lname.getText().isEmpty()
            || email.getText().isEmpty()
            || uname.getText().isEmpty()
            || pname.getText().isEmpty()
            || contact.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Required!");
        }else if(pname.getText().length()<8){
            JOptionPane.showMessageDialog(null, "Password Must be longer than 8!");
        }else if(!(pname.getText().equals(pconfirm.getText()))){
            JOptionPane.showMessageDialog(null, "Password does not much!");
        }else if(duplicateChecker()){
            System.out.println("Duplicate Exist!");
        }else{
            config conf = new config();
            if(conf.insertData("INSERT INTO users (fname, lname, gender, account_type, email, uname, pname, contact, status) "
                + "VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+gender.getSelectedItem()+"'"
                + ", '"+utype.getSelectedItem()+"', '"+email.getText()+"', '"+uname.getText()+"'"
                + ", '"+pname.getText()+"', '"+contact.getText()+"', 'Pending')")==1){
            JOptionPane.showMessageDialog(null, "Registered Successfully!");
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField pconfirm;
    private javax.swing.JPasswordField pname;
    private javax.swing.JTextField uname;
    private javax.swing.JComboBox<String> utype;
    // End of variables declaration//GEN-END:variables
}
