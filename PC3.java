package khanisareviewassingment;

/*
This program takes in 4 players names, shots taken and shots made
then produces an output of the best player based on percentage of made shots
 */
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.InputMismatchException;

public class PC3 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        char[] type = {'s', 'd'};
        double bestScore = 0;
        String bestPlayer = "";                 //Initializing variables
        for (int i = 0; i < 4; i++) {
            String in = "";
            String s = "";
            String m = "";
            String name = "";
            boolean checker = false;

            while (checker == false) {
                System.out.printf("Enter Player %d name and stats: ", i + 1);
                in = kbd.nextLine();        //Prompting user for input of Player name and stats
                StringTokenizer tokens = new StringTokenizer(in, " ");      //tokenizing input
                if (tokens.countTokens() < 3) {     //checking for correct amount of expected tokens
                    checker = false;
                } else {
                    while (tokens.hasMoreElements()) {  //Assingining tokens to variables
                        name = tokens.nextToken();
                        s = tokens.nextToken();
                        m = tokens.nextToken();
                    }
                    boolean checkName = check(name, (type[0]));     //sending tokens to input verification method
                    boolean checkS = check(s, (type[1]));
                    boolean checkM = check(m, (type[1]));

                    if (checkName == true && checkS == true && checkM == true) {     //Process based on if input was correct or not
                        checker = true;
                    } else {
                        System.out.printf("RE-ENTER Player %d name and stats:\n", i + 1);
                        checker = false;
                    }

                    double shots = Double.parseDouble(s);       //Parsing the values to doubles
                    double makes = Double.parseDouble(m);
                    if (makes > shots) {
                        checker = false;
                    } else {
                        double score = (makes / shots) * 100;
                        score = Math.round(score * 100.0) / 100.0;  //Calculating the scoring percentage
                        System.out.print(name + " - ");
                        System.out.printf("%.2f \n", score);        //Printing out player name and score
                        if (score > bestScore) {            //Keeping track of best player based on previous highest score
                            bestScore = score;
                            bestPlayer = name;
                        }
                    }
                }
            }
            System.out.printf(bestPlayer + " is the best player.\n");       //Printing out the best player 

        }
    }

    public static boolean check(String tokenTest, char type) {      //Input verification method
        boolean check = false;

        switch (type) {
            case 's':            //Test trial for String
                if (tokenTest.charAt(0) >= 65 && tokenTest.charAt(0) <= 122) {
                    check = true;
                }
                break;

            case 'i':       //Test trial for INT    
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

            case 'd':       //Test trial for DOUBLE
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
