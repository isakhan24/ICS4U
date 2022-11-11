package khanisareviewassingment;

/*
This program takes in a string input and produces an output with the letters
and their counts being placed in an output
 */
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.InputMismatchException;

public class PC2 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        boolean run = true;

        while (run == true) {   //Continuing loop until user opts for STOP
            String in = " ";
            char[] type = {'s'};        //decleration of variables
            boolean checker = false;
            while (checker == false) {
                System.out.print("INPUT: ");
                in = kbd.nextLine().toUpperCase();  //grabbing input from user
                boolean inCheck = check(in, (type[0]));     //sending to input checking method 
                if (inCheck == true) {      //if input is valid to continue on
                    checker = true;
                } else {
                    checker = false;        //prompting for new input if input is invalid 
                    System.out.println("RE-Enter valid String");
                }

            }
            if (in.equalsIgnoreCase("STOP")) {      //Sequence if user tries to quit the program
                run = false;
            } else {
                String output = "";
                char letter = ' ';
                for (int i = 0; i < 26; i++) {      //Incrementing to check for the next letter of the alphabet
                    int counter = 0;
                    for (int length = 0; length < in.length(); length++) {      //Incrementing to check each character of the string
                        if (in.charAt(length) == (65 + i)) {        //Tracking how many of certain character was found
                            counter++;
                        }

                    }
                    if (counter > 0) {      //Adding to the ouput string if letter was found in input
                        letter = (char) (i + 65);
                        output = output + letter + "-" + counter + ":";
                    }
                }
                output = output.substring(0, output.length() - 1);      //Outputing letters and counts found in the input string
                System.out.println("OUTPUT: " + output);
            }
        }
        System.exit(0);
    }

    public static boolean check(String tokenTest, char type) {  //input checking method
        boolean check = false;

        switch (type) {
            case 's':       //Test trial for String
                try {
                    if (tokenTest.charAt(0) >= 65 && tokenTest.charAt(0) <= 122) {
                        check = true;
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    check = false;
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
