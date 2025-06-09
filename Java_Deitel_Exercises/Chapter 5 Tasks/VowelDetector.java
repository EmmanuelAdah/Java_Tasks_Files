import java.util.Scanner;
public class VowelDetector {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your sentence: ");
	String sentence = input.nextLine();

	String vowels = "aeiou";
	int vowelCount = 0;

	for (int index = 0; index < vowels.length(); index++){
		for (int count = 0; count < sentence.length(); count++){
			if (vowels.charAt(index) == sentence.charAt(count)) vowelCount += 1;		
		}
	}
	if (vowelCount > 0){
		System.out.printf("The number of vowels is %d.%n", vowelCount);
		}
	else {
		System.out.print("No vowel in the sentence.");
		}
	}
}