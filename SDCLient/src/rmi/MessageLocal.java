package rmi;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MessageLocal implements Message, Serializable {

    static String SERVICE_NAME = "/Messages";

    @Override
    public boolean sendMessage(String ip, sd.Message message) throws RemoteException {
    Boolean status = false;
        try {

            Message stub = (Message) LocateRegistry.getRegistry(ip).lookup(SERVICE_NAME);;
            stub.sendMessage(ip, message);
            status = true;
        } catch (Exception e) {
            System.err.println("ComputePi exception:");
            e.printStackTrace();
        }
        return status;

}
}
