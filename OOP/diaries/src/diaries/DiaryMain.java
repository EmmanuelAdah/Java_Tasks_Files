package diaries;

import java.util.Scanner;

public class DiaryMain {

    public static void main(String[] args) {

        Diary ent = new Diary("userName", "passKey");
        Diaries diary = new Diaries();
        diary.add("userName", "password");
        ent.createEntry(2434, "user", "pass");
        ent.createEntry(2443, "userName", "password");
        ent.createEntry(243, "Name", "word");
        ent.createEntry(1996, "Emma", "Adah02");
        ent.deleteEntry(243);


        for (Entry entry : ent.getEntry()) {
            print(String.valueOf(entry));
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