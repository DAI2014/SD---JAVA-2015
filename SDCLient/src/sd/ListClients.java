package sd;

import java.io.Serializable;
import java.util.ArrayList;

public class ListClients implements Serializable {

    ArrayList<Client> clientsList = new ArrayList<>();

    public void insertClient(Client c) {
        clientsList.add(c);
    }

    public void removeClient(Client c) {
        clientsList.remove(c);
    }

    public Client getClient() {
        return clientsList.get(0);
    }

    public boolean checkClient() {
        if (clientsList.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void removeRegister() {
        clientsList.clear();
    }

}
