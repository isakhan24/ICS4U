package khanisabridgeit;

import java.util.Scanner;

public class KhanIsaBridgeIt {

    public static void main(String[] args) {
//Isa Khan - 10/12/2021
//ISC3U
// BridgeIt guessing game
        //One player enters a secret word and the other tries to guess it letter by letter
            System.out.println("Welcome to BridgeIt");
        char playAgain;
        do {
            Scanner keyboard = new Scanner(System.in);
            boolean foundOne; //Initialization of variables
            int dFindPos = 0;
            int aFindPos = 0;
            int counter = 0;
            String spaces = "";         //spaces for player advancement
            String dashes = "";
            String bridge = "";
            String replaceString = "/";         //replace character for alphabet
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            System.out.print("Player 1 please enter the secret word: ");           //asking for the secret word
            String secretWord = keyboard.nextLine();
            secretWord = secretWord.toLowerCase();
            int swLen = secretWord.length();
            System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            for (int numGuesses = 1; numGuesses <= secretWord.length(); numGuesses++) {     //creation of dashes for bridge & secret word
                dashes = dashes + "-";
                bridge = bridge + "-";
            }
            while (swLen > 0 && counter != secretWord.length()) {       //entering game loop
                foundOne = false;
                System.out.printf("\n\n\n\n\n");
                System.out.println(spaces + " .");              //displaying character on bridge 
                System.out.println(spaces + " T");
                System.out.println("/" + bridge + "\\");
                System.out.println("        " + alphabet);       //displaying alphabet and hyphens of secret word
                System.out.println("        " + dashes);
                System.out.print("Player 2, Guess a letter: "); //asking for guesses
                String guess = keyboard.nextLine();
                guess = guess.toLowerCase();
                dFindPos = 0;
                while (dFindPos != -1 ) {
                    dFindPos = secretWord.indexOf(guess, dFindPos);                  //searching  for guess character in the secret word
                    if (dFindPos != -1 ) {
                        String dashNew = dashes.substring(0, dFindPos) + guess + dashes.substring(dFindPos + 1);        //replacing the hyphens with characters if found in secret word
                        dashes = dashNew;
                        secretWord = secretWord.substring (0, dFindPos) + replaceString + secretWord.substring(dFindPos + 1);
                        dFindPos++;
                        spaces = spaces + " ";
                        foundOne = true; //adding one to counters of correct guesses 
                        counter++;
                    }
                    if (foundOne == false) {            //comes in effect if guess is not in the secret word
                        bridge = bridge.substring(0, bridge.lastIndexOf("-")) + "#" + bridge.substring(bridge.lastIndexOf("-") + 1);        //replacing hyphnes in the bridge with hashtags to demonstrate wrong guesses
                        swLen--;
                        System.out.println("\n\n\n");
                        System.out.println("You have " + swLen + " guesses remaining");
                    }
                    if (alphabet.indexOf(guess) == -1) {     //takes away a guess if a character has previously been guessed and is guessed again
                        foundOne = false;   
                    }
                }
                aFindPos = alphabet.indexOf(guess, aFindPos);
                if (aFindPos != -1) {                       // searching for letter in the alphabet to replace with a slash

                    alphabet = alphabet.substring(0, aFindPos) + replaceString + alphabet.substring(aFindPos + 1);
                    aFindPos = 0;                        
                }
            }
            System.out.println(spaces + " .");                  //drawing the character one last time after game is won/lost
            System.out.println(spaces + " T");
            System.out.println("/" + bridge + "\\");
            System.out.println("        " + alphabet);
            System.out.println("        " + dashes);
            if (swLen == 0) {                                   //process if you lose the game
                System.out.println("OH NO YOU GOT WET");
                System.out.println("YOU LOSE");
            }
            if (counter == secretWord.length()) {               //process if you win the game
                System.out.println("Congradulations");
                System.out.println("YOU WINNNNNN");
            }
            System.out.print("Would you like to play again (y/n)? ");               //play again question 
            playAgain = Character.toLowerCase(keyboard.next().charAt(0));   //incase input does not meet requirements
            while (playAgain != 'y' && playAgain != 'n') {
                System.out.print("Invalid input, please enter y or n: ");
                playAgain = Character.toLowerCase(keyboard.next().charAt(0));
                keyboard.close();
            }
        } while (playAgain == 'y');
        System.out.println("Thank you for playing BridgeIt!"); 
        //if play again is no, thanking the user for playing
    }
}