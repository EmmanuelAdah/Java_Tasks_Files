import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        int temp = 0;
        for (int index = 0; index < number; index++) {
            if (index > 1) {
                temp = (fibonacciNumbers.get(index - 2) + fibonacciNumbers.get(index - 1));
                System.out.print(temp + " ");
                fibonacciNumbers.add(temp);
            } else {
                System.out.print(index + " ");
                fibonacciNumbers.add(index);
            }
        }
    }
}
