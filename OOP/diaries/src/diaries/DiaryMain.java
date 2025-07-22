package diaries;

import java.util.Scanner;

public class DiaryMain {
    public static void main(String[] args) {
        String diaryMenu = """
                Welcom to Diary App!
                press:-
                1 -> Add Diary
                2 -> Delete Diary
                3 -> find Diary By UserName
                """;

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