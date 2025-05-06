public class UniqueValue {

	public static int uniqueNumbers (int user0, int user1, int user2, int user3, int user4, int user5) {

	int[] scores = new int[6];
	scores[0] = user0; scores[1] = user1; scores[2] = user2; scores[3] = user3; scores[4] = user4; scores[5] = user5;

		int i = 0;
		int integer = scores[i];
		int d = 0;
		int integer1 = scores[d];

		int counter = 0;
	
		for ( ; i < 6; ){
			integer = scores[i];
			i++;
			System.out.print(integer);
			for ( ; d < 6; d++){
			integer = scores[d];
			if (integer == integer){
			counter += 1;
				if (counter == 1){
				System.out.print(integer);
				}
			}
			}
		
		}
	 return integer;
	}

}