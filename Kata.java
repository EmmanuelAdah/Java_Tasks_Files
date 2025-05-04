public class Kata {

	public static boolean isEven (int firstInteger){
		Boolean even = true;
		if (firstInteger % 2 == 0){
			return even = true;
		}
		else {
			return even = false;
		}
		
	} 
	public static boolean isPrime (int firstInteger){
		for (int i = 2; i <= Math.sqrt(firstInteger); i++){
			if (firstInteger % i == 0){
				return false;
			}	
		}
		return true;
	}
	public static int subtract (int firstInteger, int secondInteger){
		int difference = firstInteger - secondInteger;
		System.out.println(Math.abs(difference));
		return Math.abs(difference);

	}
	public static float divide (float firstInteger, float secondInteger){
		int division = (int)(firstInteger / secondInteger);
			System.out.println("The quotient of " + firstInteger + " / " + secondInteger + " is " + (division));
			return Math.abs(division);
	}
	public static int factorOf (int firstInteger){
		System.out.print("The factors of " + firstInteger + " is " );
		int i = 1;
		for ( ; i < firstInteger; i++){
			if (firstInteger % i == 0)
			System.out.print(i + ", ");
		}
		return i;
	}
	public static boolean isSquare (int firstInteger){
		int i = 1;
		for ( ; i <= 999; i++){
			int squareOf = (i * i);
			if (firstInteger == squareOf){
			return true;
			}
		} 
		return false;	
	} 

/*
	public static int isPalindrome (int firstInteger){
		
	}  
*/
	public static int factorialOf (int firstInteger){
		int factorial = 1;
		for (int i = 1; i <= firstInteger; i++){
			factorial *= i;
		}
		System.out.println("\nThe factorial of " + firstInteger + " is " + factorial);
		return factorial;
	}
	public static int squareOf (int firstInteger){
		int squareNum = (firstInteger * firstInteger);
		System.out.println("The square of " + firstInteger + " is " + squareNum);
		return squareNum;
	}

}