/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.collegemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
//import net.proteanit.sql.DbUtils;

public class Edits extends javax.swing.JFrame{
 Connection con;
    ResultSet rs;
    Statement stmt1;
    PreparedStatement preStatement;
    int test=0;
    /**
     * Creates new form Edits
     */
    public Edits() {
        initComponents();
        Field1.setVisible(false);
        Field2.setVisible(false);
        Field3.setVisible(false);
        Field4.setVisible(false);
        Field5.setVisible(false);
        Field6.setVisible(false);
        Field7.setVisible(false);
        Field8.setVisible(false);
        Field9.setVisible(false);
        Field10.setVisible(false);
        Var1.setText("");
        Var2.setText("");
        Var3.setText("");
        Var4.setText("");
        Var5.setText("");
        Var6.setText("");
        Var7.setText("");
        Var8.setText("");
        Var9.setText("");
        Var10.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TButton = new javax.swing.JRadioButton();
        SButton = new javax.swing.JRadioButton();
        HButton = new javax.swing.JRadioButton();
        CButton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Field1 = new javax.swing.JTextField();
        Field2 = new javax.swing.JTextField();
        Field3 = new javax.swing.JTextField();
        Field4 = new javax.swing.JTextField();
        Field6 = new javax.swing.JTextField();
        Field7 = new javax.swing.JTextField();
        Field8 = new javax.swing.JTextField();
        Var1 = new javax.swing.JLabel();
        Var2 = new javax.swing.JLabel();
        Var3 = new javax.swing.JLabel();
        Var4 = new javax.swing.JLabel();
        Var6 = new javax.swing.JLabel();
        Var7 = new javax.swing.JLabel();
        Var8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Var9 = new javax.swing.JLabel();
        Field9 = new javax.swing.JTextField();
        SubButton = new javax.swing.JRadioButton();
        DButton = new javax.swing.JRadioButton();
        Var10 = new javax.swing.JLabel();
        Field10 = new javax.swing.JTextField();
        Var5 = new javax.swing.JLabel();
        Field5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 875, 550));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(TButton);
        TButton.setText("Teacher");
        TButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 57, -1, -1));

        buttonGroup1.add(SButton);
        SButton.setText("Student");
        SButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 57, -1, -1));

        buttonGroup1.add(HButton);
        HButton.setText("HOD");
        HButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 57, -1, -1));

        buttonGroup1.add(CButton);
        CButton.setText("Course");
        CButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 57, -1, -1));

        jLabel2.setText("What you want to add?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 61, -1, -1));

        Field1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 185, 117, -1));

        Field2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 223, 117, -1));

        Field3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 261, 117, -1));

        Field4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Field4, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 299, 196, -1));

        Field6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Field6, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 185, 117, -1));

        Field7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Field7, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 223, 117, -1));

        Field8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Field8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field8ActionPerformed(evt);
            }
        });
        getContentPane().add(Field8, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 261, 117, -1));

        Var1.setText("Pid");
        Var1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Var1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 188, -1, -1));

        Var2.setText("Pname");
        Var2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Var2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 226, -1, -1));

        Var3.setText("Pno");
        Var3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Var3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 264, -1, -1));

        Var4.setText("Pemail");
        Var4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Var4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 302, -1, -1));

        Var6.setText("Pdob");
        getContentPane().add(Var6, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 188, -1, -1));

        Var7.setText("Tload");
        getContentPane().add(Var7, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 226, -1, -1));

        Var8.setText("Dno");
        getContentPane().add(Var8, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 264, -1, -1));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 375, 97, -1));

        Var9.setText("Cid");
        Var9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Var9, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 302, 26, -1));

        Field9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Field9, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 299, 117, -1));

        buttonGroup1.add(SubButton);
        SubButton.setText("Subject");
        SubButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SubButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 57, -1, -1));

        buttonGroup1.add(DButton);
        DButton.setText("Department");
        DButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 98, -1, -1));

        Var10.setText("Esal");
        Var10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Var10, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 340, -1, -1));

        Field10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Field10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field10ActionPerformed(evt);
            }
        });
        getContentPane().add(Field10, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 337, 117, -1));

        Var5.setText("DOJ");
        Var5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Var5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 340, -1, -1));

        Field5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Field5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field5ActionPerformed(evt);
            }
        });
        getContentPane().add(Field5, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 337, 117, -1));

        jLabel7.setText("Fill in the details");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 132, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 451, 100, 33));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 98, 128, 23));
    }// </editor-fold>//GEN-END:initComponents

        private void dbConnect() throws ClassNotFoundException, SQLException{
        String dbusername = "cms";
        String dbpassword = "vsa123";
        String dburl = "jdbc:oracle:thin:@localhost:1521:XE";
        Class.forName("oracle.jdbc.OracleDriver");  
        con=DriverManager.getConnection(dburl, dbusername, dbpassword);  
        
    }
    private void TButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TButtonActionPerformed
        // TODO add your handling code here:
        Field1.setVisible(true);
        Field2.setVisible(true);
        Field3.setVisible(true);
        Field4.setVisible(true);
        Field5.setVisible(true);
        Field6.setVisible(true);
        Field7.setVisible(true);
        Field8.setVisible(true);
        Field9.setVisible(true);
        Field10.setVisible(false);
        Var1.setText("Pid");
        Var2.setText("Pname");
        Var3.setText("Pno");
        Var4.setText("Pemail");
        Var5.setText("PDOB");
        Var6.setText("Tload");
        Var7.setText("Dno");
        Var8.setText("Esal");        
        Var9.setText("DOJ");
        Var10.setText("");
    }//GEN-LAST:event_TButtonActionPerformed

    private void SButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SButtonActionPerformed
        // TODO add your handling code here:
 Field1.setVisible(true);
        Field2.setVisible(true);
        Field3.setVisible(true);
        Field4.setVisible(true);
        Field5.setVisible(true);
        Field6.setVisible(true);
        Field7.setVisible(true);
        Field8.setVisible(true);
        Field9.setVisible(false);
        Field10.setVisible(false);
        Var1.setText("Pid");
        Var2.setText("Pname");
        Var3.setText("Pno");
        Var4.setText("Pemail");
        Var5.setText("PDOB");
        Var6.setText("EnrollKey");
        Var7.setText("Cid");
        Var8.setText("Dno");
        Var9.setText("");
        Var10.setText("");
    }//GEN-LAST:event_SButtonActionPerformed

    private void HButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HButtonActionPerformed
        // TODO add your handling code here:
 Field1.setVisible(true);
        Field2.setVisible(true);
        Field3.setVisible(true);
        Field4.setVisible(true);
        Field5.setVisible(true);
        Field6.setVisible(true);
        Field7.setVisible(true);
        Field8.setVisible(true);
        Field9.setVisible(true);
        Field10.setVisible(false);
        Var1.setText("Pid");
        Var2.setText("Pname");
        Var3.setText("Pno");
        Var4.setText("Pemail");
        Var5.setText("PDOB");
        Var6.setText("StartDate");
        Var7.setText("Dno");
        Var8.setText("Esal");
        Var9.setText("DOJ");
        Var10.setText(null);
    }//GEN-LAST:event_HButtonActionPerformed

    private void Field5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field5ActionPerformed

    private void Field10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field10ActionPerformed

    private void CButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CButtonActionPerformed
        // TODO add your handling code here:
        Field1.setVisible(true);
        Field2.setVisible(true);
        Field3.setVisible(true);
        Field4.setVisible(false);
        Field5.setVisible(false);
        Field6.setVisible(false);
        Field7.setVisible(false);
        Field8.setVisible(false);
        Field9.setVisible(false);
        Field10.setVisible(false);
        Var1.setText("Cid");
        Var2.setText("Cname");
        Var3.setText("Dno");
        Var4.setText("");
        Var5.setText(null);
        Var6.setText("");
        Var7.setText(null);
        Var8.setText(null);
        Var9.setText(null);
        Var10.setText("");
    }//GEN-LAST:event_CButtonActionPerformed

    private void SubButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubButtonActionPerformed
        // TODO add your handling code here:
        Field1.setVisible(true);
        Field2.setVisible(true);
        Field3.setVisible(true);
        Field4.setVisible(false);
        Field5.setVisible(false);
        Field6.setVisible(false);
        Field7.setVisible(false);
        Field8.setVisible(false);
        Field9.setVisible(false);
        Field10.setVisible(false);
        Var1.setText("Subid");
        Var2.setText("Subname");
        Var3.setText("Pid");
        Var4.setText("");
        Var5.setText(null);
        Var6.setText("");
        Var7.setText(null);
        Var8.setText(null);
        Var9.setText(null);
        Var10.setText("");
    }//GEN-LAST:event_SubButtonActionPerformed

    private void DButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DButtonActionPerformed
        // TODO add your handling code here:
        Field1.setVisible(true);
        Field2.setVisible(true);
        Field3.setVisible(false);
        Field4.setVisible(false);
        Field5.setVisible(false);
        Field6.setVisible(false);
        Field7.setVisible(false);
        Field8.setVisible(false);
        Field9.setVisible(false);
        Field10.setVisible(false);
        Var1.setText("Dno");
        Var2.setText("Dname");
        Var3.setText("");
        Var4.setText("");
        Var5.setText(null);
        Var6.setText("");
        Var7.setText(null);
        Var8.setText(null);
        Var9.setText(null);
        Var10.setText("");
    }//GEN-LAST:event_DButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        EditingPage ep = new EditingPage();
        this.dispose();
        ep.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(TButton.isSelected()){
            try{
                dbConnect();
                
               String sql="Insert into Teacher values(?,?,?)";
                preStatement = con.prepareStatement(sql);
                preStatement.setString(1,Field1.getText());
                preStatement.setString(2,Field6.getText());
                preStatement.setString(3,Field7.getText());
                //preStatement.executeQuery();
                preStatement.executeUpdate();
                String sql2="Insert into Person values(?,?,?,?,?)";
                preStatement = con.prepareStatement(sql2);
                preStatement.setString(1,Field1.getText());
                preStatement.setString(2,Field2.getText());
                preStatement.setString(3,Field3.getText());
                preStatement.setString(4,Field4.getText());
                preStatement.setString(5,Field5.getText());
               // preStatement.executeQuery();
                preStatement.executeUpdate();
                String sql3="Insert into Employee values(?,?,?)";
                preStatement = con.prepareStatement(sql3);
                preStatement.setString(1,Field1.getText());
                preStatement.setString(2,Field8.getText());
                preStatement.setString(3,Field9.getText());
                //preStatement.executeQuery();
                preStatement.executeUpdate();
                preStatement.close();
                con.close();
                test=1;
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
            if(test==1){
                JOptionPane.showMessageDialog(this, "Record Added!");
                test=0;
            }
        }
        else if(SButton.isSelected()){
        try{
                dbConnect();
                String sql="Insert into Student values(?,?,?,?)";
                preStatement = con.prepareStatement(sql);
                preStatement.setString(1,Field1.getText());
                preStatement.setString(2,Field6.getText());
                preStatement.setString(3,Field7.getText());
                preStatement.setString(4,Field8.getText());
                //preStatement.executeQuery();
                preStatement.executeUpdate();
                preStatement.close();
                con.close();
                test=1;
            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(this, ex);
            }
            if(test==1){
                JOptionPane.showMessageDialog(this, "Record Added!");
                test=0;
            }
        try{
                dbConnect();
                String sql2="Insert into Person values(?,?,?,?,?)";
                preStatement = con.prepareStatement(sql2);
                preStatement.setString(1,Field1.getText());
                preStatement.setString(2,Field2.getText());
                preStatement.setString(3,Field3.getText());
                preStatement.setString(4,Field4.getText());
                preStatement.setString(5,Field5.getText());
                //preStatement.executeQuery();
                preStatement.executeUpdate();
                preStatement.close();
                con.close();
                test=1;
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
                    if(test==1){
                JOptionPane.showMessageDialog(this, "Record Added!");
                test=0;
            }
        
        }
        else if(HButton.isSelected()){
        try{
                dbConnect();
                
                String sql="Insert into HOD values(?,?,?)";
                preStatement = con.prepareStatement(sql);
                preStatement.setString(1,Field1.getText());
                preStatement.setString(2,Field6.getText());
                preStatement.setString(3,Field7.getText());
                preStatement.executeUpdate();
                String sql2="Insert into Person values(?,?,?,?,?)";
                preStatement = con.prepareStatement(sql2);
                preStatement.setString(1,Field1.getText());
                preStatement.setString(2,Field2.getText());
                preStatement.setString(3,Field3.getText());
                preStatement.setString(4,Field4.getText()); 
                preStatement.setString(5,Field5.getText());
                preStatement.executeUpdate();
                String sql3="Insert into Employee values(?,?,?)";
                preStatement = con.prepareStatement(sql3);
                preStatement.setString(1,Field1.getText());
                preStatement.setString(2,Field8.getText());
                preStatement.setString(3,Field9.getText());
                preStatement.executeUpdate();
                preStatement.close();
                con.close();
                test=1;
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
                    if(test==1){
                JOptionPane.showMessageDialog(this, "Record Added!");
                test=0;
            }
        }
        else if(CButton.isSelected()){
        try{
                dbConnect();  
                String sql="Insert into Courses values (?,?,?)";
                preStatement = con.prepareStatement(sql);
                preStatement.setString(1,Field1.getText());
                preStatement.setString(2,Field2.getText());
                preStatement.setString(3,Field3.getText());
                preStatement.executeQuery();
                preStatement.close();
                con.close();
                test=1;
        }
        catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
        }
                    if(test==1){
                JOptionPane.showMessageDialog(this, "Record Added!");
                test=0;
            }       
            
    }
    else if(SubButton.isSelected()){
        try{
            dbConnect();  
            String sql="Insert into Subject values(?,?,?)";
            preStatement = con.prepareStatement(sql);
            preStatement.setString(1,Field1.getText());
            preStatement.setString(2,Field2.getText());
            preStatement.setString(3,Field3.getText());
            preStatement.executeQuery();
            preStatement.close();
            con.close();
            test=1;
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
                    if(test==1){
                JOptionPane.showMessageDialog(this, "Record Added!");
                test=0;
            }
    }
    else if(DButton.isSelected()){
        try{
            dbConnect();  
            String sql="Insert into Department values (?,?)";
            preStatement = con.prepareStatement(sql);
            preStatement.setString(1,Field1.getText());
            preStatement.setString(2,Field2.getText());
            preStatement.executeQuery();
            preStatement.close();
            con.close();
            test=1;
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
                    }
                    if(test==1){
                JOptionPane.showMessageDialog(this, "Record Added!");
                test=0;
            }
    }
    else{
        jLabel1.setText("Select an option!");
    }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Field8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field8ActionPerformed

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
            java.util.logging.Logger.getLogger(EditingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CButton;
    private javax.swing.JRadioButton DButton;
    private javax.swing.JTextField Field1;
    private javax.swing.JTextField Field10;
    private javax.swing.JTextField Field2;
    private javax.swing.JTextField Field3;
    private javax.swing.JTextField Field4;
    private javax.swing.JTextField Field5;
    private javax.swing.JTextField Field6;
    private javax.swing.JTextField Field7;
    private javax.swing.JTextField Field8;
    private javax.swing.JTextField Field9;
    private javax.swing.JRadioButton HButton;
    private javax.swing.JRadioButton SButton;
    private javax.swing.JRadioButton SubButton;
    private javax.swing.JRadioButton TButton;
    private javax.swing.JLabel Var1;
    private javax.swing.JLabel Var10;
    private javax.swing.JLabel Var2;
    private javax.swing.JLabel Var3;
    private javax.swing.JLabel Var4;
    private javax.swing.JLabel Var5;
    private javax.swing.JLabel Var6;
    private javax.swing.JLabel Var7;
    private javax.swing.JLabel Var8;
    private javax.swing.JLabel Var9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
