import java.util.Scanner;
public class CreditCardValidator {

	public static String cardValidity(String myCardNumber){

	String cardNumber = myCardNumber.replaceAll("\\s+", "");

	boolean cardValid = false;

		if (cardNumber.charAt(0) > '2' && cardNumber.charAt(0) < '7'){
			if (cardNumber.length() >= 13 && cardNumber.length() <= 16){

				if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) != '7'){
				cardValid = false;
				}else {
				cardValid = true;
				}
			}else {
				cardValid = false;
				}
		} else {
			cardValid = false;
			}
	String validity = (cardValid) ? "Valid" : "Invalid";
	return validity;
	}

	public static String myCardNumber(String myCardNumber){
	String myNumber = myCardNumber.replaceAll("\\s+", "");

	if (myNumber.length() <13 || myNumber.length() > 16) myNumber = "Invalid";

	for (int index = 0; index < myNumber.length(); index++){
		if (myNumber.charAt(index) < '0' || myNumber.charAt(index) > '9' &&  myNumber.charAt(index) != ' '){
			myNumber = "Invalid";
		} 
		if (myNumber == "Invalid") break;
	}
	return myNumber;
	}

	public static String creditCardType(String myCardNumber){
	String cardType = "";
	String cardNumber = myCardNumber.replaceAll("\\s+", "");

	for (int index = 0; index < cardNumber.length(); index++){
		if (cardNumber.charAt(index) < '0' || cardNumber.charAt(index) > '9' &&  cardNumber.charAt(index) != ' '){
			cardType = "Invalid";
			break;
			}
		}
	if (cardNumber.length() >= 13 && cardNumber.length() <= 16 && cardType != "Invalid"){
		if (cardNumber.charAt(0) == '4'){
			cardType = "VisaCard";
		} else if (cardNumber.charAt(0) == '5'){
			cardType = "MasterCard";
		} else if (cardNumber.charAt(0) == '6'){
			cardType = "DiscoverCard";
		} else if (cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7'){
			cardType = "AmericanExpressCard";
		} else { cardType = "Invalid Card"; }
	} else { 
		cardType = "Invalid Card";
	}
	return cardType;
	}

	public static String validityStatus(String myCardNumber){
	int sumOfEven = 0;  
	int sumOfOdd = 0;
	String cardNumber = myCardNumber.replaceAll("\\s+", "");

	String validator = "";

	try{
		for (int index = cardNumber.length() - 1; index >= 0; index--){
				sumOfOdd += Integer.parseInt(String.valueOf(cardNumber.charAt(index)));
	
				if (index > 0) index -= 1;
				int multiple = Integer.parseInt(String.valueOf(cardNumber.charAt(index))) * 2;

				if (multiple > 9){
					int firstDigit = multiple / 10;  
					int secondDigit =  multiple % 10;
					sumOfEven += (firstDigit + secondDigit);	
				} else {
					sumOfEven += multiple;
				}
			}
		} catch (NumberFormatException e){
			validator = "Invalid card format";
		}
	int total = sumOfEven + sumOfOdd;

	validator = (total % 10 == 0 && total != 0) ? "Valid" : "Invalid";
	return validator;
	}


	public static int cardNumberLength(String myCardNumber){
	String cardNumber = myCardNumber.replaceAll("\\s+", "");

	int digitLength = cardNumber.length();

	return digitLength;
	}



	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter card number to verify: ");
	String myCardNumber = input.nextLine();

	String stars = "";
	for (int index = 0; index < 42; index++){  stars += "*"; } 
	System.out.println(stars);

	System.out.println("** Credit Card Type: " + creditCardType(myCardNumber));
	System.out.println("** Credit Card Number: " + myCardNumber(myCardNumber));
	System.out.println("** Credit Card Digit Length: " + cardNumberLength(myCardNumber));
	System.out.println("** Credit Card Validity Status: " + validityStatus(myCardNumber));
	System.out.println(stars);
	}	
}

