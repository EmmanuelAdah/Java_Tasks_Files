public class Munchies {

	public static int fifthMultiple (int userInput){
		final int five = 5;
		int multiple = userInput * five;
		System.out.println("The fifth multiple of " + userInput + " is " + multiple);
		return multiple;
	}

	public static int primeNumber (){
		int i = 2;
		for ( ; i <= 50; i++);
		   int number = 50;
			if (number % i == 0){
				return i;
			}
			else {
				System.out.println("The first 50 print numbers are: "+ i + " ");
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
		
		System.out.println("Year(s): " + years + ", Months: " + months + ", Days: " + days + ", Minutes: " + minutes + ", Seconds: "+ seconds);

		return years;
	}

	public static int dogAge (String dogsName, int dogAge){
		final int humanYear = 7;
		String dogName = dogsName;
		int dogYears = humanYear * dogAge;
		System.out.println("\nThe dog's name is " + dogName + ", and the age is " + dogYears);
		return humanYear;
	}

	public static int findMultiplesOf7Not5 (){

	int i = 2000;
	for ( ; i <= 3200; i++){
		if (i % 7 == 0 && i % 5 != 0){
		System.out.print(i);
		System.out.print(", ");
		}
	} return i;
	}

	public static int sumOfNumbers (int userInput){

		int usersEntry = userInput;
		int sum = 0;
		while (usersEntry != 0){
			sum += usersEntry % 10;
			usersEntry /= 10;
		}

		System.out.println("The sum of " + userInput + " is " + sum);
		return sum;
	}
	
	public static boolean isLeapYear(int userInput){
	
	int year = userInput;

		if (userInput % 4 == 0){
			System.out.println("True. " + year + " is a leap year");
			return true;
		}
		else{ System.out.print("False. " + year + " is not a leap year");
			return false;}
	}
	
}