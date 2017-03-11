package my.collegemanagementsystem;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
//import oracle.jdbc.OraclePreparedStatement;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
public class Display extends javax.swing.JFrame {
    int identity;
    String Query="";
    Connection con = null;
    //OraclePreparedStatement pst = null;
    ResultSet rs;
    String sql=null;
    Statement stmt1;
    PreparedStatement preStatement;
    int quantity;
    String total_cost;
    
    /**
     * Creates new form Display
     */
    private void dbConnect() throws ClassNotFoundException, SQLException{
        String dbusername = "cms";
        String dbpassword = "vsa123";
        String dburl = "jdbc:oracle:thin:@localhost:1521:XE";
        Class.forName("oracle.jdbc.OracleDriver");  
        con=DriverManager.getConnection(dburl, dbusername, dbpassword);  
        
    }
       
     private void dbClose() throws SQLException {
        rs.close();
        stmt1.close();
        con.close();
    }
    public Display() {
        initComponents();
    }
    public Display(int i){
        initComponents();
        identity=i;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Edit or.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ViewTable);

        jButton2.setText("Click here to Display");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(255, 255, 255)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 319, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InfoView iv= new InfoView();
        this.dispose();
        iv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       try{
           fillItUp();
       }catch(Exception e){
           
       }
    }//GEN-LAST:event_jButton2ActionPerformed
    private void fillItUp() throws ClassNotFoundException, SQLException{
        dbConnect();
        String sl="";
        if(identity==1){
        sl="Select * from Student";
        }else if(identity==2){
            sl="Select * from Teacher where Pid in(select pid from teacher)";
        }else if(identity==3){
            sl="Select * from HOD";
        }
        else if(identity==4){
            sl="Select * from Courses";
        }
        else if(identity==5){
            sl="Select * from Subject";
        }
        else if(identity==6){
            sl= "Select * from Department";
        }
        try{       
            dbConnect();
            DefaultTableModel dtm = (DefaultTableModel)ViewTable.getModel();
            stmt1= con.createStatement();
            rs = stmt1.executeQuery(sl);
            //rs.next();
            ViewTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
        dbClose();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Display().setVisible(true);
                    DBconnect dbc = new DBconnect();
                }
        }    );
            
    }
    

                
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ViewTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
