import java.util.Scanner;
public class NokiaMenu {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	//Declaring a variable, mainMenu
	String mainMenu = """
		List of menu functions
		Press;-
		1 - for Phone book
		2 - for Messages
		3 - for Chat
		4 - for Call register
		5 - for Tones
		6 - for Settings
		7 - for Call divert
		8 - for Games
		9 - for Calculator
		10 - for Reminder
		11 - for Clock
		12 - for Profiles
		13 - for SIM services

		""";

		String options = """
			Options
			Press;- 
			1 - for Type of view
			2 - for Memory status
			""";

		//Declaring set a global variable
		String set1 = """ 
			Set
			Press;-
			1 - for Message centre number
			2 - for Message sent as
			3 - for Message validity
			""";
	System.out.println(mainMenu);

	System.out.print("Enter selection: ");
	int userInput = input.nextInt();

	switch (userInput){
		case 1: {
		String phoneBook = """
		Phone Book
		Press;-
		1 - for Search
		2 - for Service Nos
		3 - for Add name
		4 - for Erase
		5 - for Edit
		6 - for Assign tone
		7 - for Send b'card
		8 - for Options
		
		""";

		System.out.print(phoneBook);
		System.out.print("Enter selection: ");
		int phoneBookSelect = input.nextInt();

		switch (phoneBookSelect){
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;

			case 8: System.out.print(options); 
			System.out.print("Enter selection: ");
			int optionsSelect = input.nextInt();
		
			switch (optionsSelect){
				case 1: System.out.print("Type of view"); break;
				case 2: System.out.print("Memory status"); break;
			}
		}
		}
		String messages = """
			Messages
			Press;-
		1 - for Write messages
		2 - for Inbox
		3 - for Outbox
		4 - for Picture message
		5 - for Templates
		6 - for Smileys
		7 - for Message settings
		8 - for Info service
		9 - for Voice mailbox number
		10 - for Service command editor

		""";
				
		case 2: System.out.print(messages); 
			System.out.print("Enter selection: ");
			int messageSelect = input.nextInt();

			switch (messageSelect){
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;

			String messageSettings = """
				Message settings
				Press;-
				1 - for Set
				2 - for Common
				""";
			case 7: System.out.print(messageSettings);
			System.out.print("Enter selection: ");
			int messageSetSelect = input.nextInt();

			switch (messageSetSelect){
				case 1: {
					System.out.print(set1);
					System.out.print("Enter selection: ");
					int setSelect = input.nextInt();

					switch (setSelect){

					case 1: System.out.print("Message centre number"); break;
					case 2: System.out.print("Message sent as"); break;
					case 3: System.out.print("Message validity"); break;
					}
					}

				String common = """
					Common
					Press;- 
					1 - for Delivery reports
					2 - for Reply via same centre
					3 - for Character support
					""";

				case 2: System.out.print(common);
					System.out.print("Enter selection: ");
					int commonSelect = input.nextInt();

					switch (commonSelect){

					case 1: System.out.print("Delivery report"); break;
					case 2: System.out.print("Reply via same centre"); break;
					case 3: System.out.print("Character support"); break;	
					}
			}
			case 8: break;
			case 9: break;
			case 10: break;
		}
		case 3: System.out.print("Chat"); break;

		String callRegister = """
			Call Register
			Press;- 
			1 - for Missed calls
			2 - for Received calls
			3 - for Dialled numbers
			4 - for Erase recent call list
			5 - for Show call duration
			""";
		case 4: System.out.print(callRegister);
			System.out.print("Enter selection: ");
			int callRegisterSelect = input.nextInt();

			switch (callRegisterSelect){
			case 1: System.out.print("Missed calls"); break;
			case 2: System.out.print("Received calls"); break;
			case 3: System.out.print("Dialled numbers"); break;
			case 4: System.out.print("Erase recent call list"); break;
			case 5: System.out.print("Show call duration"); break;
			}


		case 5: System.out.print(clock);
			System.out.print("Enter selection: ");
			int clockSelect = input.nextInt();

		case 6: break;
		case 7: System.out.print("Call divert"); break;
		case 8: System.out.print("Games"); break;
		case 9: System.out.print("Calculator"); break;
		case 10: System.out.print("Reminder");break;

		String clock = """
			Clock
			Press;- 
			1 - for Alarm clock
			2 - for Clock settings
			3 - for Date settings
			4 - for Stopwatch
			5 - for Countdown timer
			6 - for Auto update of date and time
			""";
		case 11: System.out.print(clock);
			System.out.print("Enter selection: ");
			int clockSelect = input.nextInt();

			switch (clockSelect){
				case 1: System.out.print("Alarm clock"); break;
				case 2: System.out.print("Clock settings"); break;
				case 3: System.out.print("Date settings"); break;
				case 4: System.out.print("Stopwatch"); break;
				case 5: System.out.print("Countdown timer"); break;
				case 6: System.out.print("Auto update of date and time"); break;
				}

		case 12: System.out.print("Profiles"); break;
		case 13: System.out.print("SIM card services"); break;
	
		}

	}
}
