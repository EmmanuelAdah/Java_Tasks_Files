import java.util.Scanner;
public class Character_Detector {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your sentence: ");
	String sentence = input.nextLine();

	int uppercaseLetters = 0;
	int smallCases = 0;
	int figures = 0;
	int symbols = 0;
	int spaces = 0;

	for (int i = 0; i < sentence.length(); i++){
		if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z'){
		uppercaseLetters++;
		}
		else if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z'){
		smallCases++;
		}
		else if (sentence.charAt(i) >= '0' &&  sentence.charAt(i) <= '9'){
		figures++;
		}
		else if (sentence.charAt(i) == ' '){
			spaces++;
			}
		else {
		symbols++;
		}
	}
	System.out.printf("Contains;- %nNumber of Uppercase Letters: %d%nNumber of Lowercase Letters: %d%nNumber of Figures: %d%nSymbols and Special characters: %d%nNumber of Spaces: %d%n", uppercaseLetters, smallCases, figures, symbols, spaces);

	}
}