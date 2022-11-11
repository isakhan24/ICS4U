package khanisareviewassingment;

/*
This program takes in results from a Rock Paper Scissors game
and produces the winner and a count of how many ties took place in the game
 */
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.InputMismatchException;

public class PC1 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String enter = ("Enter GAMES seperated by spaces: "); //initializing variables
        String Round = "";
        char[] type = {'s'};
        boolean game = true;
        while (game == true) {

            boolean check = false;
            while (check != true) {

                System.out.print(enter);        //prompting for user input
                Round = kbd.nextLine().toUpperCase();
                if (Round.equalsIgnoreCase("Q")) {      //checking if input is user quit command
                    game = false;
                }

                int p1Counter = 0;
                int p2Counter = 0;
                int tieCount = 0;
                StringTokenizer tokens = new StringTokenizer(Round, " ");       //tokenizing input
                boolean checkIn = check(tokens.toString(), (type[0]));          //sending input to input verification method
                if (tokens.countTokens() < 1) {
                    checkIn = false;
                } else {                //checking whether input conditions are met or not
                    if (checkIn != true) {
                        check = false;

                    } else {
                        check = true;
                    }

                    while (tokens.hasMoreElements()) {
                        String result = tokens.nextToken();
                        if (result.length() == 2) {
                            int RPSCheck = RPSChecker(result);   //Sending each token to winner checking method
                            if (RPSCheck == 1) {        //Tracking score of player 1, player 2 and tie
                                p1Counter++;
                            } else if (RPSCheck == 2) {
                                p2Counter++;
                            } else {
                                tieCount++;
                            }
                        }
                    }
                    if (p1Counter > p2Counter) {
                        System.out.println("PLAYER ONE " + tieCount);       //Outputting the winner and tieCount
                    } else if (p2Counter > p1Counter) {
                        System.out.println("PLAYER TWO " + tieCount);

                    } else if (p1Counter == 0 && p2Counter == 0 && tieCount == 0) {
                    } else if (p1Counter > 0 && p2Counter > 0 && p1Counter == p2Counter) {
                        System.out.println("TIE " + tieCount);
                    }
                }
            }

        }
        System.exit(0);     //Exit based on if user input meets quit criteria

    }

    public static int RPSChecker(String result) {   //Method comparing the two values of token to determine round winner
        int winner = 0;
        if (result.charAt(0) == 'R') {    //Possibilities  
            switch (result) {
                case "RR":
                    winner = 0;
                    break;
                case "RP":
                    winner = 2;
                    break;
                case "RS":
                    winner = 1;
                    break;
                default:
            }
        } else if (result.charAt(0) == 'P') {
            switch (result) {
                case "PR":
                    winner = 1;
                    break;
                case "PP":
                    winner = 0;
                    break;
                case "PS":
                    winner = 2;
                    break;
                default:
            }
        } else {
            switch (result) {
                case "SR":
                    winner = 2;
                    break;
                case "SP":
                    winner = 1;
                    break;
                case "SS":
                    winner = 0;
                    break;
                default:
            }

        }
        return winner;
    }

    public static boolean check(String tokenTest, char type) {      //Input verification method
        boolean check = false;

        switch (type) {
            case 's':       //Case for if input is expected to be a String
                try {
                    if (tokenTest.charAt(0) >= 65 && tokenTest.charAt(0) <= 122) {
                        check = true;
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    check = false;
                }
                break;

            case 'i':   //Test trial for INT
                try {
                    int i = Integer.parseInt(tokenTest);
                    if (i <= 0) {
                        check = false;
                    } else {
                        check = true;
                    }
                    break;
                } catch (NumberFormatException e) {
                    check = false;
                    break;
                }

            case 'd'://Test trial for DOUBLE
                try {
                    double d = Double.parseDouble(tokenTest);
                    if (d < 0) {
                        check = false;
                    } else {
                        check = true;
                    }
                    break;
                } catch (NumberFormatException e) {
                    check = false;
                    break;
                }
            default:

        }
        //Return whether the Input is correct or incorrect
        return check;
    }
}
