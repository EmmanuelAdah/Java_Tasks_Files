import java.util.Scanner;
public class Nokia3310Version2 {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	
	String menu = """
		Main Menu
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
		0 > Quit
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
			0 > Back
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
			0 > Back
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
			0 > Back
			""";

		String setting = """
			Settings
			Press;- 
			1 > Call settings
			2 > Phone settings
			3 > Security settings
			4 > Restore factory settings
			0 > Back
			""";
	boolean mainMenu = true;		
	while (mainMenu == true){
	System.out.println(menu);
	System.out.print("Enter selection: ");
	int menuSelect = input.nextInt();

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
		0 > Back

		""";

	String set1 = """ 
		Set
		Press;-
		1 > Message centre number
		2 > Message sent as
		3 > Message validity
		0 > Back
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
		0 > Back
		""";

	switch (menuSelect){
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
		0 > Back
		""";

		String options = """
			Options
			Press;- 
			1 > Type of view
			2 > Memory status
			0 > Back
			""";
		boolean phoneBooks = true;
		while (phoneBooks == true){
		System.out.println(phoneBook);
		System.out.print("Enter selection: ");
		int phoneBookSelect = input.nextInt();

		switch (phoneBookSelect){
			case 1: {
				System.out.println("Search");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int search = input.nextInt();
				if (search == 0); phoneBooks = true;
				} break;

			case 2: {
				System.out.println("Service Nos");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int serviceNos = input.nextInt();
				if (serviceNos == 0); phoneBooks = true;
				} break;

			case 3: {
				System.out.println("Add name");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int addName = input.nextInt();
				if (addName == 0); phoneBooks = true;
				} break;

			case 4: {
				System.out.println("Erase");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int erase = input.nextInt();
				if (erase == 0); phoneBooks = true;
				} break;

			case 5: {
				System.out.println("Edit");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int edit = input.nextInt();
				if (edit == 0); phoneBooks = true;
				} break;

			case 6: {
				System.out.println("Assign tone");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int assignTone = input.nextInt();
				if (assignTone == 0); phoneBooks = true;
				} break;

			case 7: {
				System.out.println("Send b'card");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int sendCard = input.nextInt();
				if (sendCard == 0); phoneBooks = true;
				} break;


			case 8: boolean option = true;
				while (option == true){
				System.out.print(options); 
				System.out.print("Enter selection: ");
				int optionsSelect = input.nextInt();
		
				switch (optionsSelect){
					case 1: {
						System.out.println("Type of view");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int typeOfView = input.nextInt();
						if (typeOfView == 0); option = true;
						} break;

					case 2: {
						System.out.println("Memory status");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int typeOfView = input.nextInt();
						if (typeOfView == 0); option = true;
						} break;
					case 0: option = false;
					}
				}
				break;
			case 9: {
				System.out.println("Speed dials");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int speedDials = input.nextInt();
				if (speedDials == 0); phoneBooks = true;
				} break;

			case 10: {
				System.out.println("Voice tags");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int voiceTags = input.nextInt();
				if (voiceTags == 0); option = true;
				} break;
			case 0: phoneBooks = false;
				
			}
		}
	} break;
			
	case 2: boolean message = true;
		while (message == true){
		System.out.print(messages); 
		System.out.print("Enter selection: ");
		int messageSelect = input.nextInt();

		String messageSettings = """
			Message settings
			Press;-
			1 > Set
			2 > Common
			0 > Back
			""";

		switch (messageSelect){
			case 1: {
				System.out.println("Write messages");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int writeMessage = input.nextInt();
				if (writeMessage == 0); message = true;
				} break;

			case 2: {
				System.out.println("Inbox");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int inbox = input.nextInt();
				if (inbox == 0); message = true;
				} break;

			case 3: {
				System.out.println("Outbox");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int outbox = input.nextInt();
				if (outbox == 0); message = true;
				} break;

			case 4: {
				System.out.println("Picture message");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int pictureMessage = input.nextInt();
				if (pictureMessage == 0); message = true;
				} break;

			case 5: {
				System.out.println("Templates");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int templates = input.nextInt();
				if (templates == 0); message = true;
				} break;

			case 6: {
				System.out.println("Smileys");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int smileys = input.nextInt();
				if (smileys == 0); message = true;
				} break;

			case 7: boolean messageSet = true;
				while (messageSet){
				System.out.print(messageSettings);
				System.out.print("Enter selection: ");
				int messageSetSelect = input.nextInt();

			String common = """
				Common
				Press;- 
				1 > Delivery reports
				2 > Reply via same centre
				3 > Character support
				0 > Back
				""";

			switch (messageSetSelect){
				case 1: {boolean sets1 = true;
					while (sets1 == true){ 
					System.out.print(set1);
					System.out.print("Enter selection: ");
					int setSelect = input.nextInt();

					switch (setSelect){

						case 1: {
							System.out.println("Message centre number");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int messageCentre = input.nextInt();
							if (messageCentre == 0); sets1 = true;
							} break;

						case 2: {
							System.out.println("Message sent as");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int messageSent = input.nextInt();
							if (messageSent == 0); sets1 = true;
							} break;

						case 3: {
							System.out.print("Message validity");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int validity = input.nextInt();
							if (validity == 0); sets1 = true;
							} break;
						case 0: sets1 = false;

						}
					}
				} break;

				case 2: boolean commonSet = true;
					while (commonSet == true){
					System.out.print(common);
					System.out.print("Enter selection: ");
					int commonSelect = input.nextInt();

					switch (commonSelect){

						case 1: {
							System.out.println("Delivery report");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int delivery = input.nextInt();
							if (delivery == 0); commonSet = true;
							} break;

						case 2: {
							System.out.println("Reply via same centre");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int sameCentre = input.nextInt();
							if (sameCentre == 0); commonSet = true;
							} break;

						case 3: {
							System.out.println("Character support");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int character = input.nextInt();
							if (character == 0); commonSet = true;
							} break;
						case 0: commonSet = false;
						}
					} break;
				}
			}
			break;

			case 8: {
				System.out.println("Info service"); 
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int infoService = input.nextInt();
				if (infoService == 0); message = true;
				} break;

			case 9: {
				System.out.println("Voice mailbox number");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int mailbox = input.nextInt();
				if (mailbox == 0); message = true;
				} break;

			case 10: {
				System.out.println("Service command editor");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int commandEditor = input.nextInt();
				if (commandEditor == 0); message = true;
				} break;

			case 0: message = false;
			}
		}
		break;

	case 3: {
		System.out.println("Chat"); 
		System.out.println("0 > Back");
		System.out.println("Enter selection: ");
		int chat = input.nextInt();
		if (chat == 0); mainMenu = true;
		} break;

	case 4: boolean callReg = true;
		while (callReg == true){
		System.out.print(callRegisters);
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
			0 > Back
			""";

		String costSettings = """
			Call cost settings
			Press;- 
			1 > Call cost limit
			2 > Show costs in
			0 > Back
			""";
		
			String callCost = """
				Show call cost
				Press;- 
				1 > Call cost settings
				2 > All calls' cost
				3 > Clear counters
				0 > Back
				""";	
	
		switch (callRegisterSelect){
			case 1: {
				System.out.println("Missed calls");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int missedCalls = input.nextInt();
				if (missedCalls == 0); callReg = true;
				} break;

			case 2: {
				System.out.println("Received calls");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int receivedCalls = input.nextInt();
				if (receivedCalls == 0); callReg = true;
				} break;

			case 3: {
				System.out.println("Dialled numbers");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int dialledNumber = input.nextInt();
				if (dialledNumber == 0); callReg = true;
				} break;

			case 4: {
				System.out.println("Erase recent call list");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int callList = input.nextInt();
				if (callList == 0); callReg = true;
				} break;

			case 5: boolean durations = true;
				while (durations == true){
				System.out.print(callDuration);
				System.out.print("Enter selection: ");
				int callDurationSelect = input.nextInt();

				switch (callDurationSelect){
					case 1: {
						System.out.println("Last call duration");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int lastCall = input.nextInt();
						if (lastCall == 0); durations = true;
						} break;

					case 2: {
						System.out.println("All calls' duration");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int allCalls = input.nextInt();
						if (allCalls == 0); durations = true;
						} break;

					case 3: {
						System.out.println("Received calls' duration");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int callsDuration = input.nextInt();
						if (callsDuration == 0); durations = true;
						} break;

					case 4: {
						System.out.println("Dialled calls' duration");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int dialCalls = input.nextInt();
						if (dialCalls == 0); durations = true;
						} break;

					case 5: {
						System.out.println("Clear timer");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int clearTimer = input.nextInt();
						if (clearTimer == 0); durations = true;
						} break;

					case 0: durations = false;	
					}
				}
				break;

			case 6: boolean costCalls = true;
				while (costCalls == true){
				System.out.print(callCost);
				System.out.print("Enter selection: ");
				int callCostSelect = input.nextInt();

				switch (callCostSelect){
					case 1: {
						System.out.println("Call cost settings");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int callSettings = input.nextInt();
						if (callSettings == 0); costCalls = true;
						} break;

					case 2: {
						System.out.println("All calls' cost");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int allCallsCost = input.nextInt();
						if (allCallsCost == 0); costCalls = true;
						} break;
						
					case 3: {
						System.out.println("Clear counter");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int clearCounter = input.nextInt();
						if (clearCounter == 0); costCalls = true;
						} break;
					case 0: costCalls = false;
					} 
				}
				break;

			case 7: boolean costSets = true;
				while (costSets == true){
				System.out.print(costSettings);
				System.out.print("Enter selection: ");
				int costSettingsSelect = input.nextInt();

				switch (costSettingsSelect){
					case 1: {
						System.out.println("Call cost limit");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int costLimit = input.nextInt();
						if (costLimit == 0); costSets = true;
						} break;

					case 2: {
						System.out.println("Show cost in");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int showCost = input.nextInt();
						if (showCost == 0); costSets = true;
						} break;
					case 0: costSets = false;
					}
				}
				break;
			case 8: {
				System.out.println("Prepaid");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int prepaid = input.nextInt();
				if (prepaid == 0); callReg = true;
				} break;

			case 0: callReg = false;
			}
		}
		break;

	case 5: boolean tone = true;
		while (tone == true){
		System.out.print(tones);
		System.out.print("Enter selection: ");
		int tonesSelect = input.nextInt();

			switch (tonesSelect){
				case 1: {
					System.out.println("Ringing tone");
					System.out.println("0 > Back");
					System.out.println("Enter selection: ");
					int ringingTone = input.nextInt();
					if (ringingTone == 0); tone = true;
					} break;

				case 2: {
					System.out.println("Ringing volume"); 
					System.out.println("0 > Back");
					System.out.println("Enter selection: ");
					int ringingVolume = input.nextInt();
					if (ringingVolume == 0); tone = true;
					} break;

				case 3: {
					System.out.println("Incoming call alert");
					System.out.println("0 > Back");
					System.out.println("Enter selection: ");
					int callAlert = input.nextInt();
					if (callAlert == 0); tone = true;
					} break;

				case 4: {
					System.out.println("Composer");
					System.out.println("0 > Back");
					System.out.println("Enter selection: ");
					int composer = input.nextInt();
					if (composer == 0); tone = true;
					} break;
					
				case 5: {
					System.out.println("Message alert tone");
					System.out.println("0 > Back");
					System.out.println("Enter selection: ");
					int alertTone = input.nextInt();
					if (alertTone == 0); tone = true;
					} break;

				case 6: {
					System.out.println("Keypad tones");
					System.out.println("0 > Back");
					System.out.println("Enter selection: ");
					int keypad = input.nextInt();
					if (keypad == 0); tone = true;
					} break;

				case 7: {
					System.out.println("Warning and game tones");
					System.out.println("0 > Back");
					System.out.println("Enter selection: ");
					int gameTones = input.nextInt();
					if (gameTones == 0); tone = true;
					} break;

				case 8: {
					System.out.println("Vibrating alert");
					System.out.println("0 > Back");
					System.out.println("Enter selection: ");
					int vibrating = input.nextInt();
					if (vibrating == 0); tone = true;
					} break;

				case 9: {
					System.out.println("Screen saver");
					System.out.println("0 > Back");
					System.out.println("Enter selection: ");
					int screenSaver = input.nextInt();
					if (screenSaver == 0); tone = true;
					} 

				case 0: tone = false;
				} 
			}
			break;

	case 6: boolean settings = true;
		while (settings == true){
		System.out.println(setting);
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
			0 > Back
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
			0 > Back
			""";

			switch (settingsSelect){

				case 1: boolean callSets = true;
					while (callSets == true){
					System.out.print(callSettings);
					System.out.print("Enter selection: ");
					int callSettingsSelect = input.nextInt();

				switch (callSettingsSelect){
					case 1: {
						System.out.println("Automatic redial");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int redial = input.nextInt();
						if (redial == 0); callSets = true;
						} break;

					case 2: {
						System.out.println("Speed dialing");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int speedDial = input.nextInt();
						if (speedDial == 0); callSets = true;
						} break;

					case 3: {
						System.out.println("Call waiting options");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int callWaiting = input.nextInt();
						if (callWaiting == 0); callSets = true;
						} break;

					case 4: {
						System.out.println("Own number sending");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int ownNumber = input.nextInt();
						if (ownNumber == 0); callSets = true;
						} break;
						
					case 5: {
						System.out.println("Phone number in use");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int phoneNumber = input.nextInt();
						if (phoneNumber == 0); callSets = true;
						} break;

					case 6: {
						System.out.println("Automatic answer");
						System.out.println("0 > Back");
						System.out.println("Enter selection: ");
						int autoAnswer = input.nextInt();
						if (autoAnswer == 0); callSets = true;
						} break;
					case 0: callSets = false;
					}
					}
					break;

					
				case 2: boolean phoneSet = true;
					while (phoneSet == true){
					System.out.print(phoneSettings);
					System.out.print("Enter selection: ");
					int phoneSettingsSelect = input.nextInt();

					switch (phoneSettingsSelect){
						case 1: {
							System.out.println("Language");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int language = input.nextInt();
							if (language == 0); phoneSet = true;
							} break;

						case 2: {
							System.out.println("Call info display"); 
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int callInfo = input.nextInt();
							if (callInfo == 0); phoneSet = true;
							} break;

						case 3: {
							System.out.println("Welcome note");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int welcome = input.nextInt();
							if (welcome == 0); phoneSet = true;
							} break;

						case 4: {
							System.out.println("Network selection"); 
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int network = input.nextInt();
							if (network == 0); phoneSet = true;
							} break;

						case 5: {
							System.out.print("Lights");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int lights = input.nextInt();
							if (lights == 0); phoneSet = true;
							} break;

						case 6: {
							System.out.println("Confirm SIM service actions");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int confirmSim = input.nextInt();
							if (confirmSim == 0); phoneSet = true;
							} break;
						case 0: phoneSet = false;

						}
					}
					break;

				case 3: boolean securitySet = true;
					while (securitySet == true){
					System.out.print(securitySettings);
					System.out.print("Enter selection: ");
					int securitySettingsSelect = input.nextInt();

					switch (securitySettingsSelect){
						case 1: {
							System.out.println("PIN code request");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int pinCode = input.nextInt();
							if (pinCode == 0); securitySet = true;
							} break;

						case 2: {
							System.out.println("Call barring service");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int callBarring = input.nextInt();
							if (callBarring == 0); securitySet = true;
							} break;

						case 3: {
							System.out.println("Fixed dialing");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int fixed = input.nextInt();
							if (fixed == 0); securitySet = true;
							} break;

						case 4: {
							System.out.println("Closed user group");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int closedUser = input.nextInt();
							if (closedUser == 0); securitySet = true;
							} break;

						case 5: {
							System.out.println("Phone security");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int phoneSec = input.nextInt();
							if (phoneSec == 0); securitySet = true;
							} break;

						case 6: {
							System.out.println("Change access codes");
							System.out.println("0 > Back");
							System.out.println("Enter selection: ");
							int changeAccess = input.nextInt();
							if (changeAccess == 0); securitySet = true;
							} break;
						case 0: securitySet = false;
						}
					}
					break;
				case 4: {
					System.out.println("Restore factory settings");
					System.out.println("0 > Back");
					System.out.println("Enter selection: ");
					int restoreFactory = input.nextInt();
					if (restoreFactory == 0); settings = true;
					} break;
				case 0: settings = false;

				}
		}
		break;

	case 7: {
		System.out.println("Call divert"); 
		System.out.println("0 > Back");
		System.out.println("Enter selection: ");
		int callDivert = input.nextInt();
		if (callDivert == 0); mainMenu = true;
		} break;

	case 8: {
		System.out.println("Games");
		System.out.println("0 > Back");
		System.out.println("Enter selection: ");
		int games = input.nextInt();
		if (games == 0); mainMenu = true;
		} break;

	case 9: {
		System.out.println("Calculator");
		System.out.println("0 > Back");
		System.out.println("Enter selection: ");
		int calculator = input.nextInt();
		if (calculator == 0); mainMenu = true;
		} break;

	case 10: {
		System.out.println("Reminder"); 
		System.out.println("0 > Back");
		System.out.println("Enter selection: ");
		int reminder = input.nextInt();
		if (reminder == 0); mainMenu = true;
		} break;

		
	case 11: boolean clocks = true;
		while (clocks == true){
		System.out.print(clock);
		System.out.print("Enter selection: ");
		int clockSelect = input.nextInt();

		switch (clockSelect){
			case 1: {
				System.out.println("Alarm clock");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int alarmClock = input.nextInt();
				if (alarmClock == 0); clocks = true;
				} break;

			case 2: {
				System.out.println("Clock settings");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int clockSettings = input.nextInt();
				if (clockSettings == 0); clocks = true;
				} break;

			case 3: {
				System.out.println("Date settings");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int dateSettings = input.nextInt();
				if (dateSettings == 0); clocks = true;
				} break;

			case 4: {
				System.out.println("Stopwatch");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int stopwatch = input.nextInt();
				if (stopwatch == 0); clocks = true;
				} break;

			case 5: {
				System.out.println("Countdown timer");
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int countdown = input.nextInt();
				if (countdown == 0); clocks = true;
				} break;

			case 6: {
				System.out.println("Auto update of date and time"); 
				System.out.println("0 > Back");
				System.out.println("Enter selection: ");
				int autoUpdate = input.nextInt();
				if (autoUpdate == 0); clocks = true;
				} break;
			case 0: clocks = false;
			}
		}
		break;

	case 12: {
		System.out.println("Profiles");
		System.out.println("0 > Back");
		System.out.println("Enter selection: ");
		int profiles = input.nextInt();
		if (profiles == 0); mainMenu = true;
		} break;

	case 13: {
		System.out.println("SIM services");
		System.out.println("0 > Back");
		System.out.println("Enter selection: ");
		int simCard = input.nextInt();
		if (simCard == 0); mainMenu = true;
		} break;

	case 0: System.out.println("Goodbye");
		mainMenu = false; break;
	}
	
	}
	}
}
