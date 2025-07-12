package bankAcount;
import java.util.Scanner;

public class AccountMain {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        Account account = new Account();
        GtBank gtBank = new GtBank();

        String accountMenu = """
                Welcome to Mobile Banking
                Press :-
                1 > Balance
                2 > Deposit
                3 > Withdraw
                4 > Transfer
                5 > Exit
                """;
        boolean transaction = true;
        while (transaction) {
            System.out.printf("%s%nEnter selection: ",accountMenu);
            int choice = input.nextInt();
            switch (choice) {
                case 1: System.out.println("Your balance is: " + account.getBalance()); break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = input.nextInt();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = input.nextInt();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter amount to transfer: ");
                    int amount = input.nextInt();

                    System.out.print("Enter account number: ");
                    int accountNumber = input.nextInt();

                    System.out.print("Enter pin: ");
                    int pin = input.nextInt();

                        if (accountNumber == gtBank.getAccountNumber()) {
                            if (account.getPin() == pin) {
                                account.withdraw(amount);
                                gtBank.deposit(amount);
                            } System.out.println("Incorrect Pin! Try again!");
                        } System.out.println("Account number not found");
                        break;

                case 5: System.out.print("Good bye!...");  transaction = false;

                default:
                    break;
            }
        }
    }
}
