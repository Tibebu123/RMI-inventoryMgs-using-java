package rmitour;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Create an instance of the remote object
            DatabaseService databaseService = new DatabaseServiceImpl();

            // Create the RMI registry and bind the remote object to a name
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("databaseService", databaseService);

            System.out.println("RMI Server started.");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
   
    }}
