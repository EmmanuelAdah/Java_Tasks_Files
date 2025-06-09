public class PossibleTwoDigits {

	public static void main(String[] args){
	
	int i = 10;
	for ( ; i < 100; i++){

	int firstDigit = i / 10;
	int secondDigit = i % 10;

	System.out.print(secondDigit);

	int num = 0;
	int firstNum = num / 10;
	int secondNum = num % 10;

	for ( ; num <= 9; num++){
	System.out.println(secondNum);
	}
	
	}
	}

}