public class ThreeByThreeArrays {

	public static void main(String[] args){

	char[][] scores = new char[3][3];

	marks[0][0] = 'X';
	marks[0][1] = 'O';
	marks[0][2] = 'X';

	marks[1][0] = 'O';
	marks[1][1] = 'O';
	marks[1][2] = 'O';

	marks[2][0] = 'X';
	marks[2][1] = 'X';
	marks[2][2] = 'O';


	for (int i = 0; i <= 2; i++){
		for (int d = 0; d <= 2; d++){
		System.out.print(marks[i][d]); 
		System.out.print(" "); 
		}
 		System.out.println();
		}
	}
}