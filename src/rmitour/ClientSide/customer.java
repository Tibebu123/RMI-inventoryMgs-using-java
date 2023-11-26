
package rmitour.ClientSide;

import java.awt.HeadlessException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import rmitour.DatabaseService;

/**
 *
 * @author Tibebu
 */
public final class customer extends javax.swing.JFrame {

    /**
     * Creates new form customer
     */
    public customer() {
        initComponents();
       displaycustemer();
       
    }
     String driverName = "com.mysql.jdbc.Driver";
    
    // parameters to open the connection
    String DBurl = "jdbc:mysql://localhost:3306/electronics";
    String uname = "root";
    String pass = "";
       public Connection openConnection() throws SQLException, ClassNotFoundException
    {
        // connection object
        Connection con = null;
        // load the driver
        Class c = Class.forName(driverName);
        if(c != null)
        {
            // open the connection 
            
            con = DriverManager.getConnection(DBurl, uname, pass);
        }
        return con;
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        custidfield = new javax.swing.JTextField();
        custnamefield = new javax.swing.JTextField();
        custphonefield = new javax.swing.JTextField();
        custadd = new javax.swing.JButton();
        custdelet = new javax.swing.JButton();
        custupdatebtn = new javax.swing.JButton();
        custhomebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customertable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inventory Managment Sysetm");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Customer phone:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Customer id:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Customer name:");

        custidfield.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        custnamefield.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        custphonefield.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        custadd.setBackground(new java.awt.Color(255, 51, 51));
        custadd.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        custadd.setForeground(new java.awt.Color(255, 255, 255));
        custadd.setText("Add");
        custadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custaddMouseClicked(evt);
            }
        });
        custadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custaddActionPerformed(evt);
            }
        });

        custdelet.setBackground(new java.awt.Color(255, 51, 51));
        custdelet.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        custdelet.setForeground(new java.awt.Color(255, 255, 255));
        custdelet.setText("Delete");
        custdelet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custdeletMouseClicked(evt);
            }
        });

        custupdatebtn.setBackground(new java.awt.Color(255, 51, 51));
        custupdatebtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        custupdatebtn.setForeground(new java.awt.Color(255, 255, 255));
        custupdatebtn.setText("Update");
        custupdatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custupdatebtnMouseClicked(evt);
            }
        });

        custhomebtn.setBackground(new java.awt.Color(255, 51, 51));
        custhomebtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        custhomebtn.setForeground(new java.awt.Color(255, 255, 255));
        custhomebtn.setText("Home");
        custhomebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custhomebtnMouseClicked(evt);
            }
        });
        custhomebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custhomebtnActionPerformed(evt);
            }
        });

        customertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "CustomerID", "CustomerName", "CustomerPhone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customertable);

        jLabel7.setText("Custemer list");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custphonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(custadd)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custhomebtn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(custupdatebtn)
                                .addGap(33, 33, 33)
                                .addComponent(custdelet)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(233, 233, 233))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jLabel4)
                    .addContainerGap(1037, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(custidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(custnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(custphonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custadd)
                            .addComponent(custdelet)
                            .addComponent(custupdatebtn))
                        .addGap(30, 30, 30)
                        .addComponent(custhomebtn)
                        .addGap(158, 158, 158))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(91, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(jLabel4)
                    .addContainerGap(434, Short.MAX_VALUE)))
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

      public void displaycustemer() {
  try {
      Connection conn = this.openConnection();
            // create statement object
           Statement  st = conn.createStatement();
       ResultSet rs = st.executeQuery("select * from custemertable ");

        // Check if ResultSet is not null
        if (rs != null) {
            customertable.setModel(DbUtils.resultSetToTableModel(rs));
        } else {
            // Handle the case when ResultSet is null
            // For example, you can display an error message or take appropriate action
            System.out.println("No data found in ResultSet");
        }

    } catch (SQLException | ClassNotFoundException e) {
    }}
    private void quntifieldActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          
    private void custaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custaddMouseClicked
     try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
           Statement st= (Statement)con.createStatement();
           int id=Integer.parseInt(custidfield.getText());
           String name=custnamefield.getText();
          int phone=Integer.parseInt(custphonefield.getText());
           DatabaseService dbi=(DatabaseService)Naming.lookup("rmi://localhost:1099/databaseService");
           String result=dbi.Addcustemer(id, name,  phone);
           JOptionPane.showMessageDialog(null, result,"success",JOptionPane.INFORMATION_MESSAGE);
           
           
           
       } catch (ClassNotFoundException | SQLException | NumberFormatException | NotBoundException | MalformedURLException | RemoteException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
       }
     displaycustemer();
    }//GEN-LAST:event_custaddMouseClicked

    private void custdeletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custdeletMouseClicked
//          try{
//           Class.forName("com.mysql.jdbc.Driver");
//           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
//           Statement st= (Statement)con.createStatement();
//           int id=Integer.parseInt(custidfield.getText());
//           
//           //String name=namefield.getText();
//           //int quantity=Integer.parseInt(quntifield.getText());
//           //int price=Integer.parseInt(pricefield.getText());
//           DatabaseService dbi=(DatabaseService)Naming.lookup("rmi://localhost:1099/databaseService");
//           String result=dbi.deletecustemer(id);
//           JOptionPane.showMessageDialog(null, result,"success",JOptionPane.INFORMATION_MESSAGE);
//           
//           
//           
//       } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
      // }
        
                          
    }//GEN-LAST:event_custdeletMouseClicked

    private void custupdatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custupdatebtnMouseClicked
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
           Statement st= (Statement)con.createStatement();
           int id=Integer.parseInt(custidfield.getText());
           String name=custnamefield.getText();
           int phone=Integer.parseInt(custphonefield.getText());
         //  int price=Integer.parseInt(pricefield.getText());
           DatabaseService dbi=(DatabaseService)Naming.lookup("rmi://localhost:1099/databaseService");
           String result=dbi.Updatecustemer(id, name,  phone);
           JOptionPane.showMessageDialog(null, result,"success",JOptionPane.INFORMATION_MESSAGE);
           
           
           
       } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_custupdatebtnMouseClicked

    private void custhomebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custhomebtnMouseClicked
        new HomeView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_custhomebtnMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void custhomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custhomebtnActionPerformed
          new HomeView().setVisible(true);
        this.dispose();
                     
    }//GEN-LAST:event_custhomebtnActionPerformed

    private void custaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custaddActionPerformed

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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custadd;
    private javax.swing.JButton custdelet;
    private javax.swing.JButton custhomebtn;
    private javax.swing.JTextField custidfield;
    private javax.swing.JTextField custnamefield;
    private javax.swing.JTable customertable;
    private javax.swing.JTextField custphonefield;
    private javax.swing.JButton custupdatebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
