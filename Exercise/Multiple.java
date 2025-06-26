import java.util.Scanner;

public class Multiple {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("First integer: ");
int firstInteger = input.nextInt();

System.out.print("Second integer: ");
int secondInteger = input.nextInt();

int i = firstInteger * 3;
int n = secondInteger * 2;

if (i % n>=2){
System.out.print("Result: Fisrt Integer is double the multiple of the Second integer");
}
else{
System.out.print("Result: First Integer is not double the multiple of the Second integer");
}

}
}