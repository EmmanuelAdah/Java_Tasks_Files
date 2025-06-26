import java.util.Scanner;

public class Assignment {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter ten integers: ");
int x = input.nextInt();

int sum = 0;
int counter = 1;

while (counter <= 10){
counter += 1;
sum += counter;

}

System.out.print(sum);
}
}