import java.util.Scanner;

public class ArithmeticCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String options = """
            Press;
            1 > Addition
            2 > Subtraction
            3 > Multiplication
            4 > Division
            0 > Quit
            """;

        boolean option = true;

        while (option) {
            System.out.println(options);
            System.out.print("Make selection to start: ");
            int userOption = input.nextInt();

            switch (userOption) {
                case 1: { // Addition
                    int total = 0;
                    System.out.println("Enter integers to add. Type -1 to stop: ");
                    int userNumber = input.nextInt();
                    while (userNumber != -1) {
                        total += userNumber;
                        System.out.print("Enter integer: ");
                        userNumber = input.nextInt();
                    }
                    System.out.printf("Total: %d%n", total);
                    option = continueOperation(input);
                    break;
                }
                case 2: { // Subtraction
                    int total = 0;
                    System.out.println("Enter integers to subtract. Type -1 to stop: ");
                    int userNumber = input.nextInt();
                    while (userNumber != -1) {
                        total -= userNumber;
                        System.out.print("Enter integer: ");
                        userNumber = input.nextInt();
                    }
                    System.out.printf("Total: %d%n", total);
                    option = continueOperation(input);
                    break;
                }
                case 3: { // Multiplication
                    int total = 1; // Initial value for multiplication
                    System.out.println("Enter integers to multiply. Type -1 to stop: ");
                    int userNumber = input.nextInt();
                    while (userNumber != -1) {
                        total *= userNumber;
                        System.out.print("Enter integer: ");
                        userNumber = input.nextInt();
                    }
                    System.out.printf("Total: %d%n", total);
                    option = continueOperation(input);
                    break;
                }
                case 4: { // Division
                    System.out.print("Enter the first integer (non-zero): ");
                    int total = input.nextInt();
                    while (total == 0) {
                        System.out.print("Division by zero is not allowed. Enter a non-zero integer: ");
                        total = input.nextInt();
                    }
                    System.out.println("Enter integers to divide. Type -1 to stop: ");
                    int userNumber = input.nextInt();
                    while (userNumber != -1) {
                        if (userNumber == 0) {
                            System.out.println("Division by zero is not allowed.");
                        } else {
                            total /= userNumber;
                        }
                        System.out.print("Enter integer: ");
                        userNumber = input.nextInt();
                    }
                    System.out.printf("Total: %d%n", total);
                    option = continueOperation(input);
                    break;
                }
                case 0: { // Quit
                    System.out.println("Goodbye!");
                    option = false;
                    break;
                }
                default: {
                    System.out.println("Invalid selection! Try again.");
                }
            }
        }

        input.close();
    }

    private static boolean continueOperation(Scanner input) {
        System.out.printf("Would you like to perform another arithmetic operation? (1 for Yes, 2 for No): ");
        int back = input.nextInt();
        return back == 1;
    }
}