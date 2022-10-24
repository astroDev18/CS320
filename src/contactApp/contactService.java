package contactApp;

import java.util.ArrayList;
import java.util.List;

public class contactService {
    int currentID = 0;

    // create an arrayList to hold newly created object
    public static List<Contact> contactList = new ArrayList<Contact>();

    // add a contact
    public void addContact(String id, String firstName, String lastName, String contactAddress, String phoneNumber) {
        String stringID = Integer.toString(currentID);

        Contact addContact = new Contact(id, firstName,lastName, contactAddress, phoneNumber);
        contactList.add(addContact.getContactID(), addContact);

        // increment ID Number
        currentID++;
    }
    // Delete a contact
    public void deleteContact(String ID) {
        int indexID = Integer.parseInt(ID);

        for (int i = 0; i<contactService.contactList.size(); i++) {
            if (contactService.contactList.get(i).getContactID() == indexID) {
                contactList.remove(i);
            }
        }
    }
    // Edit first name
    public void editFirstName(String contactID, String firstName) {
        for(Contact iterate : contactList) {
            if (iterate.getContactID() == Integer.parseInt(contactID)) {
                iterate.setFirstName((firstName));
            }
        }
    }
    // Edit last name
    public void editLastName(String contactID, String lastName) {
        for (Contact iterate : contactList) {
            if (iterate.getContactID() == Integer.parseInt(contactID)) {
                iterate.setLastName(lastName);
            }
        }
    }

    public void editNumber(String contactID, String phoneNumber) {
        for (Contact iterate : contactList) {
            if (iterate.getContactID() == Integer.parseInt(contactID)) {
                iterate.setPhoneNumber(phoneNumber);
            }
        }
    }

    public void editAddress(String contactID, String address) {
        for (Contact iterate : contactList) {
            if (iterate.getContactID() == Integer.parseInt(contactID)) {
                iterate.setAddress(address);
            }
        }
    }
}
