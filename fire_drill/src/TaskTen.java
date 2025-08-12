import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        int validScoreCount = 0;
        while (count != 10) {
            System.out.printf("Enter score %d: ",count + 1);
            double score = input.nextDouble();
            if (score >= 0) {
                sum += score;
                validScoreCount++;
            }
            count++;
        }
        System.out.println("The average of valid scores is " + (sum / validScoreCount));
    }
}
