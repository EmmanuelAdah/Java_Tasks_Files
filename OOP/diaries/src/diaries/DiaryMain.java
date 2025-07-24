package diaries;

import java.util.Scanner;

public class DiaryMain {
    public static void main(String[] args) {
        Diaries diaries = new Diaries();
        Diary diary = null;

        String diaryMenu = """
                Welcome to Diary App!
                press:-
                1 -> Create Diary
                2 -> Add Entry
                3 -> Find Diary By UserName
                4 -> Delete Diary
                5 -> find Entry By ID
                6 -> Exit
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
                            print("Enter your name: ");
                            String userName = input();

                            print("Enter your password: ");
                            String password = input();
                            diaries.add(userName, password);
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

                            assert diary != null;
                            diary.createEntry(userID, title, body);
                            print("Entry added successfully!");
                            addEntry = false;
                        } catch (RuntimeException e) {
                            System.err.println(e.getMessage());
                        }
                    }
                }

                case "3" -> {
                        print("Enter username: "); String userName = input();
                        diaries.findByUserName(userName);
                }

                case "4" -> {
                    try{
                            print("Enter User ID: ");  int userID = Integer.parseInt(input());
                            if (diary != null) diary.deleteEntry(userID);
                        } catch (RuntimeException e) {
                            System.err.println(e.getMessage());
                        }
                }

                case "5" -> {
                    print("Enter your ID: "); int diaryID = Integer.parseInt(input());
                    diary.findEntryByUserId(diaryID);
                }

                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        }

        print("Enter your name: ");
        double userName = Double.parseDouble(input());
    }
    private static void print(String userInput){
        System.out.println(userInput);
    }

    private static String input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}