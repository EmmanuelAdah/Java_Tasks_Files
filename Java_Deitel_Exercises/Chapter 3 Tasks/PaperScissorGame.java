import java.util.Random;
import java.util.Scanner;

public class PaperScissorGame {

public static void main(String[] args){

Random random = new Random();

int min = 0;
int max = 2;

int randomNumber = min + (int)(Math.random() * ((max - min) + 1));

System.out.println("Random Number: " + randomNumber);

Scanner input = new Scanner(System.in);

System.out.println("Enter number 0 or 1: ");
int integer = input.nextInt();

int scissor = 0;
int rock = 1;
int paper =2;

if (randomNumber == 0 && integer == 0){
System.out.printf("The computer is %s. You are %s too. It's a draw", scissor , scissor);
}
if (randomNumber == 1 && integer == 1){
System.out.printf("The computer is %s. You are %s too. It's a draw", rock, rock);
}
if (randomNumber == 2 && integer == 2){
System.out.printf("The computer is %s. You are %s too. It's a draw", paper, paper);
}
if (randomNumber == 0 && integer == 1){
System.out.printf("The computer is %s. You are %s . You won", scissor, rock);
}
if (randomNumber == 0 && integer == 2){
System.out.printf("The computer is %s. You are %s . The computer won", scissor, paper);
}
if (randomNumber == 1 && integer == 2){
System.out.printf("The computer is %s. You are %s . You won", paper);
}
if (randomNumber == 1 && integer == 2){
System.out.printf("The computer is %s. You are %s . You won", paper);
}
if (randomNumber == 2 && integer == 0){
System.out.printf("The computer is %s. You are %s . You won", paper, scissor);
}
if (randomNumber == 2 && integer == 1){
System.out.printf("The computer is %s. You are %s too. The computer won", rock);
}else {
System.out.print("Input is invalid");
}

}
}