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

import javax.swing.JOptionPane;

/**
 *
 * @author anjanavelil
 */
public class UpdatePage extends javax.swing.JFrame {

    /**
     * Creates new form UpdatePage
     */
    Connection con;
    ResultSet rs;
    Statement stmt1;
    PreparedStatement preStatement;
    String st="Update ? set ? = ? where ? = ?";
    public UpdatePage() {
        initComponents();
    }
    private void dbConnect() throws ClassNotFoundException, SQLException{
        String dbusername = "cms";
        String dbpassword = "vsa123";
        String dburl = "jdbc:oracle:thin:@localhost:1521:XE";
        Class.forName("oracle.jdbc.OracleDriver");  
        con=DriverManager.getConnection(dburl, dbusername, dbpassword);  
    }
           
private void rem(){
    for(int k=0;k<8;k++){
        Selector2.insertItemAt("",i);
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

        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Selector = new javax.swing.JComboBox();
        Selector2 = new javax.swing.JComboBox();
        Var1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Details");

        jLabel2.setText("Select:");

        Selector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select an option", "Teacher", "HOD", "Student", "Department", "Course", "Subject" }));
        Selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorActionPerformed(evt);
            }
        });

        Selector2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select an Option", " " }));
        Selector2.setVisible(false);

        Var1.setText("Edit");
        Var1.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Var1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Selector2, 0, 175, Short.MAX_VALUE)
                                    .addComponent(Selector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 385, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selector2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Var1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        EditingPage ep = new EditingPage();
        ep.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed
public void per(){
    Selector2.
            Selector2.insertItemAt("Pname", 1);
            Selector2.insertItemAt("Pno", 2);
            Selector2.insertItemAt("Pemail", 3);
            Selector2.insertItemAt("PDOB", 4);
}
    private void SelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorActionPerformed
        // TODO add your handling code here:
        int i= Selector.getSelectedIndex();
        Var1.setVisible(true);
        Selector2.setVisible(true);
        if(i==1){
            Selector2.removeAllItems();
            per();
            Selector2.insertItemAt("Tload", 5);
            Selector2.insertItemAt("Esal", 6);     
            
        }else if(i==2){
              Selector2.removeAllItems();
            per();
            Selector2.insertItemAt("Dno",5);
            
        }else if(i==3){
              Selector2.removeAllItems();
            per();
            Selector2.insertItemAt("Cid",5);
            Selector2.insertItemAt("Dno", 6);
        }else if(i==4){
              Selector2.removeAllItems();
            Selector2.insertItemAt("Dname",1);
        }else if (i==5){
              Selector2.removeAllItems();
            Selector2.insertItemAt("Cname",1);
            
        }else{
              Selector2.removeAllItems();
            Selector2.insertItemAt("Subname",1);
            
        }
        
    }//GEN-LAST:event_SelectorActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox Selector;
    private javax.swing.JComboBox Selector2;
    private javax.swing.JLabel Var1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
