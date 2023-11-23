package dev.mmm;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("1234567890");

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    printContacts();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        System.out.println("Exiting the program. Goodbye!");
    }

    private static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("0 - Exit");
        System.out.println("1 - Add a new contact");
        System.out.println("2 - Update an existing contact");
        System.out.println("3 - Remove a contact");
        System.out.println("4 - Print contacts");
        System.out.print("Enter your choice: ");
    }

    private static void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact newContact = new Contact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("Contact added successfully!");
        } else {
            System.out.println("Contact already exists!");
        }
    }

    private static void updateContact() {
        System.out.print("Enter the name of the contact to update: ");
        String oldName = scanner.nextLine();
        Contact oldContact = new Contact(oldName, ""); // The phone number doesn't matter for updating

        System.out.print("Enter the new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter the new contact phone number: ");
        String newPhoneNumber = scanner.nextLine();

        Contact newContact = new Contact(newName, newPhoneNumber);
        if (mobilePhone.updateContact(oldContact, newContact)) {
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Contact not found for updating.");
        }
    }

    private static void removeContact() {
        System.out.print("Enter the name of the contact to remove: ");
        String name = scanner.nextLine();
        Contact contactToRemove = new Contact(name, ""); // The phone number doesn't matter for removal

        if (mobilePhone.removeContact(contactToRemove)) {
            System.out.println("Contact removed successfully!");
        } else {
            System.out.println("Contact not found for removal.");
        }
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }
}

