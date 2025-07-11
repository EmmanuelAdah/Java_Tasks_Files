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
            int choice = input.nextInt();
            switch (choice) {
                case 1: System.out.println(account.getBalance());
                case 2: {
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = input.nextInt();
                    account.deposit(depositAmount);
                }
                case 3: {
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = input.nextInt();
                    account.withdraw(withdrawAmount);
                }
                case 4: {
                    System.out.print("Enter amount to transfer: ");
                    int amount = input.nextInt();

                    System.out.print("Enter account number: ");
                    int accountNumber = input.nextInt();

                    System.out.print("Enter pin: ");
                    String pin = input.next();
                }
                case 5: {
                    transaction = false;
                }
            }
        }
    }
}
