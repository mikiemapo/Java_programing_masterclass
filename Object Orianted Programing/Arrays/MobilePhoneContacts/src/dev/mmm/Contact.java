package dev.mmm;

public class Contact {
    private String name;
    private String phoneNumber;

    // Public constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public getter method for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Public static method to create a Contact instance
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
