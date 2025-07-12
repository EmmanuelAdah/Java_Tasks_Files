package stack;

public class PrintingAlphabets {
    public static void main(String... args) {

        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + " " + String.valueOf(c).toLowerCase());
        }
    }
}
