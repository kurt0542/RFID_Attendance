package GUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sharon
 */
import DBConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class teacher_register extends javax.swing.JFrame {

    Connection con;
    Statement st;
    public teacher_register() {
        con = new DatabaseConnection().connectDB();
        try{
            st = con.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
        initComponents();
        setLocationRelativeTo(null);
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        s1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        s2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        s3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        s4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        s5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        s6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        s7 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        s8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        s9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        s10 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        s11 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        s13 = new javax.swing.JPasswordField();
        s12 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        date = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("REGISTRATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(443, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Password:");

        jLabel11.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Employee ID:");

        s1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel10.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Advisory:");

        s2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel13.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("First Name:");

        s3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel14.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Middle Name:");

        s4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel20.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Last Name:");

        s5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel8.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contanct Number:");

        s6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Birth Date:");

        jLabel21.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Address:");

        s7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Email:");

        s8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel18.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Parent guardian name:");

        s9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel9.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Parent's Contact Number:");

        s10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Username:");

        s11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel17.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Confirm password:");

        s13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        s12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(51, 153, 255));
        button1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("DONE");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(153, 153, 153)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addGap(105, 105, 105)
                                            .addComponent(jLabel14))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(s5)))
                            .addComponent(s11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(s12, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addComponent(s13)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(date)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 560, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new RegistrationSelection().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // Done button here
    String employ, add, fname, mname, lname, cnumber, bdate, address, email, pcnumber, gname, uname, upass, cpass;

    if (s1.getText().isEmpty() || s2.getText().isEmpty() || s3.getText().isEmpty() ||
        s4.getText().isEmpty() || s5.getText().isEmpty() || s6.getText().isEmpty() ||
        date.getText().isEmpty() || s7.getText().isEmpty() || s8.getText().isEmpty() ||
        s9.getText().isEmpty() || s10.getText().isEmpty() || s11.getText().isEmpty() ||
        s12.getText().isEmpty() || s13.getText().isEmpty()) {

        JOptionPane.showMessageDialog(new JFrame(), "Please fill in all fields!", "Incomplete Form", JOptionPane.WARNING_MESSAGE);
        return;
    }

    employ = s1.getText();
    add = s2.getText();
    fname = s3.getText();
    mname = s4.getText();
    lname = s5.getText();
    cnumber = s6.getText();
    bdate = date.getText();
    address = s7.getText();
    email = s8.getText();
    gname = s9.getText();
    pcnumber = s10.getText();
    uname = s11.getText();
    upass = String.valueOf(s12.getPassword());
    cpass = String.valueOf(s13.getPassword());

    if (!upass.equals(cpass)) {
        JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check for duplicate username in all 3 tables
    String checkQuery = "SELECT accUname FROM accountdetails WHERE accUname = ? " +
                        "UNION SELECT accUname FROM teacher_register WHERE accUname = ? " +
                        "UNION SELECT accUname FROM irregular_register WHERE accUname = ?";

    try (PreparedStatement pst = con.prepareStatement(checkQuery)) {
        pst.setString(1, uname);
        pst.setString(2, uname);
        pst.setString(3, uname);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "Username already exists. Please choose a different one.", "Duplicate Username", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error checking username uniqueness.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
        JTextField rfidField = new JTextField();
    int rfidOption = JOptionPane.showConfirmDialog(
        null,
        new Object[] { "Please scan or enter RFID:", rfidField },
        "Register RFID",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.PLAIN_MESSAGE
    );

    if (rfidOption != JOptionPane.OK_OPTION || rfidField.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "RFID registration cancelled or empty.", "Cancelled", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String rfid = rfidField.getText().trim();

    if (!rfid.matches("\\d{10}")) {
        JOptionPane.showMessageDialog(null, "Invalid RFID format. It must be exactly 10 digits.", "Invalid RFID", JOptionPane.ERROR_MESSAGE);
        return;
    }


    // Proceed with registration
    String queryRegister = "INSERT INTO teacher_register(accID, accAdvisory,accRFID accFname, accMname, accLname, accNumber, accBdate, accAdd, accMail, accPname, accPn, accUname, accPass, accCpass, role) " +
            "VALUES('" + employ + "','" + add + "','" + rfid + "','" + fname + "','" + mname + "','" + lname + "','" + 
            cnumber + "','" + bdate + "','" + address + "','" + email + "','" + gname + "','" + pcnumber + "','" + 
            uname + "','" + upass + "','" + cpass + "','teacher')";

    try {
        st.execute(queryRegister);
        JOptionPane.showMessageDialog(new JFrame(), "Data added Successfully!");

        s1.setText(""); s2.setText(""); s3.setText(""); s4.setText(""); s5.setText("");
        s6.setText(""); date.setText(""); s7.setText(""); s8.setText(""); s9.setText("");
        s10.setText(""); s11.setText(""); s12.setText(""); s13.setText("");

        this.dispose();
        new LoginPage().setVisible(true);
        SwingUtilities.getWindowAncestor(s1).dispose();

    } catch (SQLException ex) {
        Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Registration failed.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(teacher_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacher_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacher_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacher_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacher_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s10;
    private javax.swing.JTextField s11;
    private javax.swing.JPasswordField s12;
    private javax.swing.JPasswordField s13;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JTextField s6;
    private javax.swing.JTextField s7;
    private javax.swing.JTextField s8;
    private javax.swing.JTextField s9;
    // End of variables declaration//GEN-END:variables
}
