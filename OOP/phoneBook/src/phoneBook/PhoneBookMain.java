package phoneBook;
import java.util.Scanner;

public class PhoneBookMain {
    public static void main(String... args) {
        PhoneBook contacts = new PhoneBook();

        String phoneBookMenu = """
            Welcome to the Phone Book!
            press:-
            1 -> Add Contact
            2 -> Delete Contact
            3 -> Find Contact
            4 -> Edit contact details
            5 -> View contacts
            6 -> Exit Program
            """;
        boolean phoneBook = true;
        while (phoneBook) {
            print(phoneBookMenu);
            print("Enter an option: ");  String choice = input();

            switch (choice) {
                case "1": {
                    boolean addContact = true;
                    while (addContact) {
                        try {
                            print("Enter first name: "); String firstName = input();

                            print("Enter last name: ");  String lastName = input();

                            print("Enter address: ");  String address = input();

                            print("Enter phone number: "); String phoneNumber = input();

                            print("Enter email address: "); String emailAddress = input();

                            contacts.addContact(firstName, lastName, address, phoneNumber, emailAddress);
                            print("Contact added successfully!...");
                            addContact = false;
                        } catch (RuntimeException e) {
                            System.err.println(e.getMessage());
                        }
                    }
                }  break;

                case "2": {
                    boolean deleteContact = true;
                    while (deleteContact) {
                        try {
                            print("Enter first name: "); String firstName = input();

                            print("Enter last name: "); String lastName = input();

                            print("Enter phone number: "); String phoneNumber = input();

                            contacts.deleteContact(firstName, lastName, phoneNumber);
                            print("Contact deleted successfully!...");
                            deleteContact = false;
                        } catch (RuntimeException e) {
                            System.err.println(e.getMessage());
                        }
                    }
                } break;

                case "3": {
                    String findContact = """
                        1 -> Find Contact by phone number
                        2 -> Find Contact by first name
                        3 -> Find Contact by last name
                        0 -> Back
                        """;
                    boolean contact = true;
                    while (contact) {
                        print(findContact);
                        String userChoice = input();

                        switch (userChoice) {
                            case "1": {
                                try {
                                    print("Enter phone number: ");
                                    String phoneNumber = input();
                                    print(contacts.findContactByPhoneNumber(phoneNumber));
                                } catch (RuntimeException e) {
                                    System.err.println(e.getMessage());
                                }
                            } break;

                            case "2": {
                                print("Enter first name: ");
                                String firstName = input();
                                print(contacts.findContactByFirstName(firstName));
                            } break;

                            case "3": {
                                print("Enter last name: ");
                                String lastName = input();
                                print(contacts.findContactByLastName(lastName));
                            }
                            case "0": contact = false; break;

                            default: contact = true;
                        }
                    }
                    } break;

                case "4": {
                    print("Enter phone number of contact to update: ");
                    String phoneNumber = input();
                    int count = 0;
                    boolean found = false;
                    try{
                    for (Contact contact : contacts.getContactList()) {
                        if (contact.getPhoneNumber().equals(phoneNumber)) {
                            print("Always press Enter to keep the old entry");
                            print("Enter new first name: ");
                            String firstName = input();
                            if (firstName.isBlank()) firstName = contact.getFirstName();

                            print("Enter new last name: ");
                            String lastName = input();
                            if (lastName.isBlank()) lastName = contact.getLastName();

                            print("Enter new address: ");
                            String address = input();
                            if (address.isBlank()) address = contact.getAddress();

                            print("Enter new phone number: ");
                            String newPhoneNumber = input();
                            if (newPhoneNumber.isBlank()) newPhoneNumber = contact.getPhoneNumber();

                            print("Enter new email address: ");
                            String emailAddress = input();
                            if (emailAddress.isBlank()) emailAddress = contact.getEmail();

                            contacts.updateContact(count, firstName, lastName, address, newPhoneNumber, emailAddress);
                            print("Contact updated successfully!");
                            found = true;
                        }
                        if (found) { break; } else {print("Contact not found"); }
                    }
                    } catch (RuntimeException e) {
                        System.err.println(e.getMessage());
                    }
                } break;

                case "5": {
                    if (contacts.getContactList().isEmpty()) print("Contact list is empty \n");
                    for (Contact contact : contacts.getContactList()) print(contact.toString());
                } break;

                case "6":
                    print("GoodBye...");  phoneBook = false;
                    break;
                default:
                    print("Invalid option! Try  again.");
            }
        }
    }
    private static void print(String userInput){
        System.out.println(userInput);
    }
    private static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}