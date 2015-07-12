package sd;

import java.io.Serializable;
import java.util.ArrayList;

public class ListInvites implements Serializable {

    ArrayList<Contact> inviteList = new ArrayList<>();

    public void addInvite(Contact c) {
        Boolean found = false;
        for (int i = 0; i < inviteList.size(); i++) {
            if (c.getEmail().equals(inviteList.get(i).getEmail())) {
                found = true;
            }
        }
        if (found == false) {
            inviteList.add(c);
            System.out.println("Invite inserido");
        }

    }

    public ArrayList<Contact> getInviteList() {
        ArrayList<Contact> il = new ArrayList<>();
        for (int i = 0; i < inviteList.size(); i++) {
            il.add(inviteList.get(i));
        }
        return il;
    }

    public void removeInvite(Contact c) {
        inviteList.remove(c);
    }

    public Contact getInvite(String email) {
        Contact c = new Contact();
        for (int i = 0; i < inviteList.size(); i++) {
            if (inviteList.get(i).getEmail().equals(email)) {
                c = inviteList.get(i);
            }
        }
        return c;
    }

    public void removeAllInvites() {
        inviteList.clear();
    }
}
