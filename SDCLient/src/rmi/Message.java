package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {

    public boolean sendMessage(String ip, sd.Message message) throws RemoteException;
}
