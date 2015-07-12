package sd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListContacts implements Serializable {

    ArrayList<Contact> contactList = new ArrayList<>();

    public void insertContact(Contact c) {
        contactList.add(c);
    }

    public void removeContact(Contact c) {
        contactList.remove(c);
    }

    public Contact getContact(String email) {
        Contact contact = new Contact();
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getEmail().equals(email)) {
                contact = contactList.get(i);
            }
        }
        return contact;
    }

    public ArrayList<Contact> getContactList() {
        ArrayList<Contact> lc = new ArrayList();
        for (int i = 0; i < contactList.size(); i++) {
            lc.add(contactList.get(i));
        }
        return lc;
    }

    public ArrayList<String> getTokens() {
        ArrayList<String> tokens = new ArrayList();
        for (int i = 0; i < contactList.size(); i++) {
            tokens.add(contactList.get(i).getToken());
        }
        return tokens;
    }

    public void removeAllContacts() {
        contactList.clear();
    }
}
