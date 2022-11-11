package khanisareviewassingment;

/*
This program takes in D C S and F integers to determine 
whether a climber can climb to the top of a mountain
D is the distance that must be climbed
C is the distance they climb every round
S is how far they slide back after the round
F is how much C is decreased by everytime
The program will output how many rounds it took climber
to either succeed or fail
 */
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.InputMismatchException;

public class PC4 {

    public static void main(String args[]) {
        Scanner kbd = new Scanner(System.in);
        char[] type = {'d'};

        boolean game = true;
        System.out.printf("Enter 4 Integers\nTo quit enter 'q'\n");     //Displaying input instructions 
        while (game == true) {
            boolean check = false;
            String d = "";      //Initializing variables
            String c = "";
            String s = "";
            String f = "";
            while (check == false) {
                System.out.print("ENTER D C S F VALUES: ");     //Prompting and grabbing user input
                String in = kbd.nextLine();
                if (in.equalsIgnoreCase("q")) {     //Checking for quit command  
                    check = true;
                    game = false;
                } else {

                    StringTokenizer tokens = new StringTokenizer(in, " ");      //Tokenizing input
                    if (tokens.countTokens() < 4) {     //Checking amount of tokens matches amount expected, not less
                        check = false;
                    } else {
                        if (tokens.hasMoreElements()) {     //Assinging Strings to the tokens
                            d = tokens.nextToken();
                        } else {
                            check = false;
                        }
                        if (tokens.hasMoreElements()) {
                            c = tokens.nextToken();
                        } else {
                            check = false;
                        }
                        if (tokens.hasMoreElements()) {
                            s = tokens.nextToken();
                        } else {
                            check = false;
                        }
                        if (tokens.hasMoreElements()) {
                            f = tokens.nextToken();
                        } else {
                            check = false;
                        }

                        boolean checkD = check(d, (type[0]));       //Sending tokens to input verification method
                        boolean checkS = check(c, (type[0]));
                        boolean checkC = check(s, (type[0]));
                        boolean checkF = check(f, (type[0]));

                        if (checkD == true && checkS == true && checkC == true && checkF == true) { //continuing only if all tokens are correct inputs
                            check = true;
                        }
                    }

                }
            }
            if (game == true) {
                double D = Double.parseDouble(d);   //Parsing input to doubles
                double C = Double.parseDouble(c);
                double S = Double.parseDouble(s);
                double F = Double.parseDouble(f);

                double h = 0;       //initial height of climber
                int counter = 0;
                boolean complete = false;
                double minusClimb = C * (F / 100);      //Setting amount removed from climb based on F value
                while (complete == false) {
                    counter++;
                    h = h + C;      //Adding climb distance to height
                    if (h >= D) {       //Checking if climber made it to the top before sliding
                        System.out.printf("SUCESS ON ATTEMPT %d\n", counter);
                        complete = true;
                    } else {
                        h = h - S;      //Climber sliding back
                        if (C > 0) {
                            C = C - minusClimb;     //Setting climb to climb minus the F percentage
                        } else {
                            C = 0;
                        }

                        if (h < 0) {    //Checking if climber slid back to 0
                            System.out.printf("FAILURE ON ATTPEMPT %d\n", counter);
                            complete = true;
                        }
                    }
                }
                check = true;
            }
        }
        System.exit(0);
    }

    public static boolean check(String tokenTest, char type) {  //Input verification method
        boolean check = false;

        switch (type) {     //Trial for String
            case 's':
                if (tokenTest.charAt(0) >= 65 && tokenTest.charAt(0) <= 122) {
                    check = true;
                }
                break;

            case 'i':       //Trial for INT
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

            case 'd':       //Trial for DOUBLE
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
