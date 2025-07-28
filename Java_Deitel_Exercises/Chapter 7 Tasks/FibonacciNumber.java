import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();

        for (int index = 0; index < number; index++) {
            if (fibonacciNumbers.size() > 2) {
                System.out.print((fibonacciNumbers.get(index - 2) + fibonacciNumbers.get(index - 1)) + " ");
                fibonacciNumbers.add(index);
            } else if (index == 1) {
                fibonacciNumbers.add(index);
                System.out.print(fibonacciNumbers.get(index - 1) + fibonacciNumbers.get(index) + " ");
            } else {
                System.out.print(index + " ");
                fibonacciNumbers.add(index);
            }
        }

    }
}
