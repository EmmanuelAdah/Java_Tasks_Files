package phoneBook;

import java.util.Scanner;

public class PhoneBookMain {
    public static void main(String... args) {
        Contacts contacts = new Contacts();

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
        while (true) {
            print(phoneBookMenu);
            print("Enter an option: ");
            String choice = input();

            switch (choice) {
                case "1":

                    break;

                case "8":
                    phoneBook = false;
                default:
                    phoneBook = true;
            }
        }
    }
    private static void print(String userInput){
        System.out.println(userInput);
    }

    private static String input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
