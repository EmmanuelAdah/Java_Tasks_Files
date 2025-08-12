import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        while (count != 10) {
            System.out.println("Enter score " + (count + 1));
            double score = input.nextDouble();
            sum += score;
            count++;
        }
        System.out.println("The sum is " + sum);
    }
}
