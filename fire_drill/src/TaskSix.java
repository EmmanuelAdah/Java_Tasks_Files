import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        int evenScoreCount = 0;
        while (count != 10) {
            System.out.printf("Enter score %d: ", (count + 1));
            double score = sc.nextDouble();
            if (score % 2 == 0){
                sum += score;
                evenScoreCount++;
            }
            count++;
        }
        System.out.println("The average of even scores is " + (sum / evenScoreCount));
    }
}
