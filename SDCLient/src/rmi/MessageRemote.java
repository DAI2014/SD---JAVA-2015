package rmi;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import sd.ListMessages;
import sd.SD;

public class MessageRemote extends UnicastRemoteObject implements Message, Serializable {

    SD system;

    public MessageRemote(SD system) throws RemoteException {
        super();
        this.system = system;
    }

    @Override
    public boolean sendMessage(String ip, sd.Message message) throws RemoteException {
        
        sd.Message nm = new sd.Message();
        nm = message;
        system.lm.insertMessage(nm);
        system.save();
        return true;
    }
}
