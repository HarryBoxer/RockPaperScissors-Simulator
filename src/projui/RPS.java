package projui;

import java.util.Random;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RPS {

    public static String choose = "";
    public static int win ;
    public static int health ;
    static String bot = "";

    public static void random(int random, String bot) {
        if (random == 1) {
            bot = "Rock";
        } else if (random == 2) {
            bot = "Paper";
        } else if (random == 3) {
            bot = "Scissors";
        } else if (random == 4) {
            bot = "Spock";
        } else if (random == 5) {
            bot = "Lizard";
        }
    }

    public static void printWin() {
        System.out.println("You win!");
        messageAlert("Bot Choose : " + bot + "\n        You win!");
    }

    public static void printLose() {
        System.out.println("You lose!");
        messageAlert("Bot Choose : " + bot + "\n        You lose!");

    }

    public static void main(String[] args) {
        StartMenu startMenu = new StartMenu();
        startMenu.setVisible(true);
        runBot();
    }

    public static void runBot() {

//      PlayInterface playInter = new PlayInterface();
//      playInter.setVisible(true);
//	StartMenu startMenu = new StartMenu();
//      startMenu.setVisible(true);
        String response;


        Random generator = new Random();

        System.out.println("Choose Rock or Paper or Scissors");
        int random = generator.nextInt(5) + 1;

        if (random == 1) {
            bot = "Rock";
        } else if (random == 2) {
            bot = "Paper";
        } else if (random == 3) {
            bot = "Scissors";
        } else if (random == 4) {
            bot = "Spock";
        } else if (random == 5) {
            bot = "Lizard";
        } 

//			System.out.print("Choose: ");
//			choose = sc.next();
        System.out.printf("Bot: %s%n", bot);

    }

    public void runChoose() {
        if (choose.equalsIgnoreCase(bot)) {
            System.out.printf("TIE!%n");
            messageAlert("Bot Choose : " + bot + "\n            TIE!");

        } else if (choose.equalsIgnoreCase("Rock")) {
            if (bot.equals("Scissors")||bot.equals("Lizard")) {
                printWin();
                win += 1;
                if (health < 3)health += 1;
        }
            if (bot.equals("Paper")||bot.equals("Spock")) {
                printLose();
                if (health > 0)health -= 1;

                    
            }

        } else if (choose.equalsIgnoreCase("Paper")) {
            if (bot.equals("Rock")||bot.equals("Spock")) {
                printWin();
                win += 1;
                if (health < 3)health += 1;
                
            } else if (bot.equals("Scissors")||bot.equals("Lizard")) {
                printLose();
                if (health > 0)health -= 1;
                
            }

        } else if (choose.equalsIgnoreCase("Scissors")) {
            if (bot.equals("Paper")||bot.equals("Lizard")) {
                printWin();
                win += 1;
                if (health < 3)health += 1;
                
            } else if (bot.equals("Rock")||bot.equals("Spock")) {
                printLose();
                if (health > 0)health -= 1;
                
        }
            
        } else if (choose.equalsIgnoreCase("Spock")) {
            if (bot.equals("Rock")||bot.equals("Scissors")) {
                printWin();
                win += 1;
                if (health < 3)health += 1;
                
            } else if (bot.equals("Paper")||bot.equals("Lizard")) {
                printLose();
                if (health > 0)health -= 1;
        }
            
        } else if (choose.equalsIgnoreCase("Lizard")) {
            if (bot.equals("Paper")||bot.equals("Spock")) {
                printWin();
                win += 1;
                if (health < 3)health += 1;
                
            } else if (bot.equals("Rock")||bot.equals("Scissors")) {
                printLose();
                if (health > 0)health -= 1;
        }
      }
    }
//			String aog = sc.next();
//			if (aog.equalsIgnoreCase("Again"))
//				;
//			else if (aog.equalsIgnoreCase("Quit")) {
//				System.out.print("GG GoodBye");
//				break;
//			} else {
//				System.out.print("What ,Again?");
//				System.out.println();
//			}

        
        public static void messageAlert(String name){
//          JOptionPane.showMessageDialog(null, name, "Result!", win , new ImageIcon("icon.png"));
//          JOptionPane.showMessageDialog(null, "Hello", "Result!", health, icon );
            JOptionPane.showMessageDialog(null, name ,"Result!", 2);
            runBot();
        }
        }
