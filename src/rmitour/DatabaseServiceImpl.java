package rmitour;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseServiceImpl extends UnicastRemoteObject implements DatabaseService {

   public DatabaseServiceImpl() throws RemoteException {
        super();
    }
   @Override
     public String Add(int id, String name, String category, int quantity, int price) throws RemoteException {
        
        try{
            
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
        Statement st=con.createStatement();
        String sql="insert into producttable value('"+id+"','"+name+"','"+category+"','"+quantity+"','"+price+"')";
        st.executeUpdate(sql);
        return "Record added Succesfully";
        
        }catch (ClassNotFoundException | SQLException e){
         return (e.toString());
        }
    }
     public String Delete(int id) throws RemoteException {
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
        Statement st=con.createStatement();
        String sql="delete from producttable where id='"+id+"' ";
        st.executeUpdate(sql);
       // String sql="delete from producttable where id='"+id+"' ";

        return "Record deleted Succesfully";
        }catch (ClassNotFoundException | SQLException e){
         return (e.toString());
        } }

    /**
     *
     * @param id
     * @param name
     * @param cat
     * @param quantity
     * @param price
     * @return
     * @throws RemoteException
     */
    @Override
   public String Update(int id, String name, String cat,int quantity, int price) throws RemoteException {
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
        Statement st=con.createStatement();
        String sql="insert into producttable value('"+id+"','"+name+"','"+cat+"','"+quantity+"','"+price+"')";
        st.executeUpdate(sql);
        return "Record Updated Succesfully";
        }catch (Exception e){
         return (e.toString());
        }
    }
//    @Override
//    public void insertData(String name, int age) throws RemoteException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
////    
//

    /**
     *
     * @param id
     * @param name
     * @param phone
     * @return
     * @throws java.rmi.RemoteException
     */
   @Override
    public String Updatecustemer(int id, String name, int phone) throws RemoteException {
 try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
        Statement st=con.createStatement();
        String sql="insert into custemertable value('"+id+"','"+name+"','"+phone+"')";
        st.executeUpdate(sql);
        return "Record Updated Succesfully";
        }catch (Exception e){
         return (e.toString());
        }    }
    
                  
    @Override
    public String Addcustemer(int id, String name, int phone) throws RemoteException {
try{
            
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
        Statement st=con.createStatement();
        String sql="insert into custemertable value('"+id+"','"+name+"','"+phone+"')";
        st.executeUpdate(sql);
        return "Record added Succesfully";
        
        }catch (ClassNotFoundException | SQLException e){
         return (e.toString());
        }    }

    public String deletecustemer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Adduser(String userName, String password, int phone) {
     try{
            
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
        Statement st=con.createStatement();
        String sql="insert into usertable value('"+userName+"','"+password+"','"+phone+"')";
        st.executeUpdate(sql);
        return "Record added Succesfully";
        
        }catch (ClassNotFoundException | SQLException e){
         return (e.toString());
        }    
    }
   
    

    @Override
    public String Updateuser(String userName, String password, int phone) {
       try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
        Statement st=con.createStatement();
        String sql="insert into usertable value('"+userName+"','"+password+"','"+phone+"')";
        st.executeUpdate(sql);
        return "Record Updated Succesfully";
        }catch (ClassNotFoundException | SQLException e){
         return (e.toString());
        }    }
    
    

    @Override
    public String Deleteuser(String userName) {
          try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
        Statement st=con.createStatement();
        String sql="delete from usertable where userName='"+userName+"' ";
        st.executeUpdate(sql);
       // String sql="delete from producttable where id='"+id+"' ";

        return "Record deleted Succesfully";
        }catch (ClassNotFoundException | SQLException e){
         return (e.toString());
        } 
    }
   @Override
       public String[][] displayTableContent() throws RemoteException {
        String[][] tableContent = null;
        try ( // Connect to the database
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password"); // Execute the SQL query to retrieve table content
                Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("SELECT * FROM producttable");

            // Get the number of rows in the result set
            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();

            // Get the number of columns in the result set
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Initialize the table content array
            tableContent = new String[rowCount][columnCount];

            // Populate the table content array
            int row = 0;
            while (rs.next()) {
                for (int col = 0; col < columnCount; col++) {
                    tableContent[row][col] = rs.getString(col + 1);
                }
                row++;
            }

            // Close the database connection
            rs.close();
        } catch (SQLException e) {
        }
        return tableContent;
    }

   @Override
    public String Addcategory(int id, String name) {
    try{
            
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
        Statement st=con.createStatement();
        String sql="insert into  category value('"+id+"','"+name+"')";
        st.executeUpdate(sql);
        return "Record added Succesfully";
        
        }catch (ClassNotFoundException | SQLException e){
         return (e.toString());
        }    }

}
//
//    public String Displayproduct(int id, String name, int phone) throws RemoteException {
//  DefaultTableModel model = new DefaultTableModel();
//    model.addColumn("ID");
//    model.addColumn("Name");
//    model.addColumn("Category");
//    model.addColumn("Quantity");
//    model.addColumn("Price");
//
//    try {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics","root","");
//        Statement stmt = con.createStatement();
//
//        String sqlQuery = "SELECT * FROM producttable";
//        ResultSet resultSet = stmt.executeQuery(sqlQuery);
//
//        while (resultSet.next()) {
//           // int id = resultSet.getInt("id");
//            //String name = resultSet.getString("name");
//            String category = resultSet.getString("category");
//            int quantity = resultSet.getInt("quantity");
//            int price = resultSet.getInt("price");
//
//            model.addRow(new Object[]{id, name, category, quantity, price});
//        }
//        
//        
//        resultSet.close();
//        stmt.close();
//        con.close();
//    } catch (Exception ex) {
//        ex.printStackTrace();
//    }  
//     return "Record deleted Succesfully";
//    }

  
    
