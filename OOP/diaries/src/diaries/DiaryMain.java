package diaries;
import java.util.Scanner;

public class DiaryMain {
    static public void main(String... args) {

        Diaries diaries = new Diaries();
        Diary diary = null;

        String diaryMenu = """
                Welcome to Diary App!
                press:-
                1 -> Create Diary
                2 -> Add Entry
                3 -> Find Diary By UserName
                4 -> Delete Entry
                5 -> find Entry By ID
                6 -> Delete Diary
                7 -> Exit
                """;
        boolean menu = true;
        while (menu){
            print(diaryMenu);
            print("Enter your choice: ");
            String choice = input();
            switch (choice){
                case "1" -> {
                    boolean createDiary = true;
                    while (createDiary) {
                        try {
                            print("Enter username: ");  String userName = input();

                            print("Enter your password: ");  String password = input();
                            diaries.add(userName, password);

                            diary = new Diary(userName, password);
                            print("Diary created successfully!");
                            createDiary = false;
                        } catch (RuntimeException e) {
                            System.err.println(e.getMessage());
                        }
                    }
                }
                case "2" -> {
                    boolean addEntry = true;
                    while (addEntry) {
                        try {
                            print("Enter User ID: "); int userID = Integer.parseInt(input());

                            print("Enter Title: ");  String title = input();

                            print("Enter body of diary: "); String body = input();

                            diary.createEntry(userID, title, body);
                            print("Entry added successfully!");
                            addEntry = false;
                        } catch (NumberFormatException e) {
                            System.err.println("Invalid input! Try again...");
                        } catch (NullPointerException e){
                            System.err.println("Diary not found!");
                        }
                    }
                }
                case "3" -> {
                    try {
                        print("Enter username: ");
                        String userName = input();
                        print(diaries.findByUserName(userName).toString());
                    }catch (NullPointerException e){
                        System.err.println("Username not found!");
                    }
                }
                case "4" -> {
                    try{
                            print("Enter Entry ID: ");  int userID = Integer.parseInt(input());
                            diary.deleteEntry(userID);
                        } catch (NullPointerException e){
                        System.err.println("Entry not found!");
                        } catch (NumberFormatException e) {
                            System.err.println("Invalid input! Try again...");
                        }
                }
                case "5" -> {
                    try {
                        print("Enter Entry ID: ");
                        int diaryID = Integer.parseInt(input());
                        print(diary.findEntryByUserId(diaryID).toString());
                    }catch (NullPointerException | NumberFormatException e){
                        System.err.println("Entry not found!");
                    }
                }
                case "6" -> {
                    try {
                        print("Enter username: ");
                        String userName = input();

                        print("Enter your password: ");
                        String password = input();

                        diaries.add(userName, password);
                    }catch (NullPointerException e){
                        System.err.println("Account not found!");
                    }
                }
                case "7" -> {
                    print("GoodBye!...");
                    menu = false;
                }
                default -> print("Wrong choice! Try again!");
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