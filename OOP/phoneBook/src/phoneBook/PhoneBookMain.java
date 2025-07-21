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
                    print("Enter first name: ");  String firstName = input();

                    print("Enter last name: "); String lastName = input();

                    print("Enter address: ");  String address = input();

                    print("Enter phone number: ");  String phoneNumber = input();

                    print("Enter email address: ");  String emailAddress = input();

                    contacts.addContact(firstName, lastName, address, phoneNumber, emailAddress);
                    break;
                }
                case "2": {
                    print("Enter first name: ");
                    String firstName = input();

                    print("Enter last name: ");
                    String lastName = input();

                    print("Enter phone number: ");
                    String phoneNumber = input();
                    contacts.deleteContact(firstName, lastName, phoneNumber);
                    break;
                }

                case "3": {
                    print("Enter phone number: "); String phoneNumber = input();

                    for (Contact contact : contacts.getContactList()){
                        if (contact.getPhoneNumber().equals(phoneNumber))  print(contact.toString());
                    }
                } break;

                case "4": {
                    print("Enter first name: "); String firstName = input();

                    boolean contactFound = false;
                    for (Contact contact : contacts.getContactList()){
                        if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                            print(contact.toString());
                            contactFound = true;
                        }
                    }
                    if (!contactFound) print("No matching contact for " + firstName);
                } break;

                case "6": {

                }

                case "7": {
                    if (contacts.getContactList().isEmpty()) print("Contact list is empty");
                    for (Contact contact : contacts.getContactList()) print(contact.toString());
                } break;

                case "8":
                    print("GoodBye...");  phoneBook = false;
                    break;
                default:
                    print("Invalid option! Try again.");
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