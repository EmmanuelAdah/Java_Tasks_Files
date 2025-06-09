import java.util.Scanner;
public class Nokia3310Menu {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	//Declaring a variable, mainMenu
	String mainMenu = """
		List of Menu functions
		Press;-
		1 > Phone book
		2 > Messages
		3 > Chat
		4 > Call register
		5 > Tones
		6 > Settings
		7 > Call divert
		8 > Games
		9 > Calculator
		10 > Reminder
		11 > Clock
		12 > Profiles
		13 > SIM services

		""";

		String clock = """
			Clock
			Press;- 
			1 > Alarm clock
			2 > Clock settings
			3 > Date settings
			4 > Stopwatch
			5 > Countdown timer
			6 > Auto update of date and time
			""";

		
		String tones = """
			Tones
			Press;- 
			1 > Ringing tone
			2 > Ringing volume
			3 > Incoming call alert
			4 > Composer
			5 > Message alert tone
			6 > Keypad tones
			7 > Warning and game tones
			8 > Vibrating alert
			9 > Screen saver
			""";

		String securitySettings = """
			Security settings
			Press;- 
			1 > PIN code request
			2 > Call barring service
			3 > Fixed dialing
			4 > Closed user group
			5 > Phone security
			6 > Change access codes
			""";

		String setting = """
			Settings
			Press;- 
			1 > Call settings
			2 > Phone settings
			3 > Security settings
			4 > Restore factory settings
			""";
		
	System.out.println(mainMenu);
	System.out.print("Enter selection: ");
	int userInput = input.nextInt();

	String messages = """
		Messages
		Press;-
		1 > Write messages
		2 > Inbox
		3 > Outbox
		4 > Picture message
		5 > Templates
		6 > Smileys
		7 > Message settings
		8 > Info service
		9 > Voice mailbox number
		10 > Service command editor

		""";

	String set1 = """ 
		Set
		Press;-
		1 > Message centre number
		2 > Message sent as
		3 > Message validity
		""";

	String callRegisters = """
		Call Register
		Press;- 
		1 > Missed calls
		2 > Received calls
		3 > Dialled numbers
		4 > Erase recent call list
		5 > Show call duration
		6 > Show call cost
		7 > Call cost settings
		8 > Prepaid credit
		""";

	switch (userInput){
	case 1: {
	String phoneBook = """
		Phone Book
		Press;-
		1 > Search
		2 > Service Nos
		3 > Add name
		4 > Erase
		5 > Edit
		6 > Assign tone
		7 > Send b'card
		8 > Options
		9 > Speed dials
		10 > Voice tags
		
		""";

		String options = """
			Options
			Press;- 
			1 > Type of view
			2 > Memory status
			""";

		System.out.println(phoneBook);
		System.out.print("Enter selection: ");
		int phoneBookSelect = input.nextInt();

		switch (phoneBookSelect){
			case 1: System.out.print ("Search"); break;
			case 2: System.out.print("Service Nos"); break;
			case 3: System.out.print("Add name"); break;
			case 4: System.out.print("Erase"); break;
			case 5: System.out.print("Edit"); break;
			case 6: System.out.print("Assign tone"); break;
			case 7: System.out.print("Send b'card"); break;

			case 8: System.out.print(options); 
				System.out.print("Enter selection: ");
				int optionsSelect = input.nextInt();
		
				switch (optionsSelect){
					case 1: System.out.println("Type of view"); break;
					case 2: System.out.println("Memory status"); break;
			}
				break;
			case 9: System.out.println("Speed dials"); break;
			case 10: System.out.println("Voice tags"); break;
		}
		break;
		}
			
	case 2: System.out.print(messages); 
		System.out.print("Enter selection: ");
		int messageSelect = input.nextInt();

		String messageSettings = """
			Message settings
			Press;-
			1 > Set
			2 > Common
			""";

		switch (messageSelect){
			case 1: System.out.print("Write messages"); break;
			case 2: System.out.print("Inbox"); break;
			case 3: System.out.print("Outbox"); break;
			case 4: System.out.print("Picture message"); break;
			case 5: System.out.print("Templates"); break;
			case 6: System.out.print("Smileys"); break;

			case 7: System.out.print(messageSettings);
			System.out.print("Enter selection: ");
			int messageSetSelect = input.nextInt();

			String common = """
				Common
				Press;- 
				1 > Delivery reports
				2 > Reply via same centre
				3 > Character support
				""";

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
					break;
					}

				case 2: System.out.print(common);
					System.out.print("Enter selection: ");
					int commonSelect = input.nextInt();

					switch (commonSelect){

					case 1: System.out.print("Delivery report"); break;
					case 2: System.out.print("Reply via same centre"); break;
					case 3: System.out.print("Character support"); break;	
					}
			}
			break;

			case 8: System.out.print("Info service"); break;
			case 9: System.out.print("Voice mailbox number"); break;
			case 10: System.out.print("Service command editor"); break;
		}
		break;
	case 3: System.out.print("Chat"); 
		break;
	case 4: System.out.print(callRegisters);
		System.out.print("Enter selection: ");
		int callRegisterSelect = input.nextInt();
		
		String callDuration = """
			Show call duration
			Press;- 
			1 > Last call duration
			2 > All calls' duration
			3 > Received calls' duration
			4 > Dialled calls' duration
			5 > Clear timer
			""";

		String costSettings = """
			Call cost settings
			Press;- 
			1 > Call cost limit
			2 > Show costs in
			""";
		
			String callCost = """
				Show call cost
				Press;- 
				1 > Call cost settings
				2 > All calls' cost
				3 > Clear counters
				""";	
	
		switch (callRegisterSelect){
			case 1: System.out.print("Missed calls"); break;
			case 2: System.out.print("Received calls"); break;
			case 3: System.out.print("Dialled numbers"); break;
			case 4: System.out.print("Erase recent call list"); break;

			case 5: System.out.print(callDuration);
				System.out.print("Enter selection: ");
				int callDurationSelect = input.nextInt();

			switch (callDurationSelect){
				case 1: System.out.print("Last call duration"); break;
				case 2: System.out.print("All calls' duration"); break;
				case 3: System.out.print("Received calls' duration"); break;
				case 4: System.out.print("Dialled calls' duration"); break;
				case 5: System.out.print("Clear timer"); break;
				}
				break;
			case 6: System.out.print(callCost);
				System.out.print("Enter selection: ");
				int callCostSelect = input.nextInt();

			switch (callCostSelect){
				case 1: System.out.print("Call cost settings"); break;
				case 2: System.out.print("All calls' cost"); break;
				case 3: System.out.print("Clear counter"); break;
				} 
				break;
			case 7: System.out.print(costSettings);
				System.out.print("Enter selection: ");
				int costSettingsSelect = input.nextInt();

				switch (costSettingsSelect){
					case 1: System.out.print("Call cost limit"); break;
					case 2: System.out.print("Show cost in"); break;
					}
				break;
			case 8: System.out.print("Prepaid"); break;
			}
			break;
	case 5: System.out.print(tones);
		System.out.print("Enter selection: ");
		int tonesSelect = input.nextInt();

			switch (tonesSelect){
				case 1: System.out.print("Ringing tone"); break;
				case 2: System.out.print("Ringing volume"); break;
				case 3: System.out.print("Incoming call alert"); break;
				case 4: System.out.print("Composer"); break;
				case 5: System.out.print("Message alert tone"); break;
				case 6: System.out.print("Keypad tones"); break;
				case 7: System.out.print("Warning and game tones"); break;
				case 8: System.out.print("Vibrating alert"); break;
				case 9: System.out.print("Screen saver"); break;
				} 
				break;

	case 6: System.out.println(setting);
		System.out.print("Enter selection: ");
		int settingsSelect = input.nextInt();
			
		String phoneSettings = """
			Phone settings
			Press;- 
			1 > Language
			2 > Call info display
			3 > Welcome note
			4 > Network selection
			5 > Lights
			6 > Confirm SIM service actions
			""";

		String callSettings = """
			Call settings
			Press;- 
			1 > Automatic redial
			2 > Speed dialing
			3 > Call waiting options
			4 > Own number sending
			5 > Phone number in use
			6 > Automatic answer
			""";

			switch (settingsSelect){
				case 1: System.out.print(callSettings);
					System.out.print("Enter selection: ");
					int callSettingsSelect = input.nextInt();

				switch (callSettingsSelect){
					case 1: System.out.print("Automatic redial"); break;
					case 2: System.out.print("Speed dialing"); break;
					case 3: System.out.print("Call waiting options"); break;
					case 4: System.out.print("Own number sending"); break;
					case 5: System.out.print("Phone number in use"); break;
					case 6: System.out.print("Automatic answer"); break;
					}
					break;

					
				case 2: System.out.print(phoneSettings);
					System.out.print("Enter selection: ");
					int phoneSettingsSelect = input.nextInt();

					switch (phoneSettingsSelect){
						case 1: System.out.print("Language"); break;
						case 2: System.out.print("Call info display"); break;
						case 3: System.out.print("Welcome note"); break;
						case 4: System.out.print("Network selection"); break;
						case 5: System.out.print("Lights"); break;
						case 6: System.out.print("Confirm SIM service actions"); break;
						}
						break;
				case 3: System.out.print(securitySettings);
					System.out.print("Enter selection: ");
					int securitySettingsSelect = input.nextInt();

					switch (securitySettingsSelect){
						case 1: System.out.print("PIN code request"); break;
						case 2: System.out.print("Call barring service"); break;
						case 3: System.out.print("Fixed dialing"); break;
						case 4: System.out.print("Closed user group"); break;
						case 5: System.out.print("Phone security"); break;
						case 6: System.out.print("Change access codes"); break;
						}
						break;
				case 4: System.out.print("Restore factory settings"); break;
				}
				break;

	case 7: System.out.println("Call divert"); break;
	case 8: System.out.println("Games"); break;
	case 9: System.out.print("Calculator"); break;
	case 10: System.out.print("Reminder"); break;

		
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
			break;

	case 12: System.out.print("Profiles"); break;
	case 13: System.out.print("SIM card services"); break;
	
	}

	}
}
