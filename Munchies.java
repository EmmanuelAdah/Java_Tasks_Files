public class Munchies {

	public static int fifthMultiple (int userInput){
		final int five = 5;
		int multiple = userInput * five;
		System.out.print("The fifth multiple of " + userInput + " is " + multiple);
		return multiple;
	}

	public static int primeNumber (){
		int i = 2;
		for ( ; i <= 50; i++);
		final int number = 50;
			if (number % i == 0){
				return i;
			}
			else {
				System.out.print("The first 50 print numbers are: "+ i + " ");
			}
			return i;
	}

	public static int ageYears (int userInput){
		final int daysPerYear = 365;
		final int monthsPerYear = 12;
		int years = userInput;
		int months = years * monthsPerYear;
		int days = years * daysPerYear;
		int minutes = 60 * 24 * daysPerYear * years;
		int seconds = 60 * 60 * 24 * daysPerYear * years;
		
		System.out.print("Year(s): " +years + ", Months: " + months + ", Days: " + days + ", Minutes: " + minutes + ", Seconds: "+ seconds);

		return years;
	}
	
	public static int sumOfNumbers (int userInput){

		int firstDigit = userInput / 1000;
		int secondDigit = userInput / 100 % 10;
		int thirdDigit = userInput / 10 % 10;
		int fourthDigit = userInput % 10;

		int sum = (firstDigit + secondDigit + thirdDigit + fourthDigit);
		System.out.print("The sum of " + userInput + "is " + sum);
		
		return sum;
	}

	

}