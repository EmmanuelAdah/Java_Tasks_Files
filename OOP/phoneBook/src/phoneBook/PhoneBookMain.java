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
            3 -> Find Contact by phone number
            4 -> Find Contact by first name
            5 -> Find Contact by last name
            6 -> Edit contact details
            7 -> View contacts
            8 -> Exit Program
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
                    try {
                        print("Enter phone number: "); String phoneNumber = input();
                        print(contacts.findContactByPhoneNumber(phoneNumber));
                    } catch (RuntimeException e) {
                        System.err.println(e.getMessage());
                    }
                } break;

                case "4": {
                    print("Enter first name: "); String firstName = input();
                    print(contacts.findContactByFirstName(firstName));
                } break;

                case "5":{
                    print("Enter last name: "); String lastName = input();
                    print(contacts.findContactByLastName(lastName));
                } break;

                case "6": {
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

                case "7": {
                    if (contacts.getContactList().isEmpty()) print("Contact list is empty \n");
                    for (Contact contact : contacts.getContactList()) print(contact.toString());
                } break;

                case "8":
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