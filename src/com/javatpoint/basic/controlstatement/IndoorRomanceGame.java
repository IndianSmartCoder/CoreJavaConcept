package com.javatpoint.basic.controlstatement;

import java.util.Scanner;

public class IndoorRomanceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Indoor Romance with Your Wife'!");
        System.out.println("Today, you and your wife plan a romantic evening at home.");

        // Getting player details
        System.out.print("Enter your name: ");
        String husbandName = scanner.nextLine();
        System.out.print("Enter your wife's name: ");
        String wifeName = scanner.nextLine();

        System.out.println("\nHello " + husbandName + " and " + wifeName + "! Let's plan your perfect romantic evening.\n");

        // Game menu
        System.out.println("Choose an activity to start your romantic evening:");
        System.out.println("1. Cook dinner together");
        System.out.println("2. Watch a romantic movie");
        System.out.println("3. Play a board game");
        System.out.println("4. Have a heart-to-heart conversation");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        // Handling choices using switch statement
        switch (choice) {
            case 1:
                System.out.println("\nYou and " + wifeName + " decide to cook dinner together.");
                System.out.println("The kitchen becomes your playground as you chop, mix, and laugh together.");
                System.out.println(wifeName + " says, 'You're a great chef!'");
                break;

            case 2:
                System.out.println("\nYou set up a cozy corner with blankets and popcorn.");
                System.out.println("Together, you watch a classic romantic movie and enjoy each other's company.");
                System.out.println(wifeName + " whispers, 'This is such a perfect evening!'");
                break;

            case 3:
                System.out.println("\nYou both pick a fun board game to play.");
                System.out.println("The game becomes competitive, but " + wifeName + " wins with her brilliant moves.");
                System.out.println("She teases you, 'Better luck next time, " + husbandName + "!'");
                break;

            case 4:
                System.out.println("\nYou sit down and have a heart-to-heart conversation.");
                System.out.println("You share dreams, memories, and laughter, growing even closer.");
                System.out.println(wifeName + " says, 'I’m so lucky to have you.'");
                break;

            default:
                System.out.println("\nInvalid choice! Looks like you both decided to relax and enjoy a quiet evening together.");
                break;
        }

        // End of the game
        System.out.println("\nThank you for playing 'Indoor Romance with Your Wife'! Cherish every moment together.");
        scanner.close();
    }
}
