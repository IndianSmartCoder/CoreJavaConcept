package com.javatpoint.basic.controlstatement;

import java.util.Scanner;

public class AdventureWithWife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Adventure with Your Wife'!");
        System.out.println("Today, you and your wife embark on an exciting journey.");

        // Character introduction
        System.out.print("Enter your name: ");
        String husbandName = scanner.nextLine();
        System.out.print("Enter your wife's name: ");
        String wifeName = scanner.nextLine();

        System.out.println("\nHello " + husbandName + " and " + wifeName + "! Let's begin your adventure.\n");

        // Scenario 1: Choosing a location
        System.out.println("You both have a day off. Where would you like to go?");
        System.out.println("1. A mysterious forest");
        System.out.println("2. A sunny beach");
        System.out.println("3. A shopping mall");
        System.out.print("Enter your choice (1/2/3): ");
        int locationChoice = scanner.nextInt();

        if (locationChoice == 1) {
            System.out.println("\nYou both venture into a mysterious forest. The air is cool, and the trees whisper secrets.");
            System.out.println("Suddenly, you encounter a magical talking deer who offers you two options:");
            System.out.println("1. Take a golden treasure.");
            System.out.println("2. Ask for a secret spell.");
            System.out.print("Enter your choice (1/2): ");
            int forestChoice = scanner.nextInt();

            if (forestChoice == 1) {
                System.out.println("\nThe deer gives you a chest filled with gold. You're rich now! " + wifeName + " is thrilled!");
            } else {
                System.out.println("\nThe deer teaches you a spell to turn invisible. " + wifeName + " suggests you play pranks on friends!");
            }

        } else if (locationChoice == 2) {
            System.out.println("\nYou both head to a sunny beach. The waves are inviting, and the sky is clear.");
            System.out.println("You notice a boat offering two activities:");
            System.out.println("1. Go for a thrilling jet ski ride.");
            System.out.println("2. Relax with a romantic sunset cruise.");
            System.out.print("Enter your choice (1/2): ");
            int beachChoice = scanner.nextInt();

            if (beachChoice == 1) {
                System.out.println("\nThe jet ski ride is exhilarating! " + wifeName + " screams in joy as you race across the waves.");
            } else {
                System.out.println("\nThe sunset cruise is magical. You both enjoy the serene beauty of the sea, holding hands.");
            }

        } else if (locationChoice == 3) {
            System.out.println("\nYou head to the shopping mall. It's crowded, but the shops are full of amazing items.");
            System.out.println(wifeName + " wants to check out the clothing section, while you notice a tech gadgets store.");
            System.out.println("1. Go shopping for clothes with your wife.");
            System.out.println("2. Convince her to explore the tech gadgets store with you.");
            System.out.print("Enter your choice (1/2): ");
            int mallChoice = scanner.nextInt();

            if (mallChoice == 1) {
                System.out.println("\n" + wifeName + " is delighted as you help her choose outfits. She says you're the best husband ever!");
            } else {
                System.out.println("\n" + wifeName + " reluctantly agrees to check out the gadgets. You find a cool smartwatch, and she ends up liking it!");
            }

        } else {
            System.out.println("\nInvalid choice! The day passes by, and you both decide to stay home and watch a movie instead.");
        }

        // End of the game
        System.out.println("\nThank you for playing 'Adventure with Your Wife'! We hope you both had fun, " + husbandName + " and " + wifeName + "!");
        scanner.close();
    }
}
