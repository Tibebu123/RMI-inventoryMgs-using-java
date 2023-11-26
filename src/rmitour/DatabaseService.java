package rmitour;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DatabaseService extends Remote {
    //void insertData(String name, int age) throws RemoteException;
   public String Add(int id, String name, String category, int quantity, int price) throws RemoteException;   
     public String Delete(int id) throws RemoteException;
    // public String Update(int id, String name, int quantity, int price) throws RemoteException;
      String[][] displayTableContent() throws RemoteException;
      // public String Updatecustemer(int id, String name, int phone);
      public String Addcustemer(int id, String name, int phone) throws RemoteException;

   // public String deletecustemer(int id);

    public String Updatecustemer(int id, String name, int phone) throws RemoteException;

   public String Adduser(String userName, String password, int phone) throws RemoteException;

    public String Updateuser(String userName, String password, int phone) throws RemoteException;

   public String Deleteuser(String userName) throws RemoteException;

    public String Addcategory(int id, String name) throws RemoteException ;

    public String Update(int id, String name, String cat, int quantity, int price)throws RemoteException;

   
}