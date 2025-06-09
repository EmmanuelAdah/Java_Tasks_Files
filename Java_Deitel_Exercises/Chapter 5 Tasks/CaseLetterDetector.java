import java.util.Scanner;
public class CaseLetterDetector {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your sentence: ");
	String sentence = input.nextLine();

		int bigLettersCount = 0;
		int smallLettersCount = 0;
		for(int index = 0; index < sentence.length(); index++){
			if (sentence.charAt(index) >= 'A' && sentence.charAt(index) <= 'Z'){
			bigLettersCount += 1;
			}
			if (sentence.charAt(index) >= 'a' && sentence.charAt(index) <= 'z'){
			smallLettersCount += 1;
			}
		}
	System.out.printf("There are %d uppercase and %d lowercase letter(s) in \"%s\".%n", bigLettersCount, smallLettersCount, sentence);
	}
}