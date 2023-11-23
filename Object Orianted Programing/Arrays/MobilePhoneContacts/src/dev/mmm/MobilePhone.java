package dev.mmm;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    // Public constructor
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    // Public method to add a new contact
    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    // Public method to update an existing contact
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactIndex = findContact(oldContact);
        if (contactIndex != -1) {
            myContacts.set(contactIndex, newContact);
            return true; // Successfully updated the contact
        } else {
            return false; // Contact not found
        }
    }

    // Public method to remove a contact
    public boolean removeContact(Contact contact) {
        int contactIndex = findContact(contact);
        if (contactIndex != -1) {
            myContacts.remove(contactIndex);
            return true; // Successfully removed the contact
        } else {
            return false; // Contact not found
        }
    }

    // Private method to find the index of a contact by name
    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contactName)) {
                return i; // Contact found, return its position
            }
        }
        return -1; // Contact not found
    }

    // Overloaded method to find the index of a contact by object
    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    // Public method to query a contact by name
    public Contact queryContact(String contactName) {
        int contactIndex = findContact(contactName);
        if (contactIndex != -1) {
            return myContacts.get(contactIndex); // Return the contact
        } else {
            return null; // Contact not found
        }
    }

    // Public method to print contacts
    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            String contactInfo = String.format("%d. %s -> %s", i + 1, myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
            System.out.println(contactInfo);
        }
    }
}

