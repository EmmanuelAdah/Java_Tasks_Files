package chapter_8_tasks;
import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumberGenerator {

    public static int generateRandomInteger(int number) {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(10, 100);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println(generateRandomInteger(number));
    }
}
