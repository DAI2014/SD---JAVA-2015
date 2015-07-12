package rmi;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import sd.Contact;
import sd.ListInvites;
import sd.ListMessages;
import sd.Message;
import sd.SD;

public class InviteRemote extends UnicastRemoteObject implements Invite, Serializable {

    ListInvites il = new ListInvites();
    ListMessages lm = new ListMessages();
    SD system;

    public InviteRemote(SD system) throws RemoteException {

        super();
        this.system = system;
    }

    @Override
    public boolean sendInvite(String ipSend, String ip, String nome, String curso, String email, String token) throws RemoteException {
        Contact invite = new Contact();
        invite.setCurso(curso);
        invite.setEmail(email);
        invite.setNome(nome);
        invite.setIp(ip);
        invite.setToken(token);
        //il.addInvite(invite);
        system.li.addInvite(invite);
        system.save();
        System.out.println("Novo invite: " + invite.getCurso() + ", " + invite.getNome());
        return true;
    }

    @Override
    public boolean sendAnswer(String ipSend, String ip, String nome, String curso, String email, Boolean resp, String token) throws RemoteException {
        
        if (resp == true) {
            Contact c = new Contact();
            c.setCurso(curso);
            c.setEmail(email);
            c.setIp(ip);
            c.setNome(nome);
            c.setToken(token);
            system.insertContact(c);
            system.save();
        }
        return true;
    }

}
