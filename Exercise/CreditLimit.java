import java.util.Scanner;

public class CreditLimit {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter Account Number: ");
int accountNumber = input.nextInt();

System.out.println("Enter Credit Amount: ");
int credits = input.nextInt();

int total = 0;
int counter = 1;

while (counter >= 0){
counter += 1;
total += credits;
System.out.println("Enter Credit Amount: ");
credits = input.nextInt();

}

}
}