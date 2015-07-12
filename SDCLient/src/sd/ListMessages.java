package sd;

import java.io.Serializable;
import java.util.ArrayList;

public class ListMessages implements Serializable {

    ArrayList<Message> listMessages = new ArrayList<>();

    public void insertMessage(Message m) {
        listMessages.add(m);
        System.out.println("Mensagem recebida");
        System.out.println(listMessages.get(0).getMessage());
    }

    public void removeMessage(String m) {
        for (int i = 0; i < listMessages.size(); i++) {
            if (listMessages.get(i).getMessage().equals(m)) {
                listMessages.remove(listMessages.get(i));
            }
        }
    }

    public ArrayList<Message> getMessageList() {

        ArrayList<Message> lm = new ArrayList<>();
        for (int i = 0; i < listMessages.size(); i++) {
            lm.add(listMessages.get(i));
        }
        return lm;
    }

    public void removeAllMessages() {
        listMessages.clear();
    }
}
