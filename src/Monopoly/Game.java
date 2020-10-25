package Monopoly;

import java.util.Scanner;

public class Game {

    private static Players p1;
    private static Players p2;
    private static Players currentPlayer;
    static Scanner sc = new Scanner(System.in);


    private static void inputPlayerNames() {
        System.out.println("rules for Monopoly: \n" +
                "1. You start with 1000 points, when you hit 3000 points, you will win the game\n" +
                "2. If you land on the Werewall, you'll get an extra turn \n");

        System.out.println("Player 1, type in your name: ");
        p1 = new Players(sc.next()); // Player 1 write name
        System.out.println("Welcome " + p1.getNavn());

        System.out.println("Player 2, type in your name: ");
        p2 = new Players(sc.next()); // Player 2 write name
        System.out.println("Welcome " + p2.getNavn());



        // vælg mellem 6 og 12 siddet terning

        System.out.println("Are you ready to start the game? '(y/n)'");
        sc.next(); // Ask if the players are ready to play the game.


    }



}
