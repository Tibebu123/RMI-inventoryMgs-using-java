
package rmitour.ClientSide;

import rmitour.ClientSide.HomeView;
import java.rmi.Naming;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import rmitour.DatabaseService;

/**
 *
 * @author Tibebu
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        userphone = new javax.swing.JTextField();
        userpassword = new javax.swing.JTextField();
        useraddbtn = new javax.swing.JButton();
        userdeletebtn = new javax.swing.JButton();
        userupdatebtn = new javax.swing.JButton();
        userhomebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory Managment System");

        jLabel2.setBackground(new java.awt.Color(204, 0, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("USER NAME:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("USER PASSWORD:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PHONE:");

        username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        userphone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        userpassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        useraddbtn.setBackground(new java.awt.Color(255, 0, 102));
        useraddbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        useraddbtn.setForeground(new java.awt.Color(255, 255, 255));
        useraddbtn.setText("Add");
        useraddbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                useraddbtnMouseClicked(evt);
            }
        });
        useraddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useraddbtnActionPerformed(evt);
            }
        });

        userdeletebtn.setBackground(new java.awt.Color(255, 0, 102));
        userdeletebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userdeletebtn.setForeground(new java.awt.Color(255, 255, 255));
        userdeletebtn.setText("Delete");
        userdeletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userdeletebtnMouseClicked(evt);
            }
        });

        userupdatebtn.setBackground(new java.awt.Color(255, 0, 102));
        userupdatebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userupdatebtn.setForeground(new java.awt.Color(255, 255, 255));
        userupdatebtn.setText("Update");
        userupdatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userupdatebtnMouseClicked(evt);
            }
        });

        userhomebtn.setBackground(new java.awt.Color(255, 0, 102));
        userhomebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userhomebtn.setForeground(new java.awt.Color(255, 255, 255));
        userhomebtn.setText("Home");
        userhomebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userhomebtnMouseClicked(evt);
            }
        });
        userhomebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userhomebtnActionPerformed(evt);
            }
        });

        usertbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "userName", "Password", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(usertbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(userphone)
                            .addComponent(userpassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(useraddbtn)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userhomebtn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(userupdatebtn)
                                .addGap(39, 39, 39)
                                .addComponent(userdeletebtn)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(userpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(userphone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(useraddbtn)
                            .addComponent(userdeletebtn)
                            .addComponent(userupdatebtn))
                        .addGap(32, 32, 32)
                        .addComponent(userhomebtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useraddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useraddbtnMouseClicked
    try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
           Statement st= (Statement)con.createStatement();
            String userName=username.getText();
            
           String password= userpassword.getText();
          
          int phone=Integer.parseInt(userphone.getText());
           DatabaseService dbi=(DatabaseService)Naming.lookup("rmi://localhost:1099/databaseService");
           String result=dbi.Adduser(userName, password,  phone);
           JOptionPane.showMessageDialog(null, result,"success",JOptionPane.INFORMATION_MESSAGE);
           
           
           
       } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_useraddbtnMouseClicked

    private void userupdatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userupdatebtnMouseClicked
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
           Statement st= (Statement)con.createStatement();
            String userName=username.getText();
           String password=userpassword.getText();
          
           int phone=Integer.parseInt(userphone.getText());
         //  int price=Integer.parseInt(pricefield.getText());
           DatabaseService dbi=(DatabaseService)Naming.lookup("rmi://localhost:1099/databaseService");
           String result=dbi.Updateuser(userName, password,  phone);
           JOptionPane.showMessageDialog(null, result,"success",JOptionPane.INFORMATION_MESSAGE);
           
           
           
       } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_userupdatebtnMouseClicked

    private void userdeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userdeletebtnMouseClicked
    try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
           Statement st= (Statement)con.createStatement();
           String userName=username.getText();;
           
           //String name=namefield.getText();
           //int quantity=Integer.parseInt(quntifield.getText());
           //int price=Integer.parseInt(pricefield.getText());
           DatabaseService dbi=(DatabaseService)Naming.lookup("rmi://localhost:1099/databaseService");
           String result=dbi.Deleteuser(userName);
           JOptionPane.showMessageDialog(null, result,"success",JOptionPane.INFORMATION_MESSAGE);
           
           
           
       } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_userdeletebtnMouseClicked

    private void userhomebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userhomebtnMouseClicked
        // TODO add your handling code here:
        new HomeView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userhomebtnMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void useraddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useraddbtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_useraddbtnActionPerformed

    private void userhomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userhomebtnActionPerformed
        // TODO add your handling code here:
         new Loginform().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userhomebtnActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton useraddbtn;
    private javax.swing.JButton userdeletebtn;
    private javax.swing.JButton userhomebtn;
    private javax.swing.JTextField username;
    private javax.swing.JTextField userpassword;
    private javax.swing.JTextField userphone;
    private javax.swing.JTable usertbl;
    private javax.swing.JButton userupdatebtn;
    // End of variables declaration//GEN-END:variables
}
