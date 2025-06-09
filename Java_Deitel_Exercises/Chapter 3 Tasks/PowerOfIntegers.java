import java.util.Scanner;

public class PowerOfIntegers {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("N \tN\u00b2 \tN\u00b3 \tN\u00b4");

for (int i = 1; i <= 5; i++){
System.out.println(i + "\t" + i * i + "\t" + i * i * i + "\t" + i * i * i * i);
}

}
}