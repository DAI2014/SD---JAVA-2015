package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import sd.Message;

public interface Invite extends Remote {

    public boolean sendInvite(String ipSend, String ip, String nome, String curso, String email, String token) throws RemoteException;

    public boolean sendAnswer(String ipSend, String ip, String nome, String curso, String email, Boolean resp, String token) throws RemoteException;

}
