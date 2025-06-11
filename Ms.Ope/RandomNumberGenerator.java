import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {

public static void main(String[] args){

Random random = new Random();

int min = 0;
int max = 2;

int randomNumber = min + (int)(Math.random() * ((max - min) + 1));

System.out.println("Random Number: " + randomNumber);

Scanner input = new Scanner(System.in);

System.out.println("Result: "+ randomNumber);

}
}