public class ThreeByThreeArrays {

	public static void main(String[] args){

	char[][] scores = new char[3][3];

	mark[0][0] = 'X';
	mark[0][1] = 'O';
	mark[0][2] = 'X';

	mark[1][0] = 'O';
	mark[1][1] = 'O';
	mark[1][2] = 'O';

	mark[2][0] = 'X';
	mark[2][1] = 'X';
	mark[2][2] = 'O';

	int count = 0;
	for (int i = 0; i <= 2; i++){
		System.out.print(mark[count][i]); 
		System.out.print(" "); 
		}
 		System.out.println();
		
		count++;
		for (int d = 0; d <= 2; d++){
		System.out.print(mark[count][d]);
		System.out.print(" ");
		}
		System.out.println();

		count++;
		for (int q = 0; q <= 2; q++){
		System.out.print(mark[count][q]);
		System.out.print(" ");
		}
		System.out.println();
	}
}