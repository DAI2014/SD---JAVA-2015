package sd;

import rmi.InviteRemote;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SD implements Serializable {

    public static final String NOME_DB = "GRAVA.OBJ";
    public ListClients lc = new ListClients();
    public ListContacts lct = new ListContacts();
    public ListInvites li = new ListInvites();
    public ListMessages lm = new ListMessages();

    public void save() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOME_DB))) {
            oos.writeObject(this);
            oos.flush();
        } catch (IOException e) {
            // TODO mostrar janela generica com o erro
            e.printStackTrace();
        }
    }

    public static SD loadFile() {
        SD sistema = null;

        try {

            ObjectInputStream ooin = new ObjectInputStream(new FileInputStream(NOME_DB));
            sistema = (SD) ooin.readObject();
            ooin.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    String.format("Ocorreu um erro ao inicializar o sistema: %s.\nO programa será encerrado.",
                            ex.getMessage()),
                    "Erro fatal", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return sistema;
    }

    public Client getClient() {

        return lc.getClient();
    }

    public void insertClient(Client cl) {
        lc.insertClient(cl);
    }

    public boolean checkClient() {
        return lc.checkClient();
    }

    public void removeClient(Client cl) {
        lc.removeClient(cl);
    }

    public void insertContact(Contact c) {
        lct.insertContact(c);
    }

    public void removeContact(Contact c) {
        lct.removeContact(c);
    }

    public Contact getContact(String email) {
        return lct.getContact(email);
    }

    public ArrayList<Contact> getInviteList() {
        return li.getInviteList();
    }

    public void insertInvite(Contact inv) {
        li.addInvite(inv);
    }

    public void removeInvite(Contact inv) {
        li.removeInvite(inv);
    }

    public ArrayList<Contact> getContactList() {
        return lct.getContactList();
    }

    public Contact getInvite(String email) {
        return li.getInvite(email);
    }

    public void insertMessage(sd.Message m) {
        lm.insertMessage(m);
    }

    public void removeMessage(String m) {
        lm.removeMessage(m);
    }

    public ArrayList<sd.Message> getMessageList() {
        return lm.getMessageList();
    }

    public ArrayList<String> getTokens() {
        return lct.getTokens();
    }

    public void removeRegister() {
        lc.removeRegister();
        lct.removeAllContacts();
        lm.removeAllMessages();
        li.removeAllInvites();
    }

}
