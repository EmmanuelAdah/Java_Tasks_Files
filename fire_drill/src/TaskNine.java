import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        while (count != 10) {
            System.out.printf("Enter score %d: ",count + 1);
            double score = input.nextDouble();
            if (score >= 0) sum += score;
            count++;
        }
        System.out.println("The sum of valid scores is " + sum);
    }
}
