import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        while (count != 10) {
            System.out.printf("Enter score %d: ", (count + 1));
            double score = sc.nextDouble();
            if (count % 2 != 0) sum += score;
            count++;
        }
        System.out.println("The sum of even indexes is " + sum);
    }
}