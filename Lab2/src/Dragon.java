import java.util.Scanner;

public class Dragon {

	public static void main(String[] args) {

		int state = 1;
		boolean play = true;
		String playerName;
		String playGame = "";
		String decision = "";
		String dragonName = "";
		int numberOfHeads = 0;
		String weapon = "";
		String eyeColor = "";
		//String activeState = "";

		Scanner scan1 = new Scanner(System.in);

		System.out.println("Welcome!  What is your name? (Enter your name.)");
		playerName = scan1.nextLine();
		System.out.println("Hello " + playerName + ". Let's play \"Choose Your Own Adventure.\"");
		
		while (play) {

			switch (state) {
			case 1:
				System.out.println("Would you like to play the game? (enter \"yes\" or \"no\")");
				
				playGame = scan1.nextLine();
				
				if (playGame.equalsIgnoreCase("no")) {
					System.out.println("Have a good day.");
					play = false;
				} else if (playGame.equalsIgnoreCase("yes")) {
					state = 2;
				} else {
					System.out.println("Try again!");
					state = 1;
				}

				break;
			case 2:
				System.out
						.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon! "
								+ "\nWhat would you do? Enter \"face the beast\" or \"run away\"");
				
				decision = scan1.nextLine();

				if (decision.equalsIgnoreCase("run away")) {
					System.out.println("Run fast!");
					play = false;
				} else if (decision.equalsIgnoreCase("face the beast")) {
					state = 3;
				} else {
					System.out.println("Try again!");
					state = 2;
				}
				break;
			case 3:
				System.out.println(
						"You approach the dragon. You see that he has ___ heads. \n(Enter \"1\" or \"2\" or \"3\".)");

				numberOfHeads = scan1.nextInt();

				if (numberOfHeads == 1) {
					state = 4;
				} else if (numberOfHeads == 2) {
					state = 4;
				} else if (numberOfHeads == 3) {
					state = 4;
				} else {
					System.out.println("Try again!");
					state = 3;
				}
				scan1.nextLine();
				break;
			case 4:
				System.out.println("No one has every faced a " + numberOfHeads + "-headed Dragon before! "
						+ "\nChoose your weapon. (Enter \"slingshot\" or \"sword\" or \"bow and arrow\")");

				weapon = scan1.nextLine();

				if (weapon.equalsIgnoreCase("slingshot")) {
					state = 5;
				} else if (weapon.equalsIgnoreCase("sword")) {
					state = 5;
				} else if (weapon.equalsIgnoreCase("bow and arrow")) {
					state = 5;
				} else {
					System.out.println("Try again!");
					state = 4;
				}

				break;

			case 5:
				System.out.println("Armed with your " + weapon
						+ ", you approach the dragon. You can feel its fiery breath as you get closer.  "
						+ "\nIt stares at you with its ___ eyes. (Enter \"Red\" or \"Blue\" )");

				eyeColor = scan1.nextLine();

				if (eyeColor.equals("Red")) {
					state = 6;
				} else if (eyeColor.equals("Blue")) {
					state = 6;
				} else {
					System.out.println("Make sure you capitalize the first letter.");
					state = 5;
				}
				break;
			case 6:
				System.out.println("Oh thank goodness! " + eyeColor
						+ "-eyed dragons are friendly. You pet it and become friends.  You name the dragon ____. (Enter a name)");
				
				dragonName = scan1.nextLine();
				
				System.out.println(playerName + " and " + dragonName + " live happily ever after.");
				System.out.println("");
				play = false;
				break;
				
			default:
				System.out.println("Error. Start over");
				state = 1;
				break;
			}

		}

		if (playGame.equalsIgnoreCase("yes")) {
			System.out.println(
					"Here's your story: \nYou are walking across a field and you encounter a fire-breathing dragon! You decide to "
							+ decision + ".");

			if (decision.equalsIgnoreCase("run away")) {
				System.out.println("Scardy cat!");
			} else {
				System.out.println("You approach the dragon. You see that he is a " + numberOfHeads + "-headed dragon. "
						+ "No one has every faced a " + numberOfHeads
						+ "-headed dragon before! \nYou reach in your bag and grab your " + weapon
						+ ". Armed with your " + weapon
						+ ", you approach the dragon. \nYou can feel its fiery breath as you get closer.  "
						+ "It stares at you with its " + eyeColor.toLowerCase() + " eyes. \nOh thank goodness! "
						+ eyeColor + "-eyed dragons are friendly. You pet it and become "
						+ "friends.  \nYou name the dragon " + dragonName + ". " + playerName + " and " + dragonName
						+ " live happily ever after.");
			}
		} else {
			System.out.println("");
		}
	}
}
