/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports_Project;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */

public class Infrastructure extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel();

    /**
     * Creates new form Infrastructure
     */
    public Infrastructure() {
        this.setResizable(false);
        initComponents();
        //Toolkit tk=Toolkit.getDefaultToolkit();
             int xsize=984;
             int ysize=943;
             this.setSize(xsize,ysize);
    
    
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/my_connection?zeroDateTimeBehavior=convertToNull","root","");
            String query="select * from infrastructure";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            dtm.addColumn("Infrastructure_id");
            dtm.addColumn("Name");
            dtm.addColumn("Cost");
            dtm.addColumn("Type");
            dtm.addColumn("Quantity");
            while(rs.next()){
                Object[] u1={rs.getString("Infrastructure_id"),rs.getString("Name"),rs.getInt("Cost"),rs.getString("Type"),rs.getInt("Quantity")};
                dtm.addRow(u1);
            }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error"+ex); 
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        cost = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("     INFRASTRUCTURE WINDOW");
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 51, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Academy Infrastructure :-");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(17, 104, 552, 78);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(625, 123, 89, 31);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("LOGOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(807, 123, 123, 31);

        jButton4.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        jButton4.setText("ADD INFRASTRUCTURE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(49, 757, 415, 53);

        jButton5.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        jButton5.setText("REMOVE INFRASTRUCTURE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(482, 757, 415, 53);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("      HYDRA SPORTS ACADEMY");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(5, 5, 925, 92);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1.setModel(dtm);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(44, 189, 886, 224);

        jButton6.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        jButton6.setText("UPDATE INFRASTRUCTURE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(264, 823, 415, 53);

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel10.setText("ENTER INFRASTRUCTURE NAME           :");
        jLabel10.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel10ComponentHidden(evt);
            }
        });
        jPanel2.add(jLabel10);
        jLabel10.setBounds(44, 495, 448, 51);

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel11.setText("ENTER INFRASTRUCTURE COST             :");
        jLabel11.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel11ComponentHidden(evt);
            }
        });
        jPanel2.add(jLabel11);
        jLabel11.setBounds(44, 558, 448, 51);

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel12.setText("ENTER INFRASTRUCTURE TYPE              :");
        jLabel12.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel12ComponentHidden(evt);
            }
        });
        jPanel2.add(jLabel12);
        jLabel12.setBounds(44, 621, 447, 51);

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel13.setText("ENTER INFRASTRUCTURE QUANTITY   :");
        jLabel13.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel13ComponentHidden(evt);
            }
        });
        jPanel2.add(jLabel13);
        jLabel13.setBounds(42, 684, 449, 51);

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel14.setText("ENTER INFRASTRUCTURE ID                   :");
        jLabel14.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel14ComponentHidden(evt);
            }
        });
        jPanel2.add(jLabel14);
        jLabel14.setBounds(44, 432, 448, 51);

        name.setBackground(new java.awt.Color(108, 122, 137));
        name.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(228, 241, 254));
        jPanel2.add(name);
        name.setBounds(497, 494, 402, 56);

        cost.setBackground(new java.awt.Color(108, 122, 137));
        cost.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cost.setForeground(new java.awt.Color(228, 241, 254));
        jPanel2.add(cost);
        cost.setBounds(497, 557, 402, 56);

        type.setBackground(new java.awt.Color(108, 122, 137));
        type.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        type.setForeground(new java.awt.Color(228, 241, 254));
        jPanel2.add(type);
        type.setBounds(496, 620, 402, 56);

        quantity.setBackground(new java.awt.Color(108, 122, 137));
        quantity.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        quantity.setForeground(new java.awt.Color(228, 241, 254));
        jPanel2.add(quantity);
        quantity.setBounds(496, 683, 402, 56);

        id.setBackground(new java.awt.Color(108, 122, 137));
        id.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(228, 241, 254));
        jPanel2.add(id);
        id.setBounds(497, 431, 402, 56);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Project images\\116.jpg")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 10, 940, 870);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 10, 960, 890);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Sports_System SS=new Sports_System();
    SS.setVisible(true);
    SS.pack();
    SS.setLocationRelativeTo(null);
    Toolkit tk=Toolkit.getDefaultToolkit();
            int xsize=947;
            int ysize=707;
            SS.setSize(xsize,ysize);
    SS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Login_page rgf=new Login_page();
    rgf.setVisible(true);
    rgf.pack();
    rgf.setLocationRelativeTo(null);
    rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String Infrastructure_id =id.getText();
        String Name=name.getText();
        String Cost=cost.getText();
        String Type=type.getText();
        String Quantity=quantity.getText();
        if(Infrastructure_id.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Sponsor Id");
        }
        else if(Name.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Sponsor Name");
        }
        else if(Cost.equals("")){
            JOptionPane.showMessageDialog(null,"Enter your Email");
        }
        else if(Type.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Contarct Time");
        }
        else if(Quantity.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Team Name");
        }
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/my_connection?zeroDateTimeBehavior=convertToNull","root","");
            ResultSet rs=null;
            int candidateId=0;
            String query="INSERT INTO infrastructure values('"+Infrastructure_id+"','"+Name+"','"+Cost+"','"+Type+"','"+Quantity+"')";
            Statement st=con.createStatement();
            int rowAffected=st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,rowAffected+"New Sponsor Added");
            id.setText(" ");
            name.setText(" ");
            cost.setText(" ");
            type.setText(" ");
            quantity.setText(" ");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error"+ex); 
        }                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel10ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel10ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10ComponentHidden

    private void jLabel11ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel11ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11ComponentHidden

    private void jLabel12ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel12ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12ComponentHidden

    private void jLabel13ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel13ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13ComponentHidden

    private void jLabel14ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel14ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14ComponentHidden

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          String Infrastructure_id =id.getText();
        String Name=name.getText();
        String Cost=cost.getText();
        String Type=type.getText();
        String Quantity=quantity.getText();
        if(Infrastructure_id.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Sponsor Id");
        }
        else if(Name.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Sponsor Name");
        }
        else if(Cost.equals("")){
            JOptionPane.showMessageDialog(null,"Enter your Email");
        }
        else if(Type.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Contarct Time");
        }
        else if(Quantity.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Team Name");
        }
        try{            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/my_connection?zeroDateTimeBehavior=convertToNull","root","");
            ResultSet rs=null;
            int candidateId=0;
            String query="DELETE from infrastructure values(Infrastructure_id='"+Infrastructure_id+"')";
            Statement st=con.createStatement();
            int rowAffected=st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,rowAffected+"New Sponsor Added");
            id.setText(" ");
            name.setText(" ");
            cost.setText(" ");
            type.setText(" ");
            quantity.setText(" ");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error"+ex); 
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Infrastructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Infrastructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Infrastructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Infrastructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Infrastructure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cost;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
