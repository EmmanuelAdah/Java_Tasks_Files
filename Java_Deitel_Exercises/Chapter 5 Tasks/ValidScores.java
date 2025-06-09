import java.util.Scanner;
public class ValidScores {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Enter a score between 0 and 100");
	int studentScore = 0;

	int invalidScore = 0;
	int validScore = 0;
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int f = 0;

	while (validScore < 10){
		if (studentScore >= 0 && studentScore <= 100){
		System.out.print("Enter score: ");
		studentScore = input.nextInt();
		validScore += 1;
	
		switch (studentScore / 10){
			case 8: a++; break;
			case 9: a++; break;
			case 10: a++; break;
			case 7: b++; break;
			case 6: c++; break;
			case 5: d++; break;
			default: f++; break;
		}
		}
		else if (studentScore < 0 || studentScore > 100){
			invalidScore += 1;
			System.out.print("Invalid score. \nEnter another score: ");
			studentScore = input.nextInt();
		}
	if (studentScore >= 80 && studentScore <= 100) System.out.printf("%d = %s%n", studentScore, "A");
	if (studentScore >= 70 && studentScore < 80) System.out.printf("%d = %s%n", studentScore, "B");
	if (studentScore >= 60 && studentScore < 70) System.out.printf("%d = %s%n", studentScore, "C");
	if (studentScore >= 50 && studentScore < 60) System.out.printf("%d = %s%n", studentScore, "D");
	if (studentScore >= 0 && studentScore < 50) System.out.printf("%d = %s%n", studentScore, "F");
	}
	System.out.printf("Number of valid scores: %d%nNumber of invalid scores: %d%n", validScore, invalidScore);
	System.out.printf("Number of Grade A = : %d%nNumber of Grade B: %d%nNumber of Grade C = %d%nNumber of Grade D = %d%nNumber of Grade F = %d%n", a, b, c, d, f);

	}
}
