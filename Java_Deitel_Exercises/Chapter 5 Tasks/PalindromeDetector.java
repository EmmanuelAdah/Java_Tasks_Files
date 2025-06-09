import java.util.Scanner;
public class PalindromeDetector {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the word: ");
	String word = input.nextLine();

	String reversedWord = "";

	for (int index = word.length() - 1; index  >= 0; index--){
		reversedWord += word.charAt(index);	
		}
			System.out.println(reversedWord);
	if (word == reversedWord){
		System.out.printf("%s is a palindrome", word);
		}
	else {
		System.out.printf("%s is not a palindrome", word);
		}
	}
}