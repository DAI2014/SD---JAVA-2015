package rmi;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import sd.Message;

public class InviteLocal implements Invite, Serializable {

    static String SERVICE_NAME = "/Invites";

    @Override
    public boolean sendInvite(String ipSend, String ip, String nome, String curso, String email, String token) throws RemoteException {
        Boolean status = false;
        try {

            Invite stub = (Invite) LocateRegistry.getRegistry(ipSend).lookup("/Invites");;
            stub.sendInvite(ipSend, ip, nome, curso, email, token);
            status = true;
        } catch (Exception e) {
            System.err.println("ComputePi exception:");
            //e.printStackTrace();
        }
        return status;
    }

    @Override
    public boolean sendAnswer(String ipSend, String ip, String nome, String curso, String email, Boolean resp, String token) throws RemoteException {
        Boolean status = false;
        try {

            Invite stub = (Invite) LocateRegistry.getRegistry(ipSend).lookup("/Invites");;
            stub.sendAnswer(ipSend, ip, nome, curso, email, resp, token);
            status = true;
        } catch (Exception e) {
            System.err.println("ComputePi exception:");
            //e.printStackTrace();
        }
        return status;
    }

}
