import java.util.Scanner;

public class NumberSpacing {

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
/*	int[] integer = new int[5];
	for(int i = 5-1; i >= 0; i--){

	System.out.print("Enter five number: ");
	integer[i] = input.nextInt();

		}
	for(int i = 5-1; i >= 0; i--){

	System.out.print(integer[i] + "   ");
	}
*/
	System.out.print("Enter five number: ");
	int number = input.nextInt();
	
	String strNumber = Integer.toString(number);
	if(strNumber.length() == 5){	
		for(int i = 0; i <= 5 -1; i++){
		System.out.print(strNumber.charAt(i) + "   ");	
	}
	}
	if(strNumber.length() < 5){System.out.print("the number inputed is less than 5");	}
	if(strNumber.length() > 5){System.out.print("the number inputed is more than 5");	}
}
}