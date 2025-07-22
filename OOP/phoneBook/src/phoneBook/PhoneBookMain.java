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
                            deleteContact = false;
                        } catch (RuntimeException e) {
                            System.err.println(e.getMessage());
                        }
                    }
                } break;

                case "3": {
                    print("Enter phone number: "); String phoneNumber = input();
                    print(contacts.findContactByPhoneNumber(phoneNumber));
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
                    for (Contact contact : contacts.getContactList()) {
                        if (contact.getPhoneNumber().equals(phoneNumber)) {
                            found = true;
                        }
                        if (!found) break; else print("Contact not found");
                    }
                } break;

                case "7": {
                    if (contacts.getContactList().isEmpty()) print("Contact list is empty");
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