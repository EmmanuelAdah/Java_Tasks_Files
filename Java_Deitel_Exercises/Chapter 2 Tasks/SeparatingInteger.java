import java.util.Scanner;

public class SeparatingDigits {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter integer of five digits: ");
int numbers = input.nextInt();

int firstDigit = numbers / 10000;
int secondDigit = (numbers % 10000) / 1000;
int thirdDigit = (numbers % 1000) / 100;
int fourthDigit = (numbers % 100) / 10;
int fifthDigit = (numbers % 10);

System.out.printf("%d   ",firstDigit);
System.out.printf("%d   ",secondDigit);
System.out.printf("%d   ", thirdDigit);
System.out.printf("%d   ", fourthDigit);
System.out.printf("%d ", fifthDigit);
}
}