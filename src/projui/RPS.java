package projui;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RPS {
public static String choose = "";
static String bot = "";
	public static void random(int random, String bot) {

		if (random == 1)
			bot = "Rock";
		else if (random == 2)
			bot = "Paper";
		else if (random == 3)
			bot = "Scissors";
	}

	public static void printWin() {
		System.out.println("You win!");
                messageAlert("You win!");                
	}

	public static void printLose() {
		System.out.println("You lose!");
                messageAlert("You lose!");

	}

	public static void main(String[] args) {
            StartMenu startMenu = new StartMenu();
            startMenu.setVisible(true);//start menu from another class
            runBot();
	}
        
        
        public static void runBot(){

            
//                PlayInterface playInter = new PlayInterface();
//                playInter.setVisible(true);
//		StartMenu startMenu = new StartMenu();
//                startMenu.setVisible(true);

		String response;

//		Scanner sc = new Scanner(System.in);
		Random generator = new Random();


			System.out.println("Choose Rock or Paper or Scissors");
			int random = generator.nextInt(3) + 1;

			if (random == 1)
				bot = "Rock";
			else if (random == 2)
				bot = "Paper";
			else if (random == 3)
				bot = "Scissors";

//			System.out.print("Choose: ");
//			choose = sc.next();

			System.out.printf("Bot: %s%n", bot);
		
        }
        public void runChoose(){
            if (choose.equalsIgnoreCase(bot)) {
				System.out.printf("TIE!%n");
                                messageAlert("TIE!");

			} else if (choose.equalsIgnoreCase("Rock")) {
				if (bot.equals("Scissors"))
					printWin();
				if (bot.equals("Paper"))
					printLose();

			} else if (choose.equalsIgnoreCase("Paper")) {
				if (bot.equals("Rock"))
					printWin();
				else if (bot.equals("Scissors"))
					printLose();

			} else if (choose.equalsIgnoreCase("Scissors")) {
				if (bot.equals("Paper"))
					printWin();
				else if (bot.equals("Rock"))
					printLose();
			} else
				System.out.println("Invalid user input.");

////			String aog = sc.next();
//			if (aog.equalsIgnoreCase("Again"))
//				;
//			else if (aog.equalsIgnoreCase("Quit")) {
//				System.out.print("GG GoodBye");
//				break;
//			} else {
//				System.out.print("What ,Again?");
//				System.out.println();
//			}

        }
        public static void messageAlert(String name){
            JOptionPane.showMessageDialog(null, name ,"Result", 2);
            runBot();
        }
        
}