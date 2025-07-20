package phoneBook;

import java.util.Scanner;

public class PhoneBookMain {
    public static void main(String... args) {
        Contacts contacts = new Contacts();
        Name names = new Name("First Name", "Last Name");

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
            print("Enter an option: ");
            String choice = input();

            switch (choice) {
                case "1": {
                    print("Enter first name: ");
                    String firstName = input();

                    print("Enter last name: ");
                    String lastName = input();

                    print("Enter address: ");
                    String address = input();

                    print("Enter phone number: ");
                    String phoneNumber = input();

                    print("Enter email address: ");
                    String emailAddress = input();
                    contacts.addName(firstName, lastName);
                    names.addContact(address, phoneNumber, emailAddress);
                    break;
                }
                case "2": {
                    print("Enter first name: ");
                    String firstName = input();

                    print("Enter last name: ");
                    String lastName = input();

                    print("Enter phone number: ");
                    String phoneNumber = input();
                    contacts.deleteContact(firstName, lastName);
                    names.deleteContactByPhoneNumber(phoneNumber);
                    break;
                }

                case "7": {
                    print("Enter first name: ");
                    String firstName = input();

                    print("Enter phone number: ");
                    String phoneNumber = input();

                    contacts.findContactByFirstName(firstName);
                    names.findContactByPhoneNumber(phoneNumber);
                } break;

                case "8":
                    print("GoodBye...");
                    phoneBook = false;
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
